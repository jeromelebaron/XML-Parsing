/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.interfaces;

import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;

/**
 * @author Jerome
 *
 */
public interface Accepteur<T> {

    void accepter(Visiteur visiteur, T elementAComparer, ArgumentVisiteur compteur);
}
