package com.kjw.fapp.contactgroup;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactgroupDao {
	
	public List<ContactgroupDto> selectList();

}
