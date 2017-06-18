<%@ page language="java" import="java.util.*" contentType="text/html; charset=utf-8" %> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
System.out.println(basePath);
%>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
<h2>Hello World!</h2>
</body>
</html>
