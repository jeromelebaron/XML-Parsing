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
@XmlRootElement(name = "echeance")
@XmlAccessorType(XmlAccessType.FIELD)
public class Echeance {

    @XmlElement(name = "date")
    private String dateEcheance;

    @XmlElement(name = "montant")
    private double montant;

    /**
     * @return the dateEcheance
     */
    public String getDateEcheance() {
        return dateEcheance;
    }

    /**
     * @param paramDateEcheance the dateEcheance to set
     */
    public void setDateEcheance(String paramDateEcheance) {
        dateEcheance = paramDateEcheance;
    }

    /**
     * @return the montant
     */
    public double getMontant() {
        return montant;
    }

    /**
     * @param paramMontant the montant to set
     */
    public void setMontant(double paramMontant) {
        montant = paramMontant;
    }

}
