<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
	//body�� �ִ� ���� �±׵��� ���� �о���! �ؾ���. �޷��� �����ָ� body�� ���� �о�޶�� ���� ��
	//body�� �ִ� h1�±׿� ���� ���� �а� ����� �Ʒ��� �Լ��� �۵���ų �� �ִ�. jquery�� �� �� �ȿ� �ۼ��Ѵ�.
	$(function() {
		var h1 = $("h1").text();  //�Լ��� text��� �Լ��� �ִ�. �ش� �±��� ���� �������� �� 
		//�ڹٽ�ũ��Ʈ������ ��� ������ var
		console.log(h1); //������ �ֿܼ� ����׿� �޽��� ����
		//ũ�ұ������� F12������ �����ڸ�� ���� - consoleâ ���� log�޽��� ���̰� �ȴ�.
		
		alert(h1);
		$("h1").text("�� ������ ��");  //�ش� �±��� ���� �޽��� �����Ű��. '�ȳ��ϼ���'��� ���� ������� �ȴ�.
		
		
		console.log($("#name").val()); //�±װ� �ƴ� id�� ���� Ư���±׸� ������ ������ #�� ����. �׸��� �ش� �±׿� �ִ� ���� value�̹Ƿ� val ��
		//�ش��ϴ� id�� ��ġ�ϴ� �±��� value���� �����ͼ� �ֿܼ� ���
		
		$("#name").val(h1); //��������ϱ�
		
		$("#add").css("color", "red").css("background-color","yellow");  //js�� css������ �����ϴ�. ��Ÿ���̸��� �Ӽ��� �ΰ��� ���� �ʿ�
		//ü�������� ���� �Լ��� �ѹ��� ���� �����ϴ�.
	
		$("#btn1").click(function() {  //btn ��ư Ŭ���� �Ʒ��� �Լ��� ��������ּ���.
			$("h1").text("��ư1�� Ŭ���ϼ̱���.");
			$("h1").css("background-color", "yellow");
		});
		$("#btn2").click(function() {
			$("h1").text("��ư2�� Ŭ���ϼ̱���.");
			$("h1").css("background-color", "blue");
		}); //�ڹ� GUI���� ActionListener�� ���� Actionperformed�� �۵��ǵ��� �ϴ� �Ͱ� ���
		//��ư�ʿ��ٰ� Ư�� �Լ��� ����ǵ��� �̸� ������ �ʿ� ���� �˾Ƽ� �Լ��� �۵��ȴ�.. ��ư�� onclick=""�� �� �ʿ䰡 ����
		//�̰��� �����Լ���� �Ѵ�.
		
		$("h1").animate({marginLeft:"300px"}, 1000)  //1�ʵ��� ���ʿ������� 300px��ŭ �̵�
				.animate({marginLeft:0}, 1000);
	
	});
	//�Ϲ����� �ڹٽ�ũ��Ʈ������ script�κ��� ���� �������� �ϰ� body�κ��� ������ �Ѵ���, body�� ���� �±׵鿡�� �Լ��� ���������� ȣ��ǵ���
	//����� ���� �Ϲ����̾��µ� Jquery�� ���ݴ�� body���� �а� �ϳ�.
</script>
</head>
<body>
<h1>�ȳ��ϼ���</h1>

<input id="name" type="text" name="name" value="hello"><br>
<input id="add" type="text" name="address" value="dansungsa"><br>

<button id="btn1">Ŭ��</button>
<button id="btn2">����Ŭ��</button>
</body>
</html>