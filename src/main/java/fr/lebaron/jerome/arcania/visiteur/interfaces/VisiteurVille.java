/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.interfaces;

import fr.lebaron.jerome.arcania.visiteur.entites.Ville;
import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;

/**
 * @author Jerome
 *
 */
public interface VisiteurVille extends Visiteur {

    void visit(Ville villeUn, Ville villeDeux, ArgumentVisiteur compteur);
}
