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
        <div>Manager Interface:</div>
        <form method="get" action="/Jprofile/servlet/controller">
            <fieldset>
                <legend>QueryAll Product</legend>
                <td><button type="submit" >Submit</button>
            </fieldset>
        </form>
        <form method="post" action="/Jprofile/servlet/controller">
            <fieldset>
                <legend>Create Product</legend>
                <table>
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
                        <td>
                            <input  type="radio" name="status" value="1">販售中
                            <input  type="radio" name="status" value="0">停售
                        </td>
                    </tr>
                    <tr>
                        <td>Category</td>
                        <td>
                            <select name="category">
                                <option value="0=請選擇">---請選擇---</option>
                                <option value="1=主餐類">主餐類</option>
                                <option value="2=副餐類">副餐類</option>
                                <option value="3=甜品">甜品</option>
                                <option value="4=飲品">飲品</option>
                            </select>
                        </td>
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
        <form method="delete" action="/Jprofile/servlet/controller">
            <fieldset>
                <legend>Delete Product</legend>
                <td><input type="text" placeholder="id"/>
                <td><button type="submit" >Delete</button>
            </fieldset>
        </form>
    </body>
</html>