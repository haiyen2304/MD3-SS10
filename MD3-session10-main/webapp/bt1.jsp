<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/07/2024
  Time: 9:34 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Danh sach khach hang</h1>
    <table>
        <tr>
            <th>Ten</th>
            <th>Ngay Sinh</th>
            <th>Dia Chi</th>
            <th>Anh</th>
        </tr>
        <c:forEach items="${customers}" var="cus">
        <tr>
            <td>${cus.name}</td>
            <td>${cus.formatDate()}</td>
            <td>${cus.address}</td>
            <td><img src="${cus.picture}" style="width: 100px; height: 100px;"></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
