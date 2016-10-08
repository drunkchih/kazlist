#Radium Datagrid

######A Material Design inspired data grid element for Polymer.js apps.

This element uses, as an initial foundation, the Google Material Design specification for data tables:
[Data Tables](https://www.google.com/design/spec/components/data-tables.html)

However, the goal of the element is to support much richer _data grid_ functionality, so there will be necessary
deviations or extrapolations, as features that are not included in the specification are added to this element.

### Simple Example:

    <radium-datagrid items="[[_myItems]]">
      <template>
        <radium-datagrid-column id="foo" header="Foo"><span>[[row.foo]]</span></radium-datagrid-column>
        <radium-datagrid-column id="bar" header="Bar"><span>[[row.bar]]</span></radium-datagrid-column>
        <radium-datagrid-column id="baz" header="Baz"><span>[[row.baz]]</span></radium-datagrid-column>
      </template>
    </radium-datagrid>

A row will be rendered for each item of the collection, and the _row_ property will be available for the template of each
column.

### Demos

####[Basic configurations](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index.html)
Column width, alignment, and grid line/color options. Column sorting also demonstrated.

####[Paging footer](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index2.html)
Optional footer with paging controls.

####[Item selection](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index3.html)
Single selection and multi-selection examples (both cross-device and desktop specific).

####[Fixed header](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index4.html)
Example of fixed column headers with scrolling rows.

####[Infinite scroll](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index5.html)
Simple infinite scroll example.

####[Infinite scroll 2](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index6.html)
Infinite scroll within a fixed height container with fixed headers.

####[Column Filters](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/index7.html)
Toggle inputs on column headers to filter data.

###License
MIT Licensed
