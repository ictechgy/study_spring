<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

<a href="hello.do">Hello����Ʈ ��û</a><br>

<form action="hello.do" method="POST">
	���̵� : <input type="text" name="id"><br>
	�н����� : <input type="text" name="pw"><br>  <!-- �ڹٽ�ũ��Ʈ ���� ��� id���� �־�� �Ѵ�. -->
	<input type="submit" value="������ ����">
</form>

<a href="hi.do">Hi����Ʈ ��û</a><br>


<a href="star">Star�� ����</a>

</body>
</html>