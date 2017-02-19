/**
 * 
 */
package fr.lebaron.jerome.arcania.transformer;

import org.springframework.beans.BeanUtils;

import fr.lebaron.jerome.arcania.dto.InterfaceDTO;
import fr.lebaron.jerome.arcania.model.AbstractEntity;

/**
 * @author Jerome
 */
public interface ITransformer<E extends AbstractEntity, D extends InterfaceDTO> {

    default E dtoToEntity(final D dto) {
        System.out.println("dtoToEntity");
        final E entity = createEntity();
        BeanUtils.copyProperties(dto, entity);
        return entity;
    }

    default D entityToDto(final E entity) {
        System.out.println("entityToDto");
        final D dto = createDTO();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    D createDTO();

    E createEntity();
}
