<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
	
</head>
<body>
<c:url var="home" value="/home"></c:url>
<c:url var="addStu" value="/student/add"></c:url>
<c:url var="showStu" value="/student/show"></c:url>

<nav class="navbar navbar-expand-md navbar-light bg-light">
	<div class="container-fluid">
		<a href="${home }" class="navbar-brand">Home</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#students" aria-controls="students" aria-expanded= "false">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="students">
			<div class="navbar-nav">
			<a href="${addStu }" class="nav-link">Add Student</a>
			<a href="${showStu }" class="nav-link">Show Students</a>
			</div>
		</div>
	</div>
</nav>