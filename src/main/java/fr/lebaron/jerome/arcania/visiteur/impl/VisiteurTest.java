/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.impl;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur;

/**
 * @author Jerome
 *
 */
public class VisiteurTest implements ITestVisiteur {

    
    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur#visitPerson(fr.lebaron.jerome.arcania.visiteur.entites.Personne)
     */
    @Override
    public void visitPerson(Personne paramP) {
        System.out.println("Je passe dans personne");
        paramP.getAdresse().accept(this);
    }

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur#visitAddress(fr.lebaron.jerome.arcania.visiteur.entites.Adresse)
     */
    @Override
    public void visitAddress(Adresse paramA) {
        System.out.println("Je passe dans adresse");
    }

}
