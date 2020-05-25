package com.itbank.mvc7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {

	@RequestMapping("logout.do")
	public void logout() {
		System.out.println("·Î±×¾Æ¿ôÀº µÊ");
	}
}
