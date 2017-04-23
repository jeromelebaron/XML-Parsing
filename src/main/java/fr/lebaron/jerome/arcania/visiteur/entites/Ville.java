/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.entites;

import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Accepteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Comparer;
import fr.lebaron.jerome.arcania.visiteur.interfaces.Visiteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurVille;

/**
 * @author Jerome
 */
public class Ville implements Comparer<Ville>, Accepteur<Ville> {

    private String codePostal;

    private String libelle;

    /**
     * 
     */
    public Ville() {
    }

    /**
     * @return the codePostal
     */
    public String getCodePostal() {
        return codePostal;
    }

    /**
     * @param paramCodePostal the codePostal to set
     */
    public void setCodePostal(String paramCodePostal) {
        codePostal = paramCodePostal;
    }

    /**
     * @return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param paramLibelle the libelle to set
     */
    public void setLibelle(String paramLibelle) {
        libelle = paramLibelle;
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Comparer#compterDifference(java.lang.Object)
     */
    @Override
    public int compterDifference(Ville paramAutreElement) {
        int nbDifferences = 0;
        if (!this.equals(paramAutreElement)) {
            nbDifferences++;
        }
        return nbDifferences;
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Accepteur#accepter(fr.lebaron.jerome.arcania.visiteur.interfaces.Visiteur, java.lang.Object, java.lang.Integer)
     */
    @Override
    public void accepter(Visiteur paramVisiteur, Ville paramElementAComparer,
            ArgumentVisiteur paramCompteur) {
        final VisiteurVille visiteur = (VisiteurVille) paramVisiteur;
        visiteur.visit(this, paramElementAComparer, paramCompteur);
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Ville [codePostal=" + codePostal + ", libelle=" + libelle + "]";
    }

    
}
