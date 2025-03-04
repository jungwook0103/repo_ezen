package com.kjw.fapp.contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
	
	@Autowired
	ContactDao contactDao; 
	
	public List<ContactDto> selectList() {
//		
		return contactDao.selectList();
	}

}
