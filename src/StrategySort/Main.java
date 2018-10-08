/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StrategySort;

/**
 *
 * @author emers
 */
public class Main {
    public static void main(String[] args) {
        Ordenador ord = Ordenador.getInstance();
        
        ord.setAlgoritimoBubble();
        ord.ordedar(null);
        
        ord.setAlgoritimoInsertion();
        ord.ordedar(null);
        
        ord.setAlgoritimoMerge();
        ord.ordedar(null);
        
        ord.setAlgoritimoQuick();
        ord.ordedar(null);
    }
}
