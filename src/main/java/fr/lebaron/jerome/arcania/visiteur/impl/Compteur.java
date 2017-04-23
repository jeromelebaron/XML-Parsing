/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.impl;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.entites.Ville;
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurAdresse;
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurPersonne;
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurVille;

/**
 * @author Jerome
 */
public class Compteur implements VisiteurPersonne, VisiteurAdresse, VisiteurVille {

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurPersonne#visit(fr.lebaron.jerome.arcania.visiteur.entites.Personne,
     * fr.lebaron.jerome.arcania.visiteur.entites.Personne, java.lang.Integer)
     */
    @Override
    public void visit(Personne paramPersonneUn, Personne paramPersonneDeux,
            ArgumentVisiteur paramCompteur) {
        System.out.println("Visite personne");
        if (!paramPersonneUn.getPrenom().equals(paramPersonneDeux.getPrenom())) {
            paramCompteur.setNbDifference(paramCompteur.getNbDifference() + 1);
            paramCompteur.getChangements().add("Changement de prénom : "
                    + paramPersonneUn.getPrenom() + " -> " + paramPersonneDeux.getPrenom());
        }
        if (!paramPersonneUn.getNom().equals(paramPersonneDeux.getNom())) {
            paramCompteur.setNbDifference(paramCompteur.getNbDifference() + 1);
            paramCompteur.getChangements().add("Changement de nom : "
                    + paramPersonneUn.getNom() + " -> " + paramPersonneDeux.getNom());
        }
        paramPersonneUn.getAdresse().accepter(this, paramPersonneDeux.getAdresse(),
                paramCompteur);
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurAdresse#visit(fr.lebaron.jerome.arcania.visiteur.entites.Adresse,
     * fr.lebaron.jerome.arcania.visiteur.entites.Adresse, java.lang.Integer)
     */
    @Override
    public void visit(Adresse paramAdresseUn, Adresse paramAdresseDeux,
            ArgumentVisiteur paramCompteur) {
        System.out.println("Visite adresse");
        if (paramAdresseUn.getNumero() != paramAdresseDeux.getNumero()) {
            paramCompteur.setNbDifference(paramCompteur.getNbDifference() + 1);
            paramCompteur.getChangements().add("Changement de numéro : "
                    + paramAdresseUn.getNumero() + " -> " + paramAdresseDeux.getNumero());
        }
        if (!paramAdresseUn.getVoie().equals(paramAdresseDeux.getVoie())) {
            paramCompteur.setNbDifference(paramCompteur.getNbDifference() + 1);
            paramCompteur.getChangements().add("Changement de voie : "
                    + paramAdresseUn.getVoie() + " -> " + paramAdresseDeux.getVoie());
        }
        paramAdresseUn.getVille().accepter(this, paramAdresseDeux.getVille(),
                paramCompteur);
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurVille#visit(fr.lebaron.jerome.arcania.visiteur.entites.Ville,
     * fr.lebaron.jerome.arcania.visiteur.entites.Ville, java.lang.Integer)
     */
    @Override
    public void visit(Ville paramVilleUn, Ville paramVilleDeux,
            ArgumentVisiteur paramCompteur) {
        System.out.println("Visite ville");
        if (!paramVilleUn.equals(paramVilleDeux)) {
            paramCompteur.setNbDifference(paramCompteur.getNbDifference() + 1);
            paramCompteur.getChangements().add(
                    "Changement de ville : " + paramVilleUn + " -> " + paramVilleDeux);
        }
    }

}
