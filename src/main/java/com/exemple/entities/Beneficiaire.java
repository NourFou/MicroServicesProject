package com.exemple.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class Beneficiaire {
	@Id
	private int idBeneficiaire;
	private int idCompteBeneficiaire;
	private int idCompteSrc;
	private String username;
	
	
	
	public Beneficiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdBeneficiaire() {
		return idBeneficiaire;
	}
	public void setIdBeneficiaire(int idBeneficiaire) {
		this.idBeneficiaire = idBeneficiaire;
	}
	public int getIdCompteBeneficiaire() {
		return idCompteBeneficiaire;
	}
	public void setIdCompteBeneficiaire(int idCompteBeneficiaire) {
		this.idCompteBeneficiaire = idCompteBeneficiaire;
	}
	public int getIdCompteSrc() {
		return idCompteSrc;
	}
	public void setIdCompteSrc(int idCompteSrc) {
		this.idCompteSrc = idCompteSrc;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	

}
