/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanchoneteFactory.fabricas;

import LanchoneteFactory.ingredientes.*;

/**
 *
 * @author emers
 */
public class SanduicheJP implements Sanduiche{
    private Pao p;
    private Queijo q;
    private Presunto pp;
    private Salada s;
    
    public SanduicheJP(){
        p = new PaoBola();
        q = new QueijoMussarela();
        pp = new PresuntoDeFrango();
        s = new SaladaSem();
    }
}
