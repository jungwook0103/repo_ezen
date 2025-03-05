package com.kjw.fapp.contacthp;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContacthpDao {
	
	public List<ContacthpDto> selectList();
	
	public ContacthpDto selectOne(ContacthpDto contacthpDto);
	
	public int insert(ContacthpDto contacthpDto);

}
