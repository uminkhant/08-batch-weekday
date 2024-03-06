
<%@page import="com.jdc.mkt.User"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/commons/header.jsp"></jsp:include>

<c:url var="save" value="/user/save">
	<c:param name="formName" value="jstl"></c:param>
</c:url>
<fieldset>
	<legend class="text-primary"> JSTL Insert Form </legend>
	<form action="${save }" class="form w-50" method="post">
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

<c:choose>
	<c:when test="${!empty users }">
		<table class="table">
			<thead>
				<tr>
					<th>No.</th>
					<th>Name</th>
					<th>Email</th>
					<th>Password</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users }" var="user" varStatus="l">
				<tr>
					<td class="text-primary">${l.index+1 }</td>
					<td class="text-primary"><c:out value="${user.name }"></c:out></td>
					<td class="text-primary"><c:out value="${user.email }"></c:out> </td>
					<td class="text-primary"><c:out value="${user.password }"></c:out> </td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:when>
	<c:otherwise>
		<p class="text-success">There is no table yet !</p>
	</c:otherwise>
</c:choose>
<jsp:include page="/commons/footer.jsp"></jsp:include>