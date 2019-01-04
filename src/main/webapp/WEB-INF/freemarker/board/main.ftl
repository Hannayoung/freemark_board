<#ftl encoding="utf-8"/>

<html>

<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<link href="https://fonts.googleapis.com/css?family=Nanum+Gothic+Coding" rel="stylesheet">


<style>
.nyFont {
font-family: 'Nanum Gothic Coding', monospace;
font-size: 20px;
}

</style>
</head>

<body>

	<div class="row">
		<div class="col-xs-10 col-md-10 col-lg-10">
		</div>
		
		<div class="col-xs-2 col-md-2 col-lg-2">
		<form action="/write.fre" method="get">
			<div class="nyFont" >
			글 쓰기<button type="submit" class="btn btn-default"><img src="../../../img/write.png" width="20" height="20" alt="writer"></button>
			</div>
		</form>
		</div>
	</div>
   
   <table class="table">
   	<thead>
   	<th>번호</th><th>작성일</th><th>제목</th><th>글쓴이</th><th>수정일</th>
   	</thead>
   <tbody>
   	<#if boardList??>
   	<#list boardList as k,v>
   	<#list v as board>
   	<#if board.upDate?has_content >
   	<tr scope="row"><td>${board.boardId}</td><td>${board.crtDate}</td><td>${board.title}</td><td>${board.name}</td><td>${board.upDate}</td></tr>
   	<#else>
   	<tr scope="row"><td>${board.boardId}</td><td>${board.crtDate}</td><td>${board.title}</td><td>${board.name}</td><td> ${board.upDate?default("")} </td></tr>
   	</#if>
   	</#list>
   	</#list>
   	</#if>
   	</tbody>
   </table>

</body>

</html>

