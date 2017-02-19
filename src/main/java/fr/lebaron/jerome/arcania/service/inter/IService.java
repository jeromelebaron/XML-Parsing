/**
 * 
 */
package fr.lebaron.jerome.arcania.service.inter;

import org.springframework.transaction.annotation.Transactional;

import fr.lebaron.jerome.arcania.dto.InterfaceDTO;
import fr.lebaron.jerome.arcania.model.AbstractEntity;
import fr.lebaron.jerome.arcania.repository.inter.IRepository;
import fr.lebaron.jerome.arcania.transformer.ITransformer;

/**
 * @author Jerome
 */
public interface IService<E extends AbstractEntity, D extends InterfaceDTO, R extends IRepository<E>, T extends ITransformer<E, D>> {

    default D saveAndTransform(D paramDTO) {
        final E entity = saveDTO(paramDTO);
        return getTransformer().entityToDto(entity);
    }

    @Transactional(readOnly = false)
    default E saveDTO(D paramDTO) {
        final E entity = getTransformer().dtoToEntity(paramDTO);
        return getRepository().save(entity);
    }

    R getRepository();

    T getTransformer();
}
