package org.sid.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="villes")
public class Ville implements Serializable{

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String label;
	
	
	public Ville() {
		
	}
	
	
	public Ville(String label) {
		super();
		this.label = label;
	}
	
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "client_fid",referencedColumnName = "id" )
//	List<Client> clients= new ArrayList<Client>();
	
	
//	public List<Client> getClients() {
//		return clients;
//	}
//	public void setClients(List<Client> clients) {
//		this.clients = clients;
//	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ville other = (Ville) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
