<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../template/header.jsp"></jsp:include>
	<jsp:include page="../template/menu.jsp"></jsp:include>
	<h1>입력페이지</h1>
	<center>
		<form action="insert.jsp">
			<table width="80%">
				<tr>
					<td>제목</td>
					<td>
						<input type="text" name="sub">
					</td>
				</tr>
				<tr>
					<td>글쓴이</td>
					<td>
						<input type="text" name="id">
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<textarea name="content" rows="5" cols="60"></textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="입 력">
						<input type="reset" value="취 소">
					</td>
				</tr>
			</table>
		</form>
	</center>
	<jsp:include page="../template/footer.jsp"></jsp:include>
</body>
</html>









