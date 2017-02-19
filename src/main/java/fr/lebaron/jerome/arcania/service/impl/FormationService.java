/**
 * 
 */
package fr.lebaron.jerome.arcania.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.lebaron.jerome.arcania.repository.impl.FormationRepository;
import fr.lebaron.jerome.arcania.service.inter.IFormationService;
import fr.lebaron.jerome.arcania.transformer.FormationTransformer;

/**
 * @author Jerome
 */
@Service(value = "formationService")
public class FormationService implements IFormationService {

    @Autowired
    private FormationRepository  formationRepository;

    @Autowired
    private FormationTransformer formationTransformer;

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.service.inter.IService#getRepository()
     */
    @Override
    public FormationRepository getRepository() {
        return formationRepository;
    }

    /*
     * (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.service.inter.IService#getTransformer()
     */
    @Override
    public FormationTransformer getTransformer() {
        return formationTransformer;
    }

}
