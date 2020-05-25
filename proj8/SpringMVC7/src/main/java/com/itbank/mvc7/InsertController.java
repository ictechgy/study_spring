package com.itbank.mvc7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO, Model model, MemberDAO memberDAO) throws Exception {
		//DI�� ���� �� �� ���̴�. �׷��� �Է°����� ���� �˾Ƽ� ������ش�.
		memberDAO.insert(memberDTO);
		
		
		model.addAttribute("hi", "hello");
		model.addAttribute("memberDTO", memberDTO);
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getTel());
		
	}
}
