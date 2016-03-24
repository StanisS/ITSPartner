<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>A Simple Web Application</title>
    <%--<spring:url value="/resources/core/css/jquery.dataTables.min.css" var="dataTablesCss"/>--%>
    <%--<link href="${dataTables}" rel="stylesheet"/>--%>
    <link href="https://cdn.datatables.net/1.10.11/css/jquery.dataTables.min.css" rel="stylesheet"/>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>

    <%--<spring:url value="/resources/core/css/jquery.dataTables.min.js" var="dataTablesJs"/>--%>
    <%--<script src="${dataTablesJs}"></script>--%>
    <script src="https://cdn.datatables.net/1.10.11/js/jquery.dataTables.min.js"></script>


    <script>
        $(document).ready(function () {
            $('.display').DataTable();
        });
    </script>
</head>
<body>
<a href="http://localhost:8080">Home</a>

<table id="userTable" class="display">
    <thead>
    <tr>
        <th>Column 1</th>
        <th>Column 2</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>Row 1 Data 1</td>
        <td>Row 1 Data 2</td>
    </tr>
    <tr>
        <td>Row 2 Data 1</td>
        <td>Row 2 Data 2</td>
    </tr>
    </tbody>
</table>

<hr>
<footer>
    <p>2016 Stanislav Stepanov</p>
</footer>

</body>
</html>