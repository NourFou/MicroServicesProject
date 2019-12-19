package com.exemple.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class VirmentPermanent {
	@Id
	private int idVirment;
	private float montant;
	private Date date;
	private int frequence;
	private int idCompteSrc;
	private int idCompteBeneficiaire;
	
	public VirmentPermanent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdVirment() {
		return idVirment;
	}

	public void setIdVirment(int idVirment) {
		this.idVirment = idVirment;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getFrequence() {
		return frequence;
	}

	public void setFrequence(int frequence) {
		this.frequence = frequence;
	}

	public int getIdCompteSrc() {
		return idCompteSrc;
	}

	public void setIdCompteSrc(int idCompteSrc) {
		this.idCompteSrc = idCompteSrc;
	}

	public int getIdCompteBeneficiaire() {
		return idCompteBeneficiaire;
	}

	public void setIdCompteBeneficiaire(int idCompteBeneficiaire) {
		this.idCompteBeneficiaire = idCompteBeneficiaire;
	}
	
	

	
}
