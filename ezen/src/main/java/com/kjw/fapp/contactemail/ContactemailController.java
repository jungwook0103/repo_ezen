package com.kjw.fapp.contactemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactemailController {
	
	@Autowired
	ContactemailService contactemailService;
	
	@RequestMapping(value = "/contactemail/contactemailXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", contactemailService.selectList());
		return "contactemail/contactemailXdmList";
	}
	
	@RequestMapping(value = "/contactemail/contactemailXdmView")
	public String codeGroupXdmView(Model model, ContactemailDto contactemailDto) {
		model.addAttribute("item", contactemailService.selectOne(contactemailDto));
		return "contactemail/contactemailXdmView";
	}

}
