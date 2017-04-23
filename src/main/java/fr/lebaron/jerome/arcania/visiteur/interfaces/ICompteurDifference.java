/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.interfaces;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.entites.Ville;

/**
 * @author Jerome
 *
 */
public interface ICompteurDifference {

    void compterDiffPersonne(Personne personneUn, Personne personneDeux);
    
    void compterDiffAdresse(Adresse adresseUn, Adresse adresseDeux);
    
    void compterDiffVille(Ville villeUn, Ville villeDeux);
    
}
