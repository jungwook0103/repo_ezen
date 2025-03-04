package com.kjw.fapp.contactanniv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactannivService {
	
	@Autowired
	ContactannivDao contactannivDao;
	
	public List<ContactannivDto> selectList() {
		return contactannivDao.selectList();
	}
	
	public ContactannivDto selectOne(ContactannivDto contactannivDto) {
		return contactannivDao.selectOne(contactannivDto);
	}
	
	

}
