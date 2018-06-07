<%--
  Created by IntelliJ IDEA.
  User: Faris
  Date: 5/24/2018
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="red">
    <%

        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));

        int k = i+j;

        out.println("Hasil = "+k);

    %>
</body>
</html>
