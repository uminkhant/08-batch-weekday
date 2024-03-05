
<%@page import="com.jdc.mkt.User"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<jsp:include page="/commons/header.jsp"></jsp:include>


<fieldset>
	<legend class="text-primary">Insert Form </legend>
	<form action="/user-save" class="form w-50" method="post">
		<div class="form-group">
			<label for="" class="text-secondary">User name:</label> <input
				type="text" class="form-control" name="name" />
		</div>
		<div class="form-group">
			<label for="" class="text-secondary">Email:</label> <input
				type="text" class="form-control" name="email" />
		</div>
		<div class="form-group">
			<label for="" class="text-secondary">Password:</label> <input
				type="text" class="form-control" name="pass" />
		</div>
		<input class="btn btn-primary mt-2" type="submit"></input>
	</form>
</fieldset>

<%
List<User> list = (List<User>) request.getAttribute("list");
if (!list.isEmpty() && null != list) {
%>
<table class="table">
	<thead>
		<tr>
			<th class="col">No</th>
			<th class="col">Name</th>
			<th class="col">Password</th>
		</tr>
	</thead>
	<tbody>

		<%
		for (User u : list) {
		%>
		<tr>
			<td class="col"><%=u.getName()%></td>
			<td class="col"><%=u.getEmail()%></td>
			<td class="col"><%=u.getPassword()%></td>
		</tr>
		<%
		}
		%>
	</tbody>
</table>
<%}%>
<jsp:include page="/commons/footer.jsp"></jsp:include>