package com.itbank.mvc8;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FruitController {

	@RequestMapping("fruit")
	public String fruit(@RequestParam String fruit, HttpSession session) {
		session.setAttribute("fruit", fruit);
	/*public String fruit(@RequestParam String fruit, Model model) {
		model.addAttribute("fruit", fruit);*/
		if(fruit.equals("apple")) {
			return "apple";
		}else if (fruit.equals("banana")){
			return "banana";
		}else {
			return "nothing";
		}
	}
}
