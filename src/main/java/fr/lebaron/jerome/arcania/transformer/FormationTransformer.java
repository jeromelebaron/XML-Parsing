/**
 * 
 */
package fr.lebaron.jerome.arcania.transformer;

import org.springframework.stereotype.Component;

import fr.lebaron.jerome.arcania.dto.FormationDTO;
import fr.lebaron.jerome.arcania.model.Formation;

/**
 * @author Jerome
 */
@Component
public class FormationTransformer implements ITransformer<Formation, FormationDTO> {

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.transformer.ITransformer#createEntity()
     */
    @Override
    public Formation createEntity() {
        return new Formation();
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.transformer.ITransformer#createDTO()
     */
    @Override
    public FormationDTO createDTO() {
        return new FormationDTO();
    }
}
