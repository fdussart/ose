package fr.mertzel.ose.modele;

import java.util.ArrayList;

import fr.mertzel.ose.vue.Observateur;

abstract class Observe {
	private ArrayList<Observateur> lesObservateurs = new ArrayList<Observateur>();
	
	public void ajouter (Observateur observateur){
		lesObservateurs.add(observateur);
	}
	
	public void supprimer(Observateur observateur){
		lesObservateurs.remove(observateur);
	}
	
	public void notifier(){
		for(Observateur observateur : lesObservateurs){
			observateur.actualiser();
		}
	}
}
