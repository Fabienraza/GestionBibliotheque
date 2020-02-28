<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Insert title here</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	<body>
		<h1> Récapitulatif</h1> <br>
		<h3> Le livre </h3> <br>
			<h5>Le titre : ${livre.titre}</h5> <br>
			<h5>La catégorie : ${livre.categorie}</h5> <br>
			<h5>N° ISBN : ${livre.isbn}</h5> <br> <br>
		<h3> L'auteur </h3> <br>
			<h5> Le nom : ${auteur.nom}</h5> <br>
			<h5> Le prénom : ${auteur.prenom} </h5> <br>
	</body>
</html>

