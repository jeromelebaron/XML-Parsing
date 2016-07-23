/**
 * 
 */
package fr.lebaron.jerome.xml.entities;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jerome
 */
@XmlRootElement(name = "ROOT")
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

    @XmlElement(name = "personne")
    private Personne personne;

    /**
     * @return the personne
     */
    public Personne getPersonne() {
        return personne;
    }

    /**
     * @param paramPersonne the personne to set
     */
    public void setPersonne(Personne paramPersonne) {
        personne = paramPersonne;
    }

}
