package com.exemple.entities;

import java.util.ArrayList;

import java.util.Collection;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Document
@Data @AllArgsConstructor @NoArgsConstructor
public class Abonne {

	@Override
	public String toString() {
		return "Abonne [idAbonne=" + idAbonne + ", nom=" + nom + ", prenom=" + prenom + ", cin=" + cin + ", type="
				+ type + ", tel=" + tel + ", adresse=" + adresse + ", nomComplet=" + nomComplet + ", domaine=" + domaine
				+ ", actif=" + actif + ", contrat=" + contrat + ", idBo=" + idBo + "]";
	}

	@Id
	private int idAbonne;
	private String nom;
	private String prenom;
	private String cin;
	private String type;
	private int idUser;
	private String tel;
	private String adresse;
	private String nomComplet;
	private String domaine;
    private Boolean actif;
    @DBRef  
    private Contrat contrat;
    private int idBo;
    
	public Abonne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdAbonne() {
		return idAbonne;
	}

	public void setIdAbonne(int idAbonne) {
		this.idAbonne = idAbonne;
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

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public Boolean getActif() {
		return actif;
	}

	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public int getIdBo() {
		return idBo;
	}

	public void setIdBo(int idBo) {
		this.idBo = idBo;
	}    

	
    //@DBRef
    //private  BO bo;
    //@DBRef
    //private Collection<Compte> comptes;
    


}
