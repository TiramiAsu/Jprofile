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
        <script>
            var xhttp = new XMLHttpRequest();
            
            function doDelete() {
                var method = "DELETE";
                var path = "/Jprofile/servlet/controller/" + document.getElementById("deleteid").value;

                doRun(xhttp, method, path);
                console.log(path);

                xhttp.open(method, path, true);
                xhttp.send();
            }

            function doRun(xhttp, method, path) {
                xhttp.onreadystatechange = function () {
                    if (this.readyState == 4 && this.status == 200) {
                        console.log(this.responseText);
                        //document.getElementById("req_result").innerText = this.responseText;
                    }
                };
            }
        </script>
    </head>
    <body>
        <div>Manager Interface:</div>
        <form method="get" action="/Jprofile/servlet/controller">
            <fieldset>
                <legend>QueryAll Product</legend>
                <td><button type="submit" >Submit</button>
            </fieldset>
        </form>
        <form method="get" action="/Jprofile/servlet/controller">
            <fieldset>
                <legend>Select a Product</legend>
                <td><input type="text" placehorder="Select ID" name="selectid"></td>
                <td><button type="submit" >Select a Product</button>
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
        <form>
            <fieldset>
                <legend>Delete Product</legend>
                <td><input type="text" placeholder="id" id="deleteid"/>
                <td><button type="button" onclick="doDelete()">Delete</button>
            </fieldset>
        </form>
    </body>
</html>