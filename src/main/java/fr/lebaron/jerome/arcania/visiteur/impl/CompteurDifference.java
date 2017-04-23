/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.impl;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.entites.Ville;
import fr.lebaron.jerome.arcania.visiteur.interfaces.ICompteurDifference;

/**
 * @author Jerome
 *
 */
public class CompteurDifference implements ICompteurDifference {

    private int nbDifferences;
    
    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.ICompteurDifference#compterDiffPersonne(fr.lebaron.jerome.arcania.visiteur.entites.Personne, fr.lebaron.jerome.arcania.visiteur.entites.Personne)
     */
    @Override
    public void compterDiffPersonne(Personne paramPersonneUn,
            Personne paramPersonneDeux) {
        System.out.println("Compte personne");
        nbDifferences += paramPersonneUn.compterDifference(paramPersonneDeux);
        compterDiffAdresse(paramPersonneUn.getAdresse(), paramPersonneDeux.getAdresse());
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.ICompteurDifference#compterDiffAdresse(fr.lebaron.jerome.arcania.visiteur.entites.Adresse, fr.lebaron.jerome.arcania.visiteur.entites.Adresse)
     */
    @Override
    public void compterDiffAdresse(Adresse paramAdresseUn, Adresse paramAdresseDeux) {
        System.out.println("Compte adresse");
        compterDiffVille(paramAdresseUn.getVille(), paramAdresseDeux.getVille());
        nbDifferences += paramAdresseUn.compterDifference(paramAdresseDeux);
    }

    /**
     * @return the nbDifferences
     */
    public int getNbDifferences() {
        return nbDifferences;
    }

    /**
     * @param paramNbDifferences the nbDifferences to set
     */
    public void setNbDifferences(int paramNbDifferences) {
        nbDifferences = paramNbDifferences;
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.ICompteurDifference#compterDiffVille(fr.lebaron.jerome.arcania.visiteur.interfaces.Ville, fr.lebaron.jerome.arcania.visiteur.interfaces.Ville)
     */
    @Override
    public void compterDiffVille(Ville paramVilleUn, Ville paramVilleDeux) {
        System.out.println("Compte ville");
        nbDifferences += paramVilleUn.compterDifference(paramVilleDeux);
    }

    
}
