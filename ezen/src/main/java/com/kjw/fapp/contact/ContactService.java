package com.kjw.fapp.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kjw.fapp.team.TeamDto;

@Service
public class ContactService {
	
	@Autowired
	ContactDao contactDao; 
	
	public List<ContactDto> selectList() {
//		
		return contactDao.selectList();
	}
	
	public ContactDto selectOne(ContactDto contactDto) {
		return contactDao.selectOne(contactDto);
	}
	
	public int insert(ContactDto contactDto) {
		return contactDao.insert(contactDto);
	}

}
