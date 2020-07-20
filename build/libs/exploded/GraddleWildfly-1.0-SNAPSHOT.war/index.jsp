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



<!-- приветствие по введеному имени -->
<form method="post" action="hello">
    <h2>Name:</h2>
    <input type="text" id="say-hello-text-input" name="name"/>
    <input type="submit" id="say-hello-button" value="Say Hello"/>
</form>


<!-- кнопка вывода текущей даты -->
<form action="${pageContext.request.contextPath}/time" method="post">
    <input type="submit" name="timeButton" value="What day and time is it" />
</form>

<!-- расчет кредита -->
<form method="post" action="mortgage">
    <h2>Расчет кредита:</h2>
    Введите сумму займа в рублях
    <input type="number" id="sumOfCredit" name="sumOfCredit" required/> <br>
    Введите на сколько лет вы берёте кредит
    <input type="number" id="yearsOfCredit" name="yearsOfCredit" required/> <br>
    Введите годовую процентную ставку кредита
    <input type="number" id="interest" name="interest" min="1" max="100" step="0.1" required/> <br>
    <input type="submit" id="submit-button" value="Calculate"/>
</form>

<%--<!-- тест -->--%>
<%--<form method="post" action="test">--%>
<%--    <h2>Умножение двух чисел:</h2>--%>
<%--    Введите спервое число--%>
<%--    <input type="text" id="first" name="first"/> <br>--%>
<%--    Введите второе число--%>
<%--    <input type="text" id="second" name="second"/> <br>--%>
<%--    <input type="submit" id="submitTest-button" value="CalculateTest"/>--%>
<%--</form>--%>


</body>
</html>
