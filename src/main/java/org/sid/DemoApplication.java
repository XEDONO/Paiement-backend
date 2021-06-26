package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private ContactRepository contactRepository;
 
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//		contactRepository.save(new Contact("Hassani","Med",df.parse("12/10/1995"),"hassan@gmail.com",659481624,"hassan.jpg"));
//		contactRepository.save(new Contact("ibrahimi","khalid",df.parse("12/10/1995"),"khalid@gmail.com",659481224,"hassan.jpg"));
//		contactRepository.save(new Contact("laarichi","kawtar",df.parse("12/10/1995"),"kawtar@gmail.com",659481424,"hassan.jpg"));
//		contactRepository.findAll().forEach(c->{
//			System.out.println(c.getNom());
//		});
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
	}

}
