package com.kjw.fapp.contactemail;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactemailService {
	
	@Autowired
	ContactemailDao contactemailDao;
	
	public List<ContactemailDto> selectList() {
		return contactemailDao.selectList(); 
	}
	
	public ContactemailDto selectOne(ContactemailDto contactemailDto) {
		return contactemailDao.selectOne(contactemailDto);
	}
	
	public int insert(ContactemailDto contactemailDto) {
		return contactemailDao.insert(contactemailDto);
	}

}
