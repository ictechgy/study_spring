package com.itbank.mvc7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {
	
	@RequestMapping("delete.do")
	public String delete() {
		System.out.println("È¸¿ø Å»Åð Ã³¸®");
		return "redirect:insert.jsp";
	}
}
