package com.kjw.fapp.contactemail;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactemailDao {
	
	public List<ContactemailDto> selectList();
	
	public ContactemailDto selectOne(ContactemailDto contactemailDto);
	
	public int insert(ContactemailDto contactemailDto);
		
	

}
