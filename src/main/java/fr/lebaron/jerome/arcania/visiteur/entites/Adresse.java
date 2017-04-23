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
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurAdresse;

/**
 * @author Jerome
 */
public class Adresse implements Element, Comparer<Adresse>, Accepteur<Adresse> {

    private int    numero;

    private String voie;

    private Ville ville;
    
    /**
     * 
     */
    public Adresse() {
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param paramNumero the numero to set
     */
    public void setNumero(int paramNumero) {
        numero = paramNumero;
    }

    /**
     * @return the voie
     */
    public String getVoie() {
        return voie;
    }

    /**
     * @param paramVoie the voie to set
     */
    public void setVoie(String paramVoie) {
        voie = paramVoie;
    }

    
    
    /**
     * @return the ville
     */
    public Ville getVille() {
        return ville;
    }

    /**
     * @param paramVille the ville to set
     */
    public void setVille(Ville paramVille) {
        ville = paramVille;
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Element#accept(fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur)
     */
    @Override
    public void accept(ITestVisiteur paramVisiteur) {
        paramVisiteur.visitAddress(this);
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Comparer#compterDifference(java.lang.Object)
     */
    @Override
    public int compterDifference(Adresse paramAutreElement) {
        int nbDifferences = 0;
        if (getNumero() != paramAutreElement.getNumero()) {
            nbDifferences++;
        }
        if (!getVoie().equals(paramAutreElement.getVoie())) {
            nbDifferences++;
        }
        return nbDifferences;
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.Accepteur#accepter(fr.lebaron.jerome.arcania.visiteur.interfaces.Visiteur, java.lang.Object, java.lang.Integer)
     */
    @Override
    public void accepter(Visiteur paramVisiteur, Adresse paramElementAComparer,
            ArgumentVisiteur paramCompteur) {
        final VisiteurAdresse visiteur = (VisiteurAdresse) paramVisiteur;
        visiteur.visit(this, paramElementAComparer, paramCompteur);
    }

}
