/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.entites;

import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Accepteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Comparer;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Element;
import fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Visiteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurPersonne;

/**
 * @author Jerome
 */
public class Personne implements Element, Comparer<Personne>, Accepteur<Personne> {

    private String  prenom;

    private String  nom;

    private Adresse adresse;

    /**
     * 
     */
    public Personne() {
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param paramPrenom the prenom to set
     */
    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param paramNom the nom to set
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    }

    /**
     * @return the adresse
     */
    public Adresse getAdresse() {
        return adresse;
    }

    /**
     * @param paramAdresse the adresse to set
     */
    public void setAdresse(Adresse paramAdresse) {
        adresse = paramAdresse;
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Element#accept(fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur)
     */
    @Override
    public void accept(ITestVisiteur paramVisiteur) {
        paramVisiteur.visitPerson(this);
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Comparer#compterDifference(java.lang.Object)
     */
    @Override
    public int compterDifference(Personne paramAutreElement) {
        int nbDifferences = 0;
        if (!getPrenom().equals(paramAutreElement.getPrenom())) {
            nbDifferences++;
        }
        if (!getNom().equals(paramAutreElement.getNom())) {
            nbDifferences++;
        }
        return nbDifferences;
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Accepteur#accepter(fr.lebaron.jerome.arcania.visiteur.interfaces.Visiteur, java.lang.Object, java.lang.Integer)
     */
    @Override
    public void accepter(Visiteur paramVisiteur, Personne paramElementAComparer,
            ArgumentVisiteur paramCompteur) {
        final VisiteurPersonne visiteur = (VisiteurPersonne) paramVisiteur;
        visiteur.visit(this, paramElementAComparer, paramCompteur);
    }

}
