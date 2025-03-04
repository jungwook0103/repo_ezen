package com.kjw.fapp.contactanniv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ContactannivController {
	@Autowired
	ContactannivService contactannivService;
	
	@RequestMapping(value = "/contactanniv/contactannivXdmList")
	public String codeGroupXdmList(Model model) {
		model.addAttribute("list", contactannivService.selectList());
		
		return "contactanniv/contactannivXdmList";		
	}
	
	@RequestMapping(value = "/contactanniv/contactannivXdmView")
	public String codeGroupXdmView(Model model, ContactannivDto contactannivDto) {
		
		model.addAttribute("item", contactannivService.selectOne(contactannivDto));
		
		return "contactanniv/contactannivXdmView";
	}

}
