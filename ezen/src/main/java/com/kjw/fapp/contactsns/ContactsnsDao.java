package com.kjw.fapp.contactsns;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactsnsDao {
	
	public List<ContactsnsDto> selectList();
	
	public ContactsnsDto selectOne(ContactsnsDto contactsnsDto);

}
