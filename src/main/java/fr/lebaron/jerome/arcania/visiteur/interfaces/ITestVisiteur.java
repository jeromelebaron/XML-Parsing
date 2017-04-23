/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.interfaces;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;

/**
 * @author Jerome
 *
 */
public interface ITestVisiteur {

    void visitPerson(Personne p);
    void visitAddress(Adresse a);
}
