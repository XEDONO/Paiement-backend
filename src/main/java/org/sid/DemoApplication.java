package org.sid;


import org.sid.dao.ClientRepository;
import org.sid.dao.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ClientRepository clientRepository;
	 
	@Autowired
	private VilleRepository villeRepository;
 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//Ville ville = new Ville("Casablanca");
		
		
          //Client client1 = new Client("nom1", "prenom1", "0654879865", "BmCE",ville);
         // Client client2 = new Client("nom2", "prenom2", "0654879865", "BmCE",ville);
          //Client client3 = new Client("nom3", "prenom3", "0654879865", "BmCE",ville);
          
         
          
          //this.clientRepository.save(client1);
      //    this.clientRepository.save(client2);
       //   this.clientRepository.save(client3);
	} 

}