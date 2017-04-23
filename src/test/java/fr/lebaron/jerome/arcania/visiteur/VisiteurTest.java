/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import fr.lebaron.jerome.arcania.visiteur.entites.Adresse;
import fr.lebaron.jerome.arcania.visiteur.entites.Personne;
import fr.lebaron.jerome.arcania.visiteur.entites.Ville;
import fr.lebaron.jerome.arcania.visiteur.impl.ArgumentVisiteur;
import fr.lebaron.jerome.arcania.visiteur.impl.Compteur;
import fr.lebaron.jerome.arcania.visiteur.interfaces.VisiteurPersonne;

/**
 * @author Jerome
 *
 */
public class VisiteurTest {

    @Test
    public void test() {
        VisiteurPersonne compteur = new Compteur();
        
        List<Personne> localPersonnes = new ArrayList<>();
        
        Personne personneUn = new Personne();
        personneUn.setNom("LE BARON");
        personneUn.setPrenom("Jérome");
        Adresse adresseUn = new Adresse();
        adresseUn.setNumero(3);
        adresseUn.setVoie("Rue christophe");
        Ville villeUn = new Ville();
        villeUn.setCodePostal("92230");
        villeUn.setLibelle("Levallois");
        adresseUn.setVille(villeUn);
        personneUn.setAdresse(adresseUn);
        localPersonnes.add(personneUn);
        
        Personne personneDeux = new Personne();
        personneDeux.setNom("LE BARON");
        personneDeux.setPrenom("Jérome");
        Adresse adresseDeux = new Adresse();
        adresseDeux.setNumero(4);
        adresseDeux.setVoie("Rue christophe");
        personneDeux.setAdresse(adresseDeux);
        adresseDeux.setVille(villeUn);
        localPersonnes.add(personneDeux);
        
        Personne personneTrois = new Personne();
        personneTrois.setNom("LE BARON");
        personneTrois.setPrenom("Jérome");
        Adresse adresseTrois = new Adresse();
        adresseTrois.setNumero(5);
        adresseTrois.setVoie("Rue christophe");
        personneTrois.setAdresse(adresseTrois);
        Ville villeDeux = new Ville();
        villeDeux.setCodePostal("92600");
        villeDeux.setLibelle("Asnières");
        adresseTrois.setVille(villeDeux);
        localPersonnes.add(personneTrois);
        
        Personne personneQuatre = new Personne();
        personneQuatre.setNom("CERF");
        personneQuatre.setPrenom("David");
        Adresse adresseQuatre = new Adresse();
        adresseQuatre.setNumero(37);
        adresseQuatre.setVoie("Rue gabriel crié");
        personneQuatre.setAdresse(adresseQuatre);
        Ville villeTrois = new Ville();
        villeTrois.setCodePostal("92240");
        villeTrois.setLibelle("Malakoff");
        adresseQuatre.setVille(villeTrois);
        localPersonnes.add(personneQuatre);
        
        int i = 0;
        int y = 0;
        ArgumentVisiteur resultat = new ArgumentVisiteur();
        while (++y < localPersonnes.size()) {
            compteur.visit(localPersonnes.get(i),
                    localPersonnes.get(y), resultat);
            i++;
        }
        Assert.assertEquals(8, resultat.getNbDifference());
        for (String changement : resultat.getChangements()) {
            System.out.println(changement);
        }
    }

}
