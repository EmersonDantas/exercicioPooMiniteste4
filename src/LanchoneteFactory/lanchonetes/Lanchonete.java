/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanchoneteFactory.lanchonetes;

import LanchoneteFactory.fabricas.Factory;
import LanchoneteFactory.fabricas.Sanduiche;

/**
 *
 * @author emers
 */
public abstract class Lanchonete {
    private Factory fabrica;
    
    public abstract Sanduiche pedirSanduiche();
}
