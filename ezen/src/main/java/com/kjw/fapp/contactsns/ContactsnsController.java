package com.kjw.fapp.contactsns;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactsnsController {
	
	@Autowired
	ContactsnsService contactsnsService;
	
	@RequestMapping(value = "/contactsns/contactsnsXdmList")
	public String codeGroupList(Model model) {
		model.addAttribute("list", contactsnsService.selectList());
		
		return "contactsns/contactsnsXdmList";
	}
	
	@RequestMapping(value = "/contactsns/contactsnsXdmView")
	public String codeGroupView(Model model, ContactsnsDto contactsnsDto) {
		model.addAttribute("item", contactsnsService.selectOne(contactsnsDto));
		
		return "contactsns/contactsnsXdmView";
	}
	
	

}
