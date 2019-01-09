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
		margin-top : 50px;
		margin : 20px;
	}
	</style>
	
	<script>
	function login(f) {
				f.method = 'post';
				f.action = 'login.fre';
				f.submit();
	}
	
	function register(f) {
				f.method = 'get';
				f.action = '/register.fre';
				f.submit();
	}
	</script>
	
	</head>
	
	<body class="nyFont" >
		<form action="">
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
					<input type="password" class="form-control" name="pw">
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					
				</div>
				
				<div class="col-xs-4 col-md-4 col-lg-4">
					<button type="submit" onclick="login(this.form);" class="btnStyle nyFont btn btn-default">로그인</button>
				</div>
				
				<div class="col-xs-4 col-md-4 col-lg-4">
					<button type="submit" onclick="register(this.form);" class="btnStyle nyFont btn btn-default" >회원가입</button>
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
		</form>
	</body>

</html>
