/**
 * 
 */
package fr.lebaron.jerome.xml.service;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import fr.lebaron.jerome.xml.entities.Personne;
import fr.lebaron.jerome.xml.entities.Root;

/**
 * @author Jerome
 */
public class XMLParsing {

    public Personne getPersonneFromXML() throws JAXBException {
        InputStream fichierXML = Thread.currentThread().getContextClassLoader().getResourceAsStream("personne-test.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
        Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
        Root root = (Root) jaxbUnMarshaller.unmarshal(fichierXML);
        return root.getPersonne();
    }

}
