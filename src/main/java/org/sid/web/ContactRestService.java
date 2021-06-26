package org.sid.web;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ContactRestService {
	@Autowired
	private ContactRepository contactRepository;
	@RequestMapping(value="/contacts",method=RequestMethod.GET)
	public List<Contact> getC0ntacts(){
		return contactRepository.findAll();
	}

}