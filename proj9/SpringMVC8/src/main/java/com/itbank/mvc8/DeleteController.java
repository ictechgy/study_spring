package com.itbank.mvc8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeleteController {

	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("delete")
	public String delete(MemberDTO memberDTO) {
		memberDAO.delete(memberDTO);
		return "redirect:main.jsp";
	}
	
}
