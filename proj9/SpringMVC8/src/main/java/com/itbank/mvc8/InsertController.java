package com.itbank.mvc8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InsertController {
	
	@Autowired
	MemberDAO memberDAO;

	@RequestMapping("insert")
	public void insert(MemberDTO memberDTO) throws Exception {
		memberDAO.insert(memberDTO);
	}
	
}
