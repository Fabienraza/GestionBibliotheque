<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Modification</title>
		<style type="text/css"> <%@ include file="bootstrap.min.css" %> </style>
	</head>
	
	<body>
		<footer action="..." method="post">
			<div class="container-fuild">
				<div class="row">
					<div class="col-lg-12">
						<%@ include file="menu.jsp"%>
					</div>
				</div>
			</div>
		</footer>
		
		<h1>MODIFICATION D'UN LIVRE</h1>
		<select items="${listeLivres}" var="updateL" class="form-control form-control-lg">
			<option value="${livre.isbn}">${livre.isbn}</option>
		</select>



</body>
</html>

