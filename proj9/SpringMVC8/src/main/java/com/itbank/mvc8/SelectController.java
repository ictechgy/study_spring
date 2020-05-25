package com.itbank.mvc8;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SelectController {
	
	@Autowired
	MemberDAO memberDAO;
	
	@RequestMapping("selectAll")
	public void selectAll(Model model) {
		List<MemberDTO> list = memberDAO.selectAll();
		model.addAttribute("list", list);
	}
	
	@RequestMapping("select")
	public void select(MemberDTO memberDTO, Model model) {
		MemberDTO dto = memberDAO.select(memberDTO);
		model.addAttribute("dto", dto);
	}
	
	
}