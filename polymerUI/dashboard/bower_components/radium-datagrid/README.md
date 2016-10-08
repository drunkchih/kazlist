#Radium Datagrid

######A Material Design inspired data grid element for Polymer.js apps.

This element uses, as an initial foundation, the Google Material Design specification for data tables:
[Data Tables](https://www.google.com/design/spec/components/data-tables.html)

However, the goal of the element is to support much richer _data grid_ functionality, so there will be necessary
deviations or extrapolations, as features that are not included in the specification are added to this element.

### Simple Example:

    <radium-datagrid items="[[_myItems]]">
      <template>
        <radium-datagrid-row>
          <radium-datagrid-column id="foo" header="Foo"><span>[[row.foo]]</span></radium-datagrid-column>
          <radium-datagrid-column id="bar" header="Bar"><span>[[row.bar]]</span></radium-datagrid-column>
          <radium-datagrid-column id="baz" header="Baz"><span>[[row.baz]]</span></radium-datagrid-column>
        </radium-datagrid-row>
      </template>
    </radium-datagrid>

A row will be rendered for each item of the collection, and the _row_ property will be available for the template of each
column.

### Demos

####[Basic configurations](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/configs.html)
Column width, alignment, and grid line/color options. Column sorting also demonstrated.

####[Data Loading States](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/dataload.html)
Shows the various states of the grid initial, loading, loaded, and no records

####[Paging footer](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/paging.html)
Optional footer with paging controls.

####[Item selection](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/selection.html)
Single selection and multi-selection examples (both cross-device and desktop specific).

####[Infinite scroll](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/infinitescroll.html)
Simple infinite scroll example.

####[Column Filters](http://jasongardnerlv.github.io/radium-datagrid/components/radium-datagrid/demo/filters.html)
Toggle inputs on column headers to filter data.

###License
MIT Licensed
