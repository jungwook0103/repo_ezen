package com.kjw.fapp.contactadd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kjw.fapp.contactadd.ContactaddDto;
import com.kjw.fapp.contactadd.ContactaddService;

@Controller
public class ContactaddController {
	@Autowired
	ContactaddService contactaddService;
	
	@RequestMapping(value = "/contactadd/contactaddXdmList")
	public String codeGroupXdmList(Model model) {
		
		model.addAttribute("list", contactaddService.selectList());
		
		return "contactadd/contactaddXdmList";
	}

	@RequestMapping(value = "/contactadd/contactaddXdmView")
	public String codeGroupXdmView(Model model, ContactaddDto contactaddDto) {
		
		model.addAttribute("item", contactaddService.selectOne(contactaddDto));
		
		return "contactadd/contactaddXdmView";
	}
	
	@RequestMapping(value = "/contactadd/contactaddXdmForm")
	public String codeGroupXdmForm() {
		return "contactadd/contactaddXdmForm";
	}
	
	@RequestMapping(value = "/contactadd/contactaddXdmInst")
	public String codeGroupXdmInst(ContactaddDto contactaddDto) {
		contactaddService.insert(contactaddDto);
		return "redirect:/contactadd/contactaddXdmList";
	}
}


