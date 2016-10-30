package com.kaz.kazlist.main;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.File;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;

public class Main {
  private static final String DIRECTORY_CONF = "conf";
  private static final String ROOT_DIRECTORY = "com.kaz.kazlist.root.directory";
  private static final String PROPERTY_SERVER_PORT = "com.kaz.kazlist.server.port";
  private static final String KAZLIST_PROPERTIES = "kazlist.properties";

  public static void main( String[] argv ) {
  	FileInputStream fis = null;
  	Server jettyServer = null;
  	try {
  	  // get runtime properties
  	  String rootDirectory = System.getProperty( ROOT_DIRECTORY );
  	  if( ( rootDirectory == null ) || ( rootDirectory.length() < 1 ) ) {
  	  	throw new Exception( "Root directory not found." ); 
  	  }
      Properties properties = new Properties();
      fis = new FileInputStream( rootDirectory + File.separator + DIRECTORY_CONF + File.separator + KAZLIST_PROPERTIES );
      properties.load( fis );

  	  // set the server context
  	  ServletContextHandler context = new ServletContextHandler(ServletContextHandler.NO_SESSIONS);
      context.setContextPath("/");
 
      // get the server port
      String port = properties.getProperty( PROPERTY_SERVER_PORT );
      jettyServer = new Server( Integer.parseInt( port ) );
      jettyServer.setHandler( context );
      ServletHolder jerseyServlet = context.addServlet( ServletContainer.class, "/*" );
      jerseyServlet.setInitOrder(0);
 
      // tell jersey what services to load
      jerseyServlet.setInitParameter( "jersey.config.server.provider.packages", "com.kaz.kazlist.service.test" );
 
      jettyServer.start();
      jettyServer.join();
    } 
    catch (Exception e) {
      e.printStackTrace();
      System.exit( -1 );
    } 
    finally {
      try {
      	if( jettyServer != null ) {
          jettyServer.destroy();
        }
        if( fis != null ) {
          fis.close();
        }
      }
      catch( Exception ignore ) {
      }
    }
  }
} 