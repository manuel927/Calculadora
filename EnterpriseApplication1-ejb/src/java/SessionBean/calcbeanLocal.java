/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Local;

/**
 *
 * @author manuel martinez
 */
@Local
public interface calcbeanLocal {

    Double addition(Double a, Double b);

    Double resta(Double a, Double b);
    
    Double multiplicar(Double a, Double b);
    
    Double dividir(Double a, Double b);
    
}
