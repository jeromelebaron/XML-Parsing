/**
 * 
 */
package fr.lebaron.jerome.arcania.repository.impl;

import org.springframework.stereotype.Repository;

import fr.lebaron.jerome.arcania.model.Formation;
import fr.lebaron.jerome.arcania.repository.inter.IRepository;

/**
 * @author Jerome
 *
 */
@Repository
public class FormationRepository implements IRepository<Formation> {

    /* (non-Javadoc)
     * @see fr.lebaron.jerome.arcania.repository.inter.IRepository#save(fr.lebaron.jerome.arcania.model.AbstractEntity)
     */
    @Override
    public Formation save(Formation paramEntity) {
        System.out.println("Save repo");
        paramEntity.setId(1L);
        return paramEntity;
    }

}
