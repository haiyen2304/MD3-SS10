<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 23/07/2024
  Time: 10:26 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Simple Calculator</h1>
<form action="bt2-servlet" method="post">
    <span>First operand</span><input type="number" name="firstNum"><br>
    <span>Operator</span><select name="operator">
                            <option value="-1">Addion</option>
                            <option value="+">+</option>
                            <option value="-">-</option>
                            <option value="*">*</option>
                            <option value="/">/</option>
                        </select><br>
    <span>Second operand</span><input type="number" name="secondNum"><br>
    <input type="submit" value="Calculate">
</form>
</body>
</html>
