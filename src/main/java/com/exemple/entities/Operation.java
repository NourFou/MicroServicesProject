package com.exemple.entities;

import java.util.Collection;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class Operation {
	@Id
	private int idOperation;
	private float montant;
	private Date date;
	private String type;
	private int numFacture;
	private int idCompteSrc;
	private int idCompteBeneficiaire;
    
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdOperation() {
		return idOperation;
	}

	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(int numFacture) {
		this.numFacture = numFacture;
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

	public Operation(Operation operation) {
		super();
		this.idOperation = operation.idOperation;
		this.montant = operation.montant;
		this.date = operation.date;
		this.type = operation.type;
		this.numFacture = operation.numFacture;
		this.idCompteSrc = operation.idCompteSrc;
		this.idCompteBeneficiaire = operation.idCompteBeneficiaire;
	}

    
	

}
