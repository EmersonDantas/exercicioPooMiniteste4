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
public class AlgoritimoInsertion implements Algoritimo{
    private static AlgoritimoInsertion instance;
    
    private AlgoritimoInsertion (){}
    
    public static AlgoritimoInsertion getInstance(){
        if(instance == null){
            instance = new AlgoritimoInsertion();
        }
        
        return instance;
    }
    @Override
    public int[] sort(int[] vetor) {
        System.out.println("Vetor ordenado com Insertion Sort");
        return null;
    }
    
}
