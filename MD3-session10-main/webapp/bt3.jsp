<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/07/2024
  Time: 11:52 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>STT</th>
            <th>NAME</th>
            <th>IMAGE</th>
            <th>PRICE</th>
            <th>STOCK</th>
            <th colspan="2">ACTION</th>
        </tr>
        <c:forEach items="${products}" var="pr" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${pr.name}</td>
            <td><img src="${pr.image}" style="width: 100px; height: 100px;" ></td>
            <td>${pr.price}</td>
            <td>${pr.stock}</td>
            <td><button>EDIT</button></td>
            <td><button>DELETE</button></td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>
