<%@page import="model.ProjectModel"%>
<%@page import="java.util.ArrayList"%>
<%@include file="../include/header.jsp" %>

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
                <td><%= pro.getId() %></td>
                <td><%= pro.getTitle() %></td>
                <td><%= pro.getDescription() %></td>                
                <td>
                    <a href="/pms/project?id=<%= pro.getId() %>&action=edit" class="btn-success btn-sm">Edit</a>
                    <a href="/pms/project?id=<%= pro.getId() %>&action=del" class="btn-success btn-sm">Delete</a>
                </td>                
            </tr>
        <% } %>
</table>
<button class="btn btn-primary btn-lg">Click Me</button>

<%@include file="../include/footer.jsp" %>
