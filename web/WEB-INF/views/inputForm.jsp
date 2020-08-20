<%--
  Created by IntelliJ IDEA.
  User: daoxu
  Date: 8/20/2020
  Time: 10:17 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
    <h1>Simple Dictionary</h1>
    <h2>Input word</h2>
    <form action="/doTranslate">
        <input type="text" name="word" placeholder="enter your word ...">
        <button type="submit">Translate</button>
    </form>
</body>
</html>
