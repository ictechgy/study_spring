package com.itbank.mvc8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UpdateController {
	
	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("update")
	public String update(MemberDTO memberDTO) {
		memberDAO.update(memberDTO);
		return "redirect:main.jsp";
	}
}
