package com.kjw.fapp.contactcomp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactcompController {
	@Autowired
	ContactcompService contactcompService;
	
	@RequestMapping(value = "/contactcomp/contactcompXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", contactcompService.selectList());
		return "contactcomp/contactcompXdmList";
	}
	
	@RequestMapping(value = "/contactcomp/contactcompXdmView")
	public String codeGroupXdmView(Model model, ContactcompDto contactcompDto) {
		model.addAttribute("item", contactcompService.selectOne(contactcompDto));
		return "contactcomp/contactcompXdmView";
	}

}
