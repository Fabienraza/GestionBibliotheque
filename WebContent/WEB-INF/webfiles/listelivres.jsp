<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Listes</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	
	
	<body>
		<div class="container-fuild">
			<div class="row">
				<div class="col-lg-12">
					<%@ include file="menu.jsp"%>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<h1>LISTE DES LIVRES</h1>
				</div>
				
				<div class="col-lg-6">
					<h1>LISTE DES AUTEURS</h1>
				</div>
			</div>

			<div class="row">
				<div class="col-lg-6">
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col"><h4>ISBN</h4></th>
								<th scope="col"><h4>TITRE</h4></th>
								<th scope="col"><h4>CATEGORIE</h4></th>
							</tr>
						</thead>
					</table>
				</div>
				
				<div class="col-lg-6">
					<table class="table">
						<thead class="thead-dark">
							<tr>
								<th scope="col"><h4>NOM AUTEUR</h4></th>
								<th scope="col"><h4>PRENOM AUTEUR</h4></th>
								<th scope="col"><h4>CODE AUTEUR</h4></th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
			
			<div class="row">
				<div class="col-lg-6">
					<table class="table">
						<c:forEach items="${listeLivres}" var="livre">
							<tr>
								<td><h6>${livre.isbn}</h6></td>
								<td><h6>${livre.titre}</h6></td>
								<td><h6>${livre.categorie}</h6></td>
							</tr>
						</c:forEach>
					</table>
				</div>
				
				<div class="col-lg-6">
					<table class="table">
						<c:forEach items="${listeAuteurs}" var="auteur">
							<tr>
								<td><h6>${auteur.nom}</h6></td>
								<td><h6>${auteur.prenom}</h6></td>
								<td><h6>${auteur.id}</h6></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	
	</body>
</html>
		
		
<!-- Balise JSTL prmettant de parcourir un tableau:
Elle prend :
	- l'attribut items = le nom du tableau 
	- var= reference de la balise -->

