<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<jsp:include page="/commons/header.jsp"></jsp:include>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<ul>
	<li>
		<h3 class="text-success">Arathmetic Expression</h3>
		<ul>
			<li>20/5 of result is : ${20 % 5}</li>
			<li>21%5 of result is : ${21 mod 5 }</li>
		</ul>
	</li>
	<li>
		<h3 class="text-success">Relation Expression</h3>
		<ul>
			<li>3 <= 5 of result is : ${ 3 le 5 }</li>
			<li>3 != 5 of result is : ${3 != 5 }</li>
		</ul>
	</li>
	<li>
		<h3 class="text-success">Logical Expression</h3>
		<ul>
			<li>7 > 5 && 5 < 6 of result is : ${7 gt 5 and 5 lt 6 }</li>
			<li>5 != 6 of result is : ${ 5 != 6 }</li>
		</ul>
	</li>

	<li>
		
		
		<h3 class = "text-success">Show elements from array</h3>
		<ul>
			<c:forEach items="${users }" var="user" varStatus="n">
				<li>${n.index+1}.Name :${user.name } email :${user.email }</li>
			</c:forEach>
			
		</ul>
		
	</li>
</ul>
<jsp:include page="/commons/footer.jsp"></jsp:include>