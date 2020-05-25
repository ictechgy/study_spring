<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:out value="나는 JSTL로 출력한 결과물..."></c:out>
회원가입에 성공하였습니다. <br>
<hr>
${hi}
당신이 가입한 정보는 아래와 같습니다.<br>
ID : ${memberDTO.id}<br>
PW : ${memberDTO.pw}<br>
NAME : ${memberDTO.name}<br>
TEL : ${memberDTO.tel}<br>
</body>
</html>