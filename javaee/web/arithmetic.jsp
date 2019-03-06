<%-- 
    Document   : arithmetic
    Created on : Mar 6, 2019, 2:53:01 PM
    Author     : Pengguna PC 12
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        1 + 2 = ${1 + 2}
        <hr>
        <h1>Scriptlet</h1>
        <%
            String name = "Azman Zakaria";
            out.println(name);
            out.println(cetak(5));
            %>
        <%!
            public String cetak(int bil) {
            String str = "";
            for (int i=0; i<bil; i++) {
                str += i + "--";
            }
            return str;
        }
        %>
        <hr>
        <h1>JSP Expression</h1>
        Tarikh Hari ini ialah <%= new java.util.Date() %>
        <hr>
        <h1>JSP Directive</h1>
        <%@include file="form.html" %>
    </body>
</html>
