package com.exemple.entities;

public class Releve extends Operation {

	private String debitCredit;

	public Releve(Operation operation , String debitCredit) {
		super(operation);
		this.debitCredit = debitCredit;
	}
	
//envoyer list des relever a sara 

}
