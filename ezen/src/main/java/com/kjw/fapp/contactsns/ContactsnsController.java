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
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", contactsnsService.selectList());
		
		return "contactsns/contactsnsXdmList";
	}
	
	@RequestMapping(value = "/contactsns/contactsnsXdmView")
	public String codeGroupXdmView(Model model, ContactsnsDto contactsnsDto) {
		model.addAttribute("item", contactsnsService.selectOne(contactsnsDto));
		
		return "contactsns/contactsnsXdmView";
	}
	
	@RequestMapping(value = "/contactsns/contactsnsXdmForm")
	public String codeGroupXdmForm() {
		return "contactsns/contactsnsXdmForm";
	}
	
	@RequestMapping(value = "/contactsns/contactsnsXdmInst")
	public String codeGroupXdmInst(ContactsnsDto contactsnsDto) {
		contactsnsService.insert(contactsnsDto);
		return "redirect:/contactsns/contactsnsXdmList";
	}
	
	

}
