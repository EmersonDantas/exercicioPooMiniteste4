/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanchoneteFactory.lanchonetes;

import LanchoneteFactory.fabricas.Factory;
import LanchoneteFactory.fabricas.FactoryCG;
import LanchoneteFactory.fabricas.Sanduiche;

/**
 *
 * @author emers
 */
public class LanchoneteCG extends Lanchonete{
    private Factory fa;
    
    public LanchoneteCG(){
        fa = new FactoryCG();
    }
    @Override
    public Sanduiche pedirSanduiche() {
        System.out.println("Pedindo um sanduba na lanchonete CG");
        return fa.fazerSanduiche();
    }
    
}
