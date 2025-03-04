package com.kjw.fapp.contactsns;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactsnsService {
	
	@Autowired
	ContactsnsDao contactsnsDao;
	
	public List<ContactsnsDto> selectList() {
		return contactsnsDao.selectList();
	}
	
	public ContactsnsDto selectOne(ContactsnsDto contactsnsDto) {
		return contactsnsDao.selectOne(contactsnsDto);
	}

}
