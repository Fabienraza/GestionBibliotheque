<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Ajouter un livre</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	
	<body>
		<form action = "/1-TD2_Bibliotheque_JEE/newBook" method="post">
	
			<div class="container-fuild">
				<div class="row">
					<div class="col-lg-12">
						<%@ include file="menu.jsp" %>
					</div>
				</div>
			
				<h2> Le livre </h2>
				
				<div class="row">
					<div class="col-lg-2">
						<label>Titre</label>
					</div>
					
					<div class="col-lg-8">
						<input type="text" name="titreLivre">
					</div>
				</div>
	
				<div class="row">
					<div class="col-lg-2">
						<label> Catégorie</label>
					</div>
					
					<div class="col-lg-8">
						<select name="categorie">
							<option value="roman"> Roman </option>
							<option value="aventure"> Aventure </option>
							<option value ="cuisine"> Cuisine </option>
							<option value="medecine"> Médecine </option>
						</select>
					</div>
				</div>		
			
				<div class="row">
					<div class="col-lg-2">
						<label>N° ISBN</label>
					</div>
					
					<div class="col-lg-8">
						<input type="text" name="isbn">
					</div>
				</div>
				
				<h2> L'auteur </h2>
		
				<div class="row">
					<div class="col-lg-2">
						<label>Nom de l'auteur</label>
					</div>
		
					<div class="col-lg-8">
						<input type="text" name="nomAuteur">
					</div>
				</div>
		
				<div class="row">
					<div class="col-lg-2">
						<label>Prénom de l'auteur</label>
					</div>
		
					<div class="col-lg-8">
						<input type="text" name="prenomAuteur">
					</div>
				</div>
				
				<div class="row">
					<div class="col-lg-2">
						
					</div>
		
					<div class="col-lg-8">
						<input type="submit" value="Valider" >
					</div>
				</div>
			</div>
		</form>
	</body>
</html>