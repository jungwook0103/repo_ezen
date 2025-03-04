package com.kjw.fapp.contactcomp;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactcompDao {
	
	public List<ContactcompDto> selectList();
	
	public ContactcompDto selectOne(ContactcompDto contactcompDto);

}
