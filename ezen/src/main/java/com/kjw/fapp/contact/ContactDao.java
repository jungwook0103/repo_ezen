package com.kjw.fapp.contact;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kjw.fapp.team.TeamDto;

@Repository
public interface ContactDao {
	
	public List<ContactDto> selectList();
	
	public ContactDto selectOne(ContactDto contactDto);
	
	public int insert(ContactDto contactDto);

}
