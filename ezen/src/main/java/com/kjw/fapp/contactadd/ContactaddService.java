package com.kjw.fapp.contactadd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactaddService {
	
	@Autowired
	ContactaddDao contactaddDao; 
	
	public List<ContactaddDto> selectList() {
//		
		return contactaddDao.selectList();
	}
	
	public ContactaddDto selectOne(ContactaddDto contactaddDto) {
		return contactaddDao.selectOne(contactaddDto);
	}
	
	public int insert(ContactaddDto contactaddDto) {
		return contactaddDao.insert(contactaddDto);
	}

}


