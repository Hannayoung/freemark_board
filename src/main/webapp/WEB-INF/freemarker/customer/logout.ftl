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
	
	<style>
	.nyFont {
		font-family: 'Nanum Gothic Coding', monospace;
		font-size: 20px;
	}
	
	.nyFontPoint {
		font-family: 'Nanum Gothic Coding', monospace;
		font-size: 15px;
	}
	.btnStyle{
		width:100%;
		height:10%;
	}
	
	body {
		margin-top : 100px;
		margin : 20px;
	}
	
	</style>
	
	<script>
	$(function() {
		$("body div:last-child div:nth-child(2n)").click(function() {
			document.location.href = "/login.fre";		
			return false;
		}); 
	});
	</script>
	
	</head>
	
	<body>
		<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					
				</div>
				
				<div class="nyfont col-xs-8 col-md-8 col-lg-8" style="text-align:center;">
					로그아웃 되었습니다
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
		</div>  
		
		<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					
				</div>
				
				<div class="col-xs-8 col-md-8 col-lg-8">
					<button type="submit" class="btnStyle nyFont btn btn-default">로그인 하러가기</button>
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
		</div>	
	</body>

</html>

