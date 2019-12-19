package com.exemple.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data @AllArgsConstructor @NoArgsConstructor 
public class Carte {
	@Id
	private int idCarte;
	private String type;
	private int idCompte;
	private boolean isActivate;
	
	@Override
	public String toString() {
		return "Carte [idCarte=" + idCarte + ", type=" + type + ", idCompte=" + idCompte + ", isActivate=" + isActivate
				+ "]";
	}

	public boolean isActivate() {
		return isActivate;
	}

	public void setActivate(boolean isActivate) {
		this.isActivate = isActivate;
	}

	public Carte() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCarte() {
		return idCarte;
	}

	public void setIdCarte(int idCarte) {
		this.idCarte = idCarte;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(int idCompte) {
		this.idCompte = idCompte;
	}
	
	

}
