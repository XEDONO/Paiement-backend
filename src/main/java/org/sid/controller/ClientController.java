package org.sid.controller;

import java.util.List;

import org.sid.entities.Client;
import org.sid.web.ClientRestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api")
public class ClientController {
 
	@Autowired
	private ClientRestService clientService;
	
	@GetMapping("/clients")
//	@RequestMapping(value="/clients",method=RequestMethod.GET)
	public List<Client> getAllComments() {
		return clientService.GetClients();
	}
	
	
}
