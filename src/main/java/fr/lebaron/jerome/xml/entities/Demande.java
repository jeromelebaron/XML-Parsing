/**
 * 
 */
package fr.lebaron.jerome.xml.entities;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Jerome
 */
@XmlRootElement(name = "demande")
@XmlAccessorType(XmlAccessType.FIELD)
public class Demande {

    @XmlElement(name = "numeroDemande")
    private int            numero;

    @XmlElement(name = "dateDeLaDemande")
    private String         dateDemande;

    @XmlElementWrapper(name = "echeances")
    @XmlElement(name = "echeance")
    private List<Echeance> echeances;

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param paramNumero the numero to set
     */
    public void setNumero(int paramNumero) {
        numero = paramNumero;
    }

    /**
     * @return the dateDemande
     */
    public String getDateDemande() {
        return dateDemande;
    }

    /**
     * @param paramDateDemande the dateDemande to set
     */
    public void setDateDemande(String paramDateDemande) {
        dateDemande = paramDateDemande;
    }

    /**
     * @return the echeances
     */
    public List<Echeance> getEcheances() {
        return echeances;
    }

    /**
     * @param paramEcheances the echeances to set
     */
    public void setEcheances(List<Echeance> paramEcheances) {
        echeances = paramEcheances;
    }

}
