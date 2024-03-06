<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/commons/header.jsp"></jsp:include>


<c:url var="studentSave" value="/student/student-save"></c:url>
<div class="container">
<div class="row justify-content-center">


	<fieldset>
		<legend>Add Student</legend>
		<form action="${studentSave }" class="form w-50" method="post">
			<div class="mb-3">
				<label for="" class="form-label">Student Name</label>
				<input type="text" class="form-control" name = "name" />
			</div>
			<div class="mb-3">
				<label for="" class="form-label">Email</label>
				<input type="text" class="form-control" name ="email"/>
			</div>
			<div class="mb-3">
				<label for="" class="form-label">Date Of Birth</label>
				<input type="date" class="form-control" name="date" />
			</div>
			<div class="mb-3">
				<input type="submit" class="btn btn-primary" value="Save"/>
			</div>
		</form>
	</fieldset>
</div>
</div>


<jsp:include page="/commons/footer.jsp"></jsp:include>