<%@page import="model.ProjectModel"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../include/header.jsp" %>

<%--<a href="pms/project/form.jsp" class="btn btn-info btn-sm"></a>--%>
<form method="post" action="/pms/project">
<div class="row">
    <div class="col-md-1">Title</div>
    <div class="col-md-2"><input type="text" name="title" class="form-control"></div>
    <div class="col-md-1">Description</div>
    <div class="col-md-2"><input type="text" name="description" class="form-control"></div>
    <div class="col-md-2"><input type="submit" name="search" value="Search" class="btn btn-primary"></div>
</div>
</form>
<table class="table table-bordered">
    <tr>
        <td>Bil</td>
        <td>Tajuk</td>
        <td>Keterangan</td>
        <td>Tindakan</td>
    </tr>
    <%
        ArrayList list = (ArrayList)request.getAttribute("list");
        for (int i=0; i<list.size(); i++) {
            ProjectModel pro = (ProjectModel)list.get(i);
            %>
            <tr>
                <td><%= i+1 %></td>
                <td><%= pro.getTitle() %></td>
                <td><%= pro.getDescription() %></td>                
                <td>
                    <a href="/pms/project?id=<%= pro.getId() %>&action=edit" class="btn-success btn-sm">Edit</a>
                    <a href="/pms/project?id=<%= pro.getId() %>&action=del" class="btn-success btn-sm">Delete</a>
                </td>                
            </tr>
        <% } %>
</table>
        <%--<button class="btn btn-primary btn-lg">Add</button>--%>
<a href="/pms/project/form.jsp" class="btn btn-info btn-sm">Add</a>

<%@include file="../include/footer.jsp" %>
