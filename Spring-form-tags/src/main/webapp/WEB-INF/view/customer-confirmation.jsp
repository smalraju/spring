<%--
  Created by IntelliJ IDEA.
  User: shreM
  Date: 22/04/22
  Time: 12:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Customer Confirmation</title>
</head>
<body>
    Customer Name : ${customer.firstName}  ${customer.lastName}

<br><br>
    Free passes : ${customer.freePasses}
<br><br>
pin code : ${customer.postalCode}
<br><br>

Course Code: ${customer.courseCode}
</body>
</html>
