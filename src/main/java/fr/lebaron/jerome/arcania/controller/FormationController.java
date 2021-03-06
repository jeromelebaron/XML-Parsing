/**
 * 
 */
package fr.lebaron.jerome.arcania.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import fr.lebaron.jerome.arcania.dto.FormationDTO;
import fr.lebaron.jerome.arcania.service.inter.IFormationService;

/**
 * @author Jerome
 */
@RestController
@RequestMapping(value="/formation")
public class FormationController {

    private static final Logger LOGGER = Logger.getLogger(FormationController.class);
    
    @Autowired
    private IFormationService formationService;

    @RequestMapping("/save/{nom}")
    @ResponseBody
    public FormationDTO saveFormation(@PathVariable final String nom) {
        LOGGER.debug("Methode saveFormation");
        final FormationDTO formationDTO = new FormationDTO();
        formationDTO.setNom(nom);
        return getFormationService().saveAndTransform(formationDTO);
    }

    @RequestMapping("/")
    public String hello() {
        return "Hello world";
    }

    /**
     * @return the formationService
     */
    public IFormationService getFormationService() {
        return formationService;
    }

}
