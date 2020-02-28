<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Suppression</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	
	<body>
		
		<div class="container-fuild">
			<div class="row">
				<div class="col-lg-12">
					<%@ include file="menu.jsp"%>
				</div>
			</div>
		</div>
		
		<h1> SUPPRESSION D'UN LIVRE </h1>
				
		<form action="/1-TD2_Bibliotheque_JEE/supprimerLivre" method="post">
			<select name="id_livre">
				<c:forEach items="${listeLivres}" var="livre">
					<option value="${livre.isbn}">${livre.titre}</option>
				</c:forEach>
			</select> <input type="submit" value="Supprimer">
		</form>
</body>
</html>
