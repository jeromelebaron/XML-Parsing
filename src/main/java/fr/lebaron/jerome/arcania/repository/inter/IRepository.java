/**
 * 
 */
package fr.lebaron.jerome.arcania.repository.inter;

import fr.lebaron.jerome.arcania.model.AbstractEntity;

/**
 * @author Jerome
 *
 */
public interface IRepository<E extends AbstractEntity> {

    E save(E entity);
}
