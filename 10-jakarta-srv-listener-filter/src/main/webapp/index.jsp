<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>

<style>
.body {
	padding: 5px;
	align-items: center;
}

.txt-color {
	color: green;
	padding-right: 20px;
}

.anchor {
	color: green;
	text-decoration: none;
}

.fieldset {
	display: flex;
	justify-content: flex-start;
	width: 300px;
}
.input-group{
	padding-bottom: 5px;
}

.btn {
	margin-left: 80px;
	border-radius: 10px;	
}
</style>
</head>
<body>
	<div class="body">
		<h1>Servlet listener & Filter</h1>
		<ul>
			<li style="padding-bottom: 5em;">
				<h3>Listener</h3>
				<ul>
					<li><a href="/listener/add" class="anchor">Attribute added</a></li>
					<li><a href="/listener/replaced" class="anchor">Attribute
							replaced</a></li>
					<li><a href="/listener/removed" class="anchor">Attribute
							removed</a></li>
				</ul>
			</li>
			<li>
				<fieldset class="fieldset">
					<legend>Filter Test</legend>
					<form action="" class="form" method="post">
						<div class="input-group">
							<label class="txt-color" for="user">User Name</label><input
								type="text" name="user" />
						</div>
						<div  class="input-group">
							<label class="txt-color" for="user">Password</label><input
								type="text" name="pass" />
						</div>
						<div  class="input-group">
							<button class="btn">Submit</button>
						</div>
					</form>
				</fieldset>
			</li>
		</ul>
	</div>
</body>
</html>