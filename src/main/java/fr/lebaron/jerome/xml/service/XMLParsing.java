/**
 * 
 */
package fr.lebaron.jerome.xml.service;

import java.io.File;

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

        String pathFichierXML = Thread.currentThread().getContextClassLoader().getResource("personne-test.xml").getPath();
        File fichierXML = new File(pathFichierXML);

        JAXBContext jaxbContext = JAXBContext.newInstance(Root.class);
        Unmarshaller jaxbUnMarshaller = jaxbContext.createUnmarshaller();
        Root root = (Root) jaxbUnMarshaller.unmarshal(fichierXML);
        return root.getPersonne();
    }

}
