package com.kjw.fapp.contactnumber;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactnumberController {
	
	@Autowired
	ContactnumberService contactnumberService;
	
	@RequestMapping(value = "/contactnumber/contactnumberXdmList")
	public String codeGroupXdmList (Model model) {
		model.addAttribute("list", contactnumberService.selectList());
		return "contactnumber/contactnumberXdmList";
	}
	
	@RequestMapping(value = "/contactnumber/contactnumberXdmView")
	public String codeGroupXdmView (Model model, ContactnumberDto contactnumberDto) {
		model.addAttribute("item", contactnumberService.selectOne(contactnumberDto));
		return "contactnumber/contactnumberXdmView";
	}

}
