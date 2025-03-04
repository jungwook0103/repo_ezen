package com.kjw.fapp.contactnumber;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactnumberService {
	
	@Autowired
	ContactnumberDao contactnumberDao;
	
	public List<ContactnumberDto> selectList() {
		return contactnumberDao.selectList();
	}
	
	public ContactnumberDto selectOne(ContactnumberDto contactnumberDto) {
		return contactnumberDao.selectOne(contactnumberDto);
	}

}
