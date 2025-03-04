package com.kjw.fapp.contactgroup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactgroupController {
	
	@Autowired
	ContactgroupService contactgroupService;
	
	@RequestMapping(value = "/contactgroup/contactgroupXdmList")
	public String codeGroupXdmList (Model model) {
		model.addAttribute("list", contactgroupService.selectList());
		return "contactgroup/contactgroupXdmList";
	}

}
