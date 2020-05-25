package com.itbank.mvc7;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {
	
	@RequestMapping("insert.do")
	public void insert(MemberDTO memberDTO, Model model, MemberDAO memberDAO) throws Exception {
		//DI는 아직 안 쓸 것이다. 그러면 입력값으로 쓰면 알아서 만들어준다.
		memberDAO.insert(memberDTO);
		
		
		model.addAttribute("hi", "hello");
		model.addAttribute("memberDTO", memberDTO);
		System.out.println(memberDTO.getId());
		System.out.println(memberDTO.getPw());
		System.out.println(memberDTO.getName());
		System.out.println(memberDTO.getTel());
		
	}
}
