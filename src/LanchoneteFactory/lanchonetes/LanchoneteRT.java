/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanchoneteFactory.lanchonetes;

import LanchoneteFactory.fabricas.Factory;
import LanchoneteFactory.fabricas.FactoryRT;
import LanchoneteFactory.fabricas.Sanduiche;

/**
 *
 * @author emers
 */
public class LanchoneteRT extends Lanchonete{
    private Factory fa;
    
    public LanchoneteRT(){
        fa = new FactoryRT();
    }
    @Override
    public Sanduiche pedirSanduiche() {
        System.out.println("Pedindo um sanduba na lanchonete RT");
        return fa.fazerSanduiche();
    }
}
