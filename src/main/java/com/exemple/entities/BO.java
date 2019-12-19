package com.exemple.entities;

import java.util.Collection;

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
public class BO {
	@Id
    private int idBo  ;
	private String nom;
	private String prenom;
	private String cin;
	private String type;
	private int idUser;
	private String tel;
	private String adresse;
	private int idAgence;
    @Override
	public String toString() {
		return "BO [idBo=" + idBo + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", type=" + type + ", tel="
				+ tel + ", adresse=" + adresse + ", idAgence=" + idAgence + "]";
	}
	public int getIdAgence() {
		return idAgence;
	}
	public void setIdAgence(int idAgence) {
		this.idAgence = idAgence;
	}
	@DBRef
    private Collection<Abonne> abonnes;
    
    
    
	public BO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdBo() {
		return idBo;
	}
	public void setIdBo(int idBo) {
		this.idBo = idBo;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Collection<Abonne> getAbonnes() {
		return abonnes;
	}
	public void setAbonnes(Collection<Abonne> abonnes) {
		this.abonnes = abonnes;
	}

    
    

}
