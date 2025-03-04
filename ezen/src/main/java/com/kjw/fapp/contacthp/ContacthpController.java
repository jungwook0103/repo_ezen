package com.kjw.fapp.contacthp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContacthpController {
	@Autowired
	ContacthpService contacthpService;
	
	@RequestMapping(value = "/contacthp/contacthpXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", contacthpService.selectList());
		return "contacthp/contacthpXdmList";
	}
	
	@RequestMapping(value = "/contacthp/contacthpXdmView")
	public String codeGroupXdmView (Model model, ContacthpDto contacthpDto) {
		model.addAttribute("item", contacthpService.selectOne(contacthpDto));
		return "contacthp/contacthpXdmView";
	}

}
