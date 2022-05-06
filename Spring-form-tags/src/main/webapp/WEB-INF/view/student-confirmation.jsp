
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
  Student info : ${student.firstName} ${student.lastName}
  <br><br>
  Country : ${student.country}
<br><br>
  Selected Course : ${student.course}
<br><br>
Operating system(s) :
<ul>
    <c:forEach items="${student.operatingSystem}" var="temp">
        <li>${temp}</li>
    </c:forEach>
</ul>
</body>
</html>
