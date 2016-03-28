<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>A Simple Web Application</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/core/css/jquery.dataTables.min.css"/>
    <%--<link href="https://cdn.datatables.net/1.10.11/css/jquery.dataTables.min.css" rel="stylesheet"/>--%>

    <spring:url value="/resources/core/js/jquery.min.js" var="jqueryJs"/>
    <script src="${jqueryJs}"></script>
    <%--<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>--%>

    <spring:url value="/resources/core/js/jquery.dataTables.min.js" var="dataTablesJs"/>
    <script src="${dataTablesJs}"></script>

    <spring:url value="/resources/core/js/userTable.js" var="dataTablesJs"/>
    <script src="${dataTablesJs}"></script>

</head>
<body>
<a href="/">Home</a>

<table id="userTable" class="display" cellspacing="0" width="100%">
    <thead>
    <tr>
        <th>Name</th>
        <th>Position</th>
        <th>Office</th>
        <th>Age</th>
        <th>Start date</th>
        <th>Salary</th>
    </tr>
    </thead>

    <tbody>
    </tbody>
</table>

<hr>
<footer>
    <p>2016 Stanislav Stepanov</p>
</footer>

</body>
</html>