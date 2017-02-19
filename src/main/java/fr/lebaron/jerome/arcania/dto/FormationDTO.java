/**
 * 
 */
package fr.lebaron.jerome.arcania.dto;

/**
 * @author Jerome
 */
public class FormationDTO implements InterfaceDTO {

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
