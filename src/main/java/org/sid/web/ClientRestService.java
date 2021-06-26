package org.sid.web;

import java.util.List;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 
public class ClientRestService {
	
	
@Autowired
private  ClientRepository clientRepository;


public List<Client> GetClients() {
    return clientRepository.findAll();
}



}
