/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.interfaces;

import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;

/**
 * @author Jerome
 *
 */
public interface VisiteurPersonne extends Visiteur {

    void visit(Personne personneUn, Personne personneDeux, ArgumentVisiteur compteur);
}
