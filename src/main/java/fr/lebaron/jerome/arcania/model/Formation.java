/**
 * 
 */
package fr.lebaron.jerome.arcania.model;

/**
 * @author Jerome
 */
public class Formation extends AbstractEntity {

    private Long   id;

    private String nom;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param paramId the id to set
     */
    public void setId(Long paramId) {
        id = paramId;
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

}
