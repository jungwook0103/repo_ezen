package com.kjw.fapp.contactgroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactgroupService {
	
	@Autowired
	ContactgroupDao contactgroupDao;
	
	public List<ContactgroupDto> selectList() {
		return contactgroupDao.selectList();
	}

}
