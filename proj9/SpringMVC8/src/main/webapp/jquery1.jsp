<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	//body에 있는 여러 태그들을 먼저 읽어줘! 해야함. 달러로 감싸주면 body를 먼저 읽어달라는 뜻이 됨
	//body에 있는 h1태그에 대해 먼저 읽게 해줘야 아래의 함수를 작동시킬 수 있다. jquery는 다 이 안에 작성한다.
	$(function() {
		var h1 = $("h1").text();  //함수중 text라는 함수가 있다. 해당 태그의 값을 가져오게 함 
		//자바스크립트에서의 모든 변수는 var
		console.log(h1); //브라우저 콘솔에 디버그용 메시지 찍어보기
		//크롬기준으로 F12눌러서 개발자모드 진입 - console창 들어가면 log메시지 보이게 된다.
		
		alert(h1);
		$("h1").text("굿 에프터 눈");  //해당 태그의 내부 메시지 변경시키기. '안녕하세요'라는 것이 사라지게 된다.
		
		
		console.log($("#name").val()); //태그가 아닌 id를 통해 특정태그를 선택할 때에는 #을 쓴다. 그리고 해당 태그에 있는 값은 value이므로 val 씀
		//해당하는 id에 일치하는 태그의 value값을 가져와서 콘솔에 찍기
		
		$("#name").val(h1); //밸류변경하기
		
		$("#add").css("color", "red").css("background-color","yellow");  //js로 css설정도 가능하다. 스타일이름과 속성값 두가지 인자 필요
		//체인형으로 여러 함수를 한번에 실행 가능하다.
	
		$("#btn1").click(function() {  //btn 버튼 클릭시 아래의 함수를 실행시켜주세요.
			$("h1").text("버튼1을 클릭하셨군요.");
			$("h1").css("background-color", "yellow");
		});
		$("#btn2").click(function() {
			$("h1").text("버튼2를 클릭하셨군요.");
			$("h1").css("background-color", "blue");
		}); //자바 GUI에서 ActionListener에 대해 Actionperformed가 작동되도록 하는 것과 비슷
		//버튼쪽에다가 특정 함수가 실행되도록 미리 지정할 필요 없이 알아서 함수가 작동된다.. 버튼에 onclick=""을 쓸 필요가 없음
		//이것을 폴백함수라고 한다.
		
		$("h1").animate({marginLeft:"300px"}, 1000)  //1초동안 왼쪽에서부터 300px만큼 이동
				.animate({marginLeft:0}, 1000);
	
	});
	//일반적인 자바스크립트에서는 script부분이 먼저 읽히도록 하고 body부분이 읽히게 한다음, body의 각종 태그들에서 함수가 직접적으로 호출되도록
	//만드는 것이 일반적이었는데 Jquery는 정반대로 body먼저 읽게 하네.
</script>
</head>
<body>
<h1>안녕하세요</h1>

<input id="name" type="text" name="name" value="hello"><br>
<input id="add" type="text" name="address" value="dansungsa"><br>

<button id="btn1">클릭</button>
<button id="btn2">더블클릭</button>
</body>
</html>