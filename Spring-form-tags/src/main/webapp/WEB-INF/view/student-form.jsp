<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: shreM
  Date: 20/04/22
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Form</title>
</head>
<body>
    <form:form action="processForm" modelAttribute="student">
      <br>
      First Name: <form:input path="firstName"/>
      <br><br>
      Last Name: <form:input path="lastName"/>
      <br><br>

        Country : <form:select path="country" value="Select a country">
        <form:options items="${student.countryOptions}"/>
    </form:select>

        <br><br>
        Select Course
        <br>
        Java <form:radiobutton path="course" value="Java"/>
        C++ <form:radiobutton path="course" value="C++"/>
        Python <form:radiobutton path="course" value="Python"/>

        <br><br>

        Operating System
        <br>
        Linux <form:checkbox path="operatingSystem" value="Linux"/>
        MAC OS <form:checkbox path="operatingSystem" value="MAC OS"/>
        Windows OS <form:checkbox path="operatingSystem" value="Windows OS"/>

        <br><br>
        <input type="submit" value="Submit">
    </form:form>
</body>
</html>
