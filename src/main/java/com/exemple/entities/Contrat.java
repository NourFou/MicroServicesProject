package com.exemple.entities;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document
@Data @AllArgsConstructor @NoArgsConstructor 
public class Contrat {
	@Id
    private int idContrat  ;
    private  Date dateDebut;
    private  Date dateExpiration;
    private int idAbonne;
    @DBRef
    private Collection<Offre> offres;
    
	public Contrat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdContrat() {
		return idContrat;
	}

	public void setIdContrat(int idContrat) {
		this.idContrat = idContrat;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public int getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(int idAbonne) {
		this.idAbonne = idAbonne;
	}

	public Collection<Offre> getOffres() {
		return offres;
	}

	public void setOffres(Collection<Offre> offres) {
		this.offres = offres;
	}
    
    
}
