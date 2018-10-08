/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanchoneteFactory.fabricas;

/**
 *
 * @author emers
 */
public class FactoryCG implements Factory{
    public Sanduiche fazerSanduiche(){
        return new SanduicheCG();
    }
}
