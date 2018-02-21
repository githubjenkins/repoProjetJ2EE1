<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>COURS-ELEVE</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

<!-- <link media="all" rel="stylesheet" href="theme/css/bootstrap.css" type="text/css" /> -->
<!-- <link media="all" rel="stylesheet" href="theme/js/css/bootstrap-grid.css" type="text/css" /> -->

<!-- <!-- <link rel="stylesheet" href="theme/js/css/bootstrap-grid.css.map" type="text/css" /> --> -->
<!-- <!-- <link rel="stylesheet" href="theme/js/css/bootstrap-reboot.css.map" type="text/css" /> --> -->
<!-- <!-- <link media="all" rel="stylesheet" href="theme/css/bootstrap.min.css" type="text/css" /> --> -->

<!-- <!-- <script src="theme/js/bootstrap.js"></script> --> -->
<!-- <script src="theme/js/jquery.min.js"></script> -->
<!-- <script src="theme/js/bootstrap.js"></script> -->

</head>
<body>

	<div class="container">
		<form action="./Eleve" method="post">
			<table class="table table-dark table-hover">
				<tr>
					<td>Nom</td>
					<td><input type="text" name="tnom" size="20"></td>
				</tr>
				<tr>
					<td>Prenom</td>
					<td><input type="text" name="tprenom" size="20"></td>
				</tr>
				<tr>
					<td>Adresse</td>
					<td><input type="text" name="tadresse" size="20"></td>
				</tr>

				<tr>
					<td>Né le:</td>
					<td><input type="text" name="tnele" size="20"></td>
				</tr>

				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="valider"></td>
				</tr>
			</table>
		</form>
</body>
</html>