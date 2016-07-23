/**
 * 
 */
package fr.lebaron.jerome.xml.service;

import java.util.List;

import javax.xml.bind.JAXBException;

import org.junit.Assert;
import org.junit.Test;

import fr.lebaron.jerome.xml.entities.Demande;
import fr.lebaron.jerome.xml.entities.Echeance;
import fr.lebaron.jerome.xml.entities.Personne;

/**
 * @author Jerome
 */
public class XMLParsingTest {

    /**
     * Test method for {@link fr.lebaron.jerome.xml.service.XMLParsing#getPersonneFromXML()}.
     */
    @Test
    public void testGetPersonneFromXML() {
        XMLParsing xmlParsing = new XMLParsing();
        try {
            Personne personne = xmlParsing.getPersonneFromXML();
            Assert.assertNotNull(personne);
            Assert.assertEquals(123, personne.getIdPersonnel());
            Assert.assertEquals("LE BARON", personne.getNom());
            Assert.assertEquals("Jérome", personne.getPrenom());
            Assert.assertEquals("22/09/1986", personne.getDateDeNaissance());
            
            Demande demande = personne.getDemande();
            Assert.assertNotNull(demande);
            Assert.assertEquals(456, demande.getNumero());
            Assert.assertEquals("22/09/2006", demande.getDateDemande());
            
            List<Echeance> echeances = demande.getEcheances();
            Assert.assertNotNull(echeances);
            Assert.assertEquals(2, echeances.size());
        } catch (JAXBException exception) {
            exception.printStackTrace();
            Assert.fail();
        }
    }

}
