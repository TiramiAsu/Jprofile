<%-- 
    Document   : c01_jndi
    Created on : Jun 2, 2019, 12:00:24 AM
    Author     : TiramiAsu
--%>


<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Context ctx = new InitialContext();
    DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc/jwDB");
    Connection conn = ds.getConnection();
    

    Statement stmt = conn.createStatement();
//    String sql = "SELECT pd_code, pd_name, pd_price, pd_cost, pd_unit, pd_status, pd_remark, pd_ts FROM JAVAWEB.ICPRODUCTS";
//    String sql = "SELECT pd_code, pd_name, pd_price, pd_cost, pd_unit, pd_status, pd_remark FROM JAVAWEB.ICPRODUCTS";
      String sql = "SELECT * FROM JAVAWEB.ICPRODUCTS WHERE PD_CODE = 'A007'";
    ResultSet rs = stmt.executeQuery(sql);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TEST jndi</title>
        <style>th,td{border: 1px solid;}</style>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>pd_code</th>
                    <th>pd_name</th>
                    <th>pd_price</th>
                    <th>pd_cost</th>
                    <th>pd_unit</th>
                    <th>pd_status</th>
                    <th>pd_remark</th>
                    <!--<th>pd_ts</th>-->
                </tr>
            </thead>
            <tbody>
                <%
                    while (rs.next()) {
                        String pd_code      = rs.getString("pd_code");
                        String pd_name      = rs.getString("pd_name");
                           int pd_price     = rs.getInt("pd_price");
                           int pd_cost      = rs.getInt("pd_cost");
                        String pd_unit      = rs.getString("pd_unit");
                        String pd_status    = rs.getString("pd_status");
                        String pd_remark    = rs.getString("pd_remark");
//                        String pd_ts        = rs.getString("pd_ts");
                %>
                <tr>
                    <td><%=pd_code%></td>
                    <td><%=pd_name%></td>
                    <td><%=pd_price%></td>
                    <td><%=pd_cost%></td>
                    <td><%=pd_unit%></td>
                    <td><%=pd_status%></td>
                    <td><%=pd_remark%></td>
                    <!--<td>pd_ts</td>-->
                </tr>
                <%
                    }
                    conn.close();
                %>
            </tbody>
        </table>

    </body>
</html>

