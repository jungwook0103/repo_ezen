package com.kjw.fapp.contactnumber;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactnumberDao {
	
	public List<ContactnumberDto> selectList();
	
	public ContactnumberDto selectOne(ContactnumberDto contactnumberDto);
	
	public int insert(ContactnumberDto contactnumberDto);

}
