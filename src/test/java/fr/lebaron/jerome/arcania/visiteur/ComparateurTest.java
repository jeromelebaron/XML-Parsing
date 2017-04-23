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
import fr.lebaron.jerome.arcania.visiteur.impl.CompteurDifference;

/**
 * @author Jerome
 *
 */
public class ComparateurTest {

    @Test
    public void test() {
        CompteurDifference compteur = new CompteurDifference();
        
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
        localPersonnes.add(personneTrois);
        
        compteur.setNbDifferences(0);
        int i = 0;
        int y = 0;
        while (++y < localPersonnes.size()) {
            compteur.compterDiffPersonne(localPersonnes.get(i),
                    localPersonnes.get(y));
            i++;
        }
        Assert.assertEquals(3, compteur.getNbDifferences());
    }

}
