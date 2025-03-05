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
		
//		List<TeamDto> teamDtos = new ArrayList<>();
//		
//		teamDtos = teamService.selectList();
		
		model.addAttribute("list", teamService.selectList());
		
		return "team/teamXdmList";
	}

	@RequestMapping(value = "/team/teamXdmView")
	public String codeGroupXdmView(Model model, TeamDto teamDto) {
		
		//System.out.println("teamDto.getGroupseq(): " + teamDto.getGroupseq());
			
		model.addAttribute("item", teamService.selectOne(teamDto));
		
		return "team/teamXdmView";
	}
	
	@RequestMapping(value = "/team/teamXdmForm")
	public String codeGroupXdmForm() {
		
		
		return "team/teamXdmForm";
	}
	
	@RequestMapping(value = "/team/teamXdmInst")
	public String codeGroupXdmInst(TeamDto teamDto) {		
		System.out.println("Groupseq: " + teamDto.getGroupseq());
		System.out.println("Name: " + teamDto.getName());		
		teamService.insert(teamDto);
		System.out.println(teamDto.getGroupseq());
		return "redirect:/team/teamXdmList";
	}
}
