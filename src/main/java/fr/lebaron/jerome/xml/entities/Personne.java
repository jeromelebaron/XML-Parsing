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
@XmlRootElement(name = "personne")
@XmlAccessorType(XmlAccessType.FIELD)
public class Personne {

    @XmlElement(name = "idPersonnel")
    private int     idPersonnel;

    @XmlElement(name = "nom")
    private String  nom;

    @XmlElement(name = "prenom")
    private String  prenom;

    @XmlElement(name = "dateDeNaissance")
    private String  dateDeNaissance;

    @XmlElement(name = "demande")
    private Demande demande;

    /**
     * 
     */
    public Personne() {
        // EMPTY
    }

    /**
     * @return the idPersonnel
     */
    public int getIdPersonnel() {
        return idPersonnel;
    }

    /**
     * @param paramIdPersonnel the idPersonnel to set
     */
    public void setIdPersonnel(int paramIdPersonnel) {
        idPersonnel = paramIdPersonnel;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param paramNom the nom to set
     */
    public void setNom(String paramNom) {
        nom = paramNom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param paramPrenom the prenom to set
     */
    public void setPrenom(String paramPrenom) {
        prenom = paramPrenom;
    }

    /**
     * @return the dateDeNaissance
     */
    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    /**
     * @param paramDateDeNaissance the dateDeNaissance to set
     */
    public void setDateDeNaissance(String paramDateDeNaissance) {
        dateDeNaissance = paramDateDeNaissance;
    }

    /**
     * @return the demande
     */
    public Demande getDemande() {
        return demande;
    }

    /**
     * @param paramDemande the demande to set
     */
    public void setDemande(Demande paramDemande) {
        demande = paramDemande;
    }

}
