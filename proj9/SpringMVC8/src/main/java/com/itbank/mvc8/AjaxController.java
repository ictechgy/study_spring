package com.itbank.mvc8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AjaxController {

	@RequestMapping("ajax")
	public void ajax() {
		System.out.println("ajax ok....");
	}
}
