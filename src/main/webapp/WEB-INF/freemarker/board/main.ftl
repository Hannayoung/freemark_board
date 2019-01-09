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
		$("body div:first-child div:last-child div:first-child").click(function() {
			document.location.href = "/logout.fre";
			return false;
		}); 
		
		$("body div:first-child div:last-child div:last-child").click(function() {
			document.location.href = "/write.fre";
			return false;
		}); 
	});
	</script>
	
	</head>
	
	<body>
		<div class="row">
			<div class="col-xs-10 col-md-10 col-lg-10">
			
			</div>
			
			<div class="col-xs-2 col-md-2 col-lg-2">
				<div class="nyFont" style="margin:10px;">
				로그아웃&nbsp;<button type="submit"  class="btn btn-default"><img src="../../../img/logout.png" width="20" height="20" alt="logout"></button>
				</div>
				
				<div class="nyFont" style="margin:10px;">
				글 쓰기&nbsp;<button type="submit"  class="btn btn-default"><img src="../../../img/write.png" width="20" height="20" alt="writer"></button>
				</div>
			</div>
		</div>
	
		<div class="row">
			<div class="col-xs-1 col-md-1 col-lg-1">
			
			</div>
			
			<div class="col-xs-10 col-md-10 col-lg-10">
				<table class="table">
					<thead>
				   	<tr><th>번호</th><th>제목</th><th>글쓴이</th><th>작성일</th><th>수정일</th></tr>
				   	</thead>
				   	<tbody>
				   		<#if articleList??>
				   			<#list articleList as article>
				   					<tr scope="row">
				   						<td>${article.articleId}</td>
				   						<td><a href='/detail.fre?bno=${article.articleId}'>${article.title}</a></td>
				   						<td>${article.cusName}</td>
				   						<td>${article.crtDate}</td>
				   						<#if article.upDate?has_content >
				   						<td>${article.upDate}</td>
				   						<#else>
				   						<td>  </td>
				   						</#if>
					   				</tr>
					   		</#list>
					   	</#if>
				   	</tbody>
				</table>
			</div>
			
			<div class="col-xs-1 col-md-1 col-lg-1">
			
			</div>
		</div>
	</body>

</html>

