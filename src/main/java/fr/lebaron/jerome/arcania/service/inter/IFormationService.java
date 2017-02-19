/**
 * 
 */
package fr.lebaron.jerome.arcania.service.inter;

import fr.lebaron.jerome.arcania.dto.FormationDTO;
import fr.lebaron.jerome.arcania.model.Formation;
import fr.lebaron.jerome.arcania.repository.impl.FormationRepository;
import fr.lebaron.jerome.arcania.transformer.FormationTransformer;

/**
 * @author Jerome
 */
public interface IFormationService extends
        IService<Formation, FormationDTO, FormationRepository, FormationTransformer> {

}
