<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>A Simple Web Application</title>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
</head>
<body>
<a href="https://github.com/StanisS/SimpleWebApplication">User List</a>

	<h1>${title}</h1>
	<p>
		<c:if test="${not empty msg}">
			${msg}
		</c:if>

		<c:if test="${empty msg}">
			Welcome Welcome!
		</c:if>
	</p>
	<a href="http://localhost:8080">Home</a>

<footer>
	<p>2016 Stanislav Stepanov</p>
</footer>

</body>
</html>