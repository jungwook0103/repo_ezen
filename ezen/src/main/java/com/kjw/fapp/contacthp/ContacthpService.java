package com.kjw.fapp.contacthp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContacthpService {
	
	@Autowired
	ContacthpDao contacthpDao;
	
	public List<ContacthpDto> selectList() {
		return contacthpDao.selectList();
	}
	
	public ContacthpDto selectOne(ContacthpDto contacthpDto) {
		return contacthpDao.selectOne(contacthpDto);
	}

}
