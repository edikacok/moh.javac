<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="/pms/asset/bootstrap/css/bootstrap.css">
        <title>PMS Login</title>
    </head>
    <body>
        <%
            String no = request.getParameter("no");
            if (no != null) {
                out.print("<div class'alert-denger'>Wrong Staff Id and Password</div>");
            }
            %>
        <div class="col-md-6" style="background-color: #e83e8c;">
        <form method="post" action="/pms/login">
            <div>Staff ID</div>
            <div><input type="text" name="staff_id" class="form-control"></div>
            <div>Password</div>
            <div><input type="password" name="pwd" class="form-control"></div>
            <div><input type="submit" value="Sigin" class="btn btn-primary"></div>
        </form>
            </div>
    </body>
</html>
