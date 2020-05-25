<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#member").on("submit", function() { //member�� ���� submit�� ��� �Ʒ��� �Լ� ������ ��������ּ���
			var data = $(this).serialize();    //this=member�� �ǹ�. member�� ���� �����ؼ� data�� ����. ������ �ѱ�� ���� �ƴϹǷ� QueryStringȭ?
			//� �����͸� �ϴ� ������ �ѱ�°Ÿ� �� serialize()�� ����� �ϴ°ǰ�
					
			$.ajax({
				url: "member.jsp",   //��û�� ������. url�� �ۼ��ؼ� ��Ʈ�ѷ��� �۵��ǵ��� ���� ���� �ִ�.
				type: "post",  //��û�� ���
				data: data,		//���� ��
				success: function(result) {		//������ �� �� ������. ������(member.jsp)�� result�� ���
					$("#txt1").text(result);
				}
			});
			return false; //form �±׿� ���� �������� �Ѿ�� �ʵ��� �� -> �׷� form�±��� action�κ��� ������ ������ �κ��ΰǰ�
		});
		$("#btn1").on("click", function() {
			$.ajax({
				url: "ajax",
				dataType: "html",  //�޴°��� html�� �ްڴ�
				success: function() {
					$("#txt1").text("ajax ����!")
				}
			});
		});
		
		$("#btn2").on("click", function() {
			$.ajax({
				url: "resources/txt/rank.json",		//������ �ּ� ����(������ ����. �ܺ��� URL�ּҿ��� �ȴ�.)
				dataType: "json",
				success: function(result) { //json ������ result�� ������
					$("#txt1").text("json ����!")
					var list = result.rank;  //rank�� ���� ������� list�� �ִ´�.
					if(list.length > 0 ){
						alert("json ok..");
						$(list).each(function(i, person) { //for each. i�� ���ΰɱ�? �ε���??
							var name = person.name;
							var tel = person.tel;
							console.log(person);
							console.log(name);
							console.log(tel);
							var total = name + ", " + tel;
							var child = "<h1>" + total + "</h1>";
							$("body").append(child);
							
							/*���� �޾ƿ� �����͸� DB�� �ְ��ʹٸ�
							�� �� �κп� ajax�� �� �Ἥ �������� ��Ʈ�ѷ��� �����Ű�� �� ��Ʈ�ѷ������� ���� ���� DB�� ������ �ȴ�.
							�ٸ� �޾ƿ� ���� ���� ������ �����ͷ� ���� �ٽ� ���� ������ serialize�� �ʿ�������
							*/
							
							
						})
					}
				}
			});
		});
		
	});
</script>
</head>
<body>
<form action="member.jsp" method="post" id="member">
	������̸� : <input type="text" name="username"><br>
	<button type="submit">������ ���</button>
</form>
<h1 id="txt1"></h1>

<button type="button" id="btn1">��ư</button>

<p>
json
<button type="button" id="btn2">�� ����������</button>


</body>
</html>