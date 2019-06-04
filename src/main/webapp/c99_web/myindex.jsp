<%-- 
    Document   : myindex
    Created on : Jun 4, 2019, 9:12:16 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>c99_WEB</title>
    </head>
    <body>
        <form method="get" action="/Jprofile/servlet/controller">
            <fieldset>
                <legend>Manager Interface:</legend>
                <table>
                    Create Product:<p>
                    <tr>
                        <td>Code</td>
                        <td><input type="text" name="code" placeholder="A001"></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="name" placeholder="Hanburger"></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><input type="number" name="price" placeholder="50"></td>
                    </tr>
                    <tr>
                        <td>Cost</td>
                        <td><input type="number" name="cost" placeholder="21"></td>
                    </tr>
                    <tr>
                        <td>Unit</td>
                        <td><input type="text" name="unit" placeholder="個"></td>
                    </tr>
                    <tr>
                        <td>Status</td>
                        <td><input type="text" name="status" placeholder="販賣中"></td>
                    </tr>
                    <tr>
                        <td>Remark</td>
                        <td><input type="text" name="remark" placeholder="備註"></td>
                    </tr>
                    <tr>
                        <td><button type="submit" >Submit</button></td>
                        <td><input type="reset" /></td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
