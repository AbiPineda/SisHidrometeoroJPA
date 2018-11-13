/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import modelo.sesion.beans.MunicipiosFacade;

/**
 *
 * @author Abi
 */
@ManagedBean(name = "municipiosBean")
@ViewScoped
public class MunicipiosBean implements Serializable {
    
   @Inject
    MunicipiosFacade municipiosFacade;
   @ManagedProperty("#{autoCompleteBeanDepartamentos}")
   AutoCompleteBeanDepartamentos autocompletebeandeptos;
   
}
