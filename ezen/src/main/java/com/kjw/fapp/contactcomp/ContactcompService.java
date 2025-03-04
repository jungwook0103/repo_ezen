package com.kjw.fapp.contactcomp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactcompService {
	
	@Autowired
	ContactcompDao contactcompDao;
	
	public List<ContactcompDto> selectList() {
		return contactcompDao.selectList();
	}
	
	public ContactcompDto selectOne(ContactcompDto contactcompDto) {
		return contactcompDao.selectOne(contactcompDto);
	}

}
