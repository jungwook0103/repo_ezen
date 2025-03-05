package com.kjw.fapp.contactadd;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.kjw.fapp.contactadd.ContactaddDto;

@Repository
public interface ContactaddDao {
	
	public List<ContactaddDto> selectList();
	
	public ContactaddDto selectOne(ContactaddDto contactaddDto);
	
	public int insert(ContactaddDto contactaddDto);

}
