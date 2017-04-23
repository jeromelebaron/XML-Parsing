/**
 * 
 */
package fr.lebaron.jerome.arcania.visiteur.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerome
 *
 */
public class ArgumentVisiteur {

    private int nbDifference = 0;
    
    private List<String> changements = new ArrayList<>();
    
    /**
     * 
     */
    public ArgumentVisiteur() {
    }

    /**
     * @return the nbDifference
     */
    public int getNbDifference() {
        return nbDifference;
    }

    /**
     * @param paramNbDifference the nbDifference to set
     */
    public void setNbDifference(int paramNbDifference) {
        nbDifference = paramNbDifference;
    }

    /**
     * @return the changements
     */
    public List<String> getChangements() {
        return changements;
    }

    /**
     * @param paramChangements the changements to set
     */
    public void setChangements(List<String> paramChangements) {
        changements = paramChangements;
    }
    

    
}
