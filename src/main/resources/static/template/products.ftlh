<html>
    <head>
        <title>Hello from Freemarker</title>
    </head>
    <body>
        <div id="content">
            <table class="datatable">
                <tr>
                    <th>name</th> <th>price</th> <th>supplier</th>
                </tr>
                <#list model["products"] as product>
                    <tr>
                       <td>${product.name}</td> <td>${product.price}</td>
                       <td>${product.supplier.name}</td>
                    </tr>
                </#list>
            </table>
            <div id="form">
                <fieldset>
                    <legend>Add Product</legend>
                    <form name="InsertProduct" action="/insert-product" method="post">
                        Product name : <input type="text" name="name" />	<br/>
                        Product price : <input type="text" name="price" />	<br/>
                        Product vendor : <input type="text" name="vendor_code" />	<br/>
                        <input type="submit" value="   Save   " />
                    </form>
                </fieldset>
            </div>
        </div>
    </body>
</html>