<#ftl encoding="utf-8"/>

<html>

	<head>
	
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	
	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	
	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding" rel="stylesheet">
	
	<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding" rel="stylesheet">
	
	<style>
	.nyFont {
		font-family: 'Nanum Gothic Coding', monospace;
		font-size: 20px;
	}
	
	.nyFontPoint {
		font-family: 'Nanum Gothic Coding', monospace;
		font-size: 15px;
	}
	
	.btnStyle {
		width: 100%;
		height: 10%;
	}
	
	body {
		margin-top: 50px;
		margin: 20px;
	}
	</style>
	
	<script type="text/javascript">
		$(document).ready(function() {
			var formObj = $("form[role='form']");
	
			console.log(formObj);
	
			$('.btn-warning').on('click', function() {
				formObj.attr("action", "/register.fre");
				formObj.attr("method", "post");
				formObj.submit();
	
			});
	
			$('.btn-danger').on('click', function() {
				formObj.attr("action", "/login.fre");
				formObj.attr("method", "get");
				formObj.submit();
			});
		});
	</script>
	
	</head>
	
	<body class="nyFont">
		<form action="" role="form">
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					<label for="usr">이름 </label>
				</div>
	
				<div class="col-xs-8 col-md-8 col-lg-8">
					<input type="text" class="form-control" name="cusName">
				</div>
	
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
	
			</div>
	
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					<label> 이메일 </label>
				</div>
	
				<div class="col-xs-8 col-md-8 col-lg-8">
					<input type="text" class="form-control" name="email">
				</div>
	
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
	
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					<label> 패스워드 </label>
				</div>
	
				<div class="col-xs-8 col-md-8 col-lg-8">
					<input type="text" class="form-control" name="pw">
				</div>
	
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
	
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
	
				<div class="col-xs-4 col-md-4 col-lg-4">
					<button type="submit" class="btn-warning btnStyle nyFont btn btn-default">등록</button>
				</div>
	
				<div class="col-xs-4 col-md-4 col-lg-4">
					<button type="submit" class="btn-danger btnStyle nyFont btn btn-default">뒤로가기</button>
				</div>
	
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
		</form>
	
	</body>

</html>
