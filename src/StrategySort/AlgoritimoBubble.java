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
public class AlgoritimoBubble implements Algoritimo{
    private static AlgoritimoBubble instance;
    
    private AlgoritimoBubble(){}
    
    public static AlgoritimoBubble getInstance(){
        if(instance == null){
            instance = new AlgoritimoBubble();
        }
        
        return instance;
    }
    @Override
    public int[] sort(int[] vetor) {
        System.out.println("Vetor ordenado com Bubble Sort");
        return null;
    }
    
}
