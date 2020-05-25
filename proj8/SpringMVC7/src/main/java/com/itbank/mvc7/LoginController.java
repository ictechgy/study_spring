package com.itbank.mvc7;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	@RequestMapping("login2.do")
	public String login2(@RequestParam String id, @RequestParam String pw) {
/*	public String login2(HttpServletRequest request) {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");*/
	
		String saveId = "root";
		String savePw = "1234";
		
		if(id.equals(saveId) && pw.equals(savePw)) {
			return "loginOK";
		}else {
			return "loginNOT";
		}
	}
	
	@RequestMapping("login.do")
	public void login() {
		System.out.println("로그인 처리");
	}
	
}
