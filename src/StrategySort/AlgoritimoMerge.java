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
public class AlgoritimoMerge implements Algoritimo{
    private static AlgoritimoMerge instance;
    
    private AlgoritimoMerge(){}
    
    public static AlgoritimoMerge getInstance(){
        if(instance == null){
            instance = new AlgoritimoMerge();
        }
        
        return instance;
    }
    
    @Override
    public int[] sort(int[] vetor) {
        System.out.println("Vetor ordenado com Merge Sort");
        return null;
    }
    
}
