package com.kjw.fapp.team;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface TeamDao {
	
//	mapper에서 해당하는 쿼리와 연결시켜줌
//	쿼리 결과를 가져옴
	
	public List<TeamDto> selectList();
		
	

}
