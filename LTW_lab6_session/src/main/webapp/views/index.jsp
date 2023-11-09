<%@ page import="model.User" %><%--
  Created by IntelliJ IDEA.
  User: Pblues
  Date: 11/3/2023
  Time: 7:54 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <% User auth = (User) session.getAttribute("auth");%>
  <% if (auth == null){ %>
  <p>Ban chua dang nhap</p>
  <%} else{ %>
  <p>Chao <%=auth.getEmail()%></p>
  <%}%>
</body>
</html>
