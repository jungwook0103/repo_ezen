package com.kjw.fapp.contactanniv;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ContactannivDao {
	
	public List<ContactannivDto> selectList();
	
	public ContactannivDto selectOne(ContactannivDto contactannivDto);
	
	public int insert(ContactannivDto contactannivDto);

}
