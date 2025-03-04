package com.kjw.fapp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/contact/contactXdmList")
	public String codeGroupXdmList(Model model) {
		
		model.addAttribute("list", contactService.selectList());
		
		return "contact/contactXdmList";
	}

}
