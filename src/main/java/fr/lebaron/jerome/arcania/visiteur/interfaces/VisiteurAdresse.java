/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.interfaces;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;

/**
 * @author Jerome
 *
 */
public interface VisiteurAdresse extends Visiteur {
    
    void visit(Adresse adresseUn, Adresse adresseDeux, ArgumentVisiteur compteur);
    
}
