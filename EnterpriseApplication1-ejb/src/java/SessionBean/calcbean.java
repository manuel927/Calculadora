/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import javax.ejb.Stateless;

/**
 *
 * @author manuel martinez
 */
@Stateless
public class calcbean implements calcbeanLocal {

    @Override
    public Double addition(Double a, Double b) {
        return (a+b);
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public Double resta(Double a, Double b) {
        return (a-b);
    }
    
    @Override
    public Double multiplicar(Double a,Double b){
        return a*b;
    }
    
    /**
     *
     * @param a
     * @param b
     * @return
     */
    @Override
     public Double dividir(Double a,Double b){
        return a/b;
    }
    
}
