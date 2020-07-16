<%--
  Created by IntelliJ IDEA.
  User: Paul
  Date: 13.07.2020
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebDemo</title>
</head>
<body>
<p>Greeting</p>
<p>Say something</p>

<form method="post" action="hello">
    <h2>Name:</h2>
    <input type="text" id="say-hello-text-input" name="name"/>
    <input type="submit" id="say-hello-button" value="Say Hello"/>
</form>
</body>
</html>
