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
		margin-top : 50px;
		margin : 20px;
	}
	</style>
	
	<script>
	$(function() {
		$("body div:last-child div:nth-child(3n)").click(function() {
			document.location.href = "/main.fre";		
			return false;
		}); 
	});
	</script>
	
	<script type="text/javascript">
	$(document).ready(function() {
	    $('#content').on('keyup', function() {
	        if($('#content').val().length > 200) {
	            $('#content').val($('#content').val().substring(0, 200));
	            
	        }
	    });
	    $('#content').keyup();
	    
	    var formObj = $("form[role='form']");
	    
	    $('.register').on('click', function() {
	    	formObj.attr("action", "/write.fre");
	    	formObj.attr("method", "post");
	    	formObj.submit();
	    });
	});
	</script>
	
	</head>
	
	<body>
		<form action="" role="form">
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					<label for="usr">제목 </label>
				</div>
				
				<div class="col-xs-8 col-md-8 col-lg-8">
					<input type="text" class="form-control" name="title">
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					<label for="comment">내용</label>
					<label for="comment" class="nyFontPoint"> (한글 100자 영어 200자)</label>
					
				</div>
				
				<div class="col-xs-8 col-md-8 col-lg-8">
					<textarea class="form-control" id="content" rows="5" name="content"></textarea>
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-xs-2 col-md-2 col-lg-2">
					
				</div>
				
				<div class="col-xs-4 col-md-4 col-lg-4">
					<button type="submit" class="register btnStyle nyFont btn btn-default">등록</button>
				</div>
				
				<div class="col-xs-4 col-md-4 col-lg-4">
					<button type="submit" class="btnStyle nyFont btn btn-default" >뒤로가기</button>
				</div>
				
				<div class="col-xs-2 col-md-2 col-lg-2">
				
				</div>
			</div>
		</form>
	</body>

</html>
