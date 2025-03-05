package com.kjw.fapp.team;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamService {
	
//	로직을 정의하는 부분
	
//	여러건의 데이터를 가지고 온다.
	
	@Autowired
	TeamDao teamDao; // TeamDao teamDao = new TeamDao();
	
	public List<TeamDto> selectList() {
//		List<TeamDto> teamDtos = new ArrayList<>();
//		
//		teamDtos = teamDao.selectList();
		return teamDao.selectList();
	}
	
//	public List<TeamDto> selectList() {
//		return teamDao.selectList();
//	}
	
	public TeamDto selectOne(TeamDto teamDto) {
		return teamDao.selectOne(teamDto);
	}

	public int insert(TeamDto teamDto) {
		return teamDao.insert(teamDto);
	}
}
