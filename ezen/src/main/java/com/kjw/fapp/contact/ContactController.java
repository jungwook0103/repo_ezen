package com.kjw.fapp.contact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjw.fapp.team.TeamDto;

@Controller
public class ContactController {
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = "/contact/contactXdmList")
	public String codeGroupXdmList(Model model) {
		
		model.addAttribute("list", contactService.selectList());
		
		return "contact/contactXdmList";
	}

	@RequestMapping(value = "/contact/contactXdmView")
	public String codeGroupXdmView(Model model, ContactDto contactDto) {
		
		model.addAttribute("item", contactService.selectOne(contactDto));
		
		return "contact/contactXdmView";
	}
	
	@RequestMapping(value = "/contact/contactXdmForm")
	public String codeGroupXdmForm() {
		
		
		return "contact/contactXdmForm";
	}
	
	@RequestMapping(value = "/contact/contactXdmInst")
	public String codeGroupXdmInst(ContactDto contactDto) {		
		
		contactService.insert(contactDto);
		
		return "redirect:/contact/contactXdmList";
	}
}
