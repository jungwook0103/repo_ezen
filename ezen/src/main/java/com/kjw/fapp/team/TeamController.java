package com.kjw.fapp.team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TeamController {
	
	// 입력되는 주소에 매칭이 되는 html 정보를 정의
	// html로 데이터 전달
	
	@Autowired
	TeamService teamService;
	
	@RequestMapping(value = "/team/teamXdmList")
	public String codeGroupXdmList(Model model) {
		
		List<TeamDto> teamDtos = new ArrayList<>();
		
		teamDtos = teamService.selectList();
		
		model.addAttribute("list", teamDtos);
		
		return "team/teamXdmList";
	}

}
