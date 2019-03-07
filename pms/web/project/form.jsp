<%@page import="model.ProjectModel"%>
<%@include file="../include/header.jsp" %>
<%
    ProjectModel pro = (ProjectModel) request.getAttribute("project");
    %>
<legend>Daftar Projek</legend>
<form method="post" action="/pms/project">
    <div class="row">
    <div class="col-md-1">Tajuk</div>
    <div class="col-md-4"><input value="<%= pro.getTitle() %>" class="form-control" type="text" name="Title"></div>
    </div>
    <div class="row">
    <div class="col-md-1">Keterangan</div>
    <div class="col-md-4"><textarea value="<%= pro.getDescription() %>" class="form-control" name="Description"></textarea></div>
    </div
    <div class="row">
    <div class="col-md-1">
    <div class="col-md-4"><input class="btn-primary" type="submit" name="Simpan"></div>
    </div></form>
<%@include file="../include/footer.jsp" %>
