/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.impl.VisiteurTest;
import fr.lebaron.jerome.arcania.visiteur.interfaces.ITestVisiteur;

/**
 * @author Jerome
 *
 */
public class TestVisiteurMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
        ITestVisiteur visiteur = new VisiteurTest();
        Personne personne = new Personne();
        personne.setAdresse(new Adresse());
        visiteur.visitPerson(personne);
    }

}
