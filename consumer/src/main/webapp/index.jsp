<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script language="JavaScript" src="js/jquery-1.8.3.js"></script>
    <script language="JavaScript">
        $(function(){
            $("#table1 tr:odd").css("background-color","red");
            $("#table1 tr:even").css("background-color","yellow");
        });
    </script>
</head>
<body>
<table id="table1">
    <tr>
        <td>区域的编号</td>
        <td>区域名称</td>
    </tr>
    <c:forEach var="d" items="${list}">
        <tr>
            <td>${d.id}</td>
            <td>${d.name}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>