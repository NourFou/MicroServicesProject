package com.example.Services;

import java.util.List;

import com.exemple.entities.Carte;

public interface ServiceCarte {
	
	public  Carte saveCarte(Carte carte);
    public  Carte getCarte(int id);
    public  Carte updateCarte(Carte carte);
    public  void deleteCarte(int id);
    public  List<Carte> getCartes(int id);
    public  void activateCarte(int id);
	public  void desactivateCarte(int id);

}
