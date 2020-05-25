package com.itbank.mvc7;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UpdateController {

/*	@RequestMapping("update.do")
	public String update(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String tel = request.getParameter("tel");
		System.out.println("id : " + id);
		System.out.println("tel : " + tel);
		model.addAttribute("id",id);
		model.addAttribute("tel",tel);
		return "updateResult";
	}*/
/*	@RequestMapping("update.do")
	public String update(@RequestParam String id, @RequestParam String tel, Model model) {
		System.out.println("id : " + id);
		System.out.println("tel : " + tel);
		model.addAttribute("id",id);
		model.addAttribute("tel",tel);
		return "updateResult";
	}*/
	@RequestMapping("update.do")
	public String update(MemberDTO memberDTO, MemberDAO memberDAO) throws Exception {
		memberDAO.update(memberDTO);
		System.out.println("id : " + memberDTO.getId());
		System.out.println("tel : " + memberDTO.getTel());
		return "updateResult";
	}
	
}
