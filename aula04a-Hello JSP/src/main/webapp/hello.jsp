<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello JSP</h1>
	<%out.println("Professor José de Assis");%>
	<%-- Uso do elemento expressão --%>
	<%--Precisa "importar" o DATE lá em cima --%>
	<p>Data: <%=new Date()%>
	<%!int contador=0; %>
	<p>Visitas: <%=contador++%></p>
</body>
</html>