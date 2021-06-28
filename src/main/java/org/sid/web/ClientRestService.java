package org.sid.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.sid.dao.ClientRepository;
import org.sid.entities.Client;
import org.sid.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;

@Service 
public class ClientRestService {
	
	
@Autowired
private  ClientRepository clientRepository;


public List<Client> GetClients() {
    return clientRepository.findAll();
}

@GetMapping("/clients/{id}")
public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long id)
		throws ResourceNotFoundException {
	Client client = clientRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
	return ResponseEntity.ok().body(client);
}




@PostMapping("/clients")
public Client createClient(@Validated @RequestAttribute Client employee) {
	return clientRepository.save(employee);
}




@PutMapping("/clients/{id}")
public ResponseEntity<Client> updateEmployee(@PathVariable(value = "id") Long id,
		@Validated @RequestBody Client clientDetails) throws ResourceNotFoundException {
	Client client = clientRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Client pas trouvé pour cette id :: " + id));

	client.setNom(clientDetails.getNom());
	client.setPrenom(clientDetails.getPrenom());
	final Client updatedClient = clientRepository.save(client);
	return ResponseEntity.ok(updatedClient);
}


@DeleteMapping("/employees/{id}")
public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long id)
		throws ResourceNotFoundException {
	Client client = clientRepository.findById(id)
			.orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + id));

	clientRepository.delete(client);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deleted", Boolean.TRUE);
	return response;
}




}
