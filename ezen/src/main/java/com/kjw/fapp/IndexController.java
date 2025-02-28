package com.kjw.fapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
		
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping(value = "/index2")
	public String index2() {
		return "abc/inddex";
	}
	
	@RequestMapping(value = "/helloworld")
	public String index3() {
		return "helloworld";
	}
	
	@RequestMapping(value = "/aaa/bbb")
	public String index4() {
		return "bbb/aaa";
	}
	
	@RequestMapping(value = "/xxx/yyy/zzz")
	public String index5() {
		return "yyy/zzz";
	}
	
	@RequestMapping(value = "/ttt/yyy")
	public String index6() {
		return "zzz/yyy/xxx";
	}
	
	@RequestMapping(value = "/infra/member/loginXdmForm")
	public String index7() {
		return "adm/v1/tmpname/infra/member/loginForm";
	}
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmList")
	public String index9() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupList";
	}
	
	@RequestMapping(value = "/infra/codegroup/codeGroupXdmForm")
	public String index10() {
		return "adm/v1/tmpname/infra/codegroup/codeGroupForm";
	}
	
	@RequestMapping(value = "/infra/member/loginUsrForm")
	public String index11() {
		return "usr/v1/tmpname/infra/member/loginForm";
	}
	

}
