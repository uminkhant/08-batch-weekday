<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/commons/header.jsp"></jsp:include>
	<h3 class="text-primary">Show Student</h3>
	
	<c:if test="${null != students && !empty students }">
	<c:forEach var="st" items="${students }">
		<p>${st.name}</p>
	</c:forEach>
</c:if>
<jsp:include page="/commons/footer.jsp"></jsp:include>