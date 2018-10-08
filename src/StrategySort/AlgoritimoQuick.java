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
public class AlgoritimoQuick implements Algoritimo{
    private static AlgoritimoQuick instance;
    
    private AlgoritimoQuick(){}
    
    public static AlgoritimoQuick getInstance(){
        if(instance == null){
            instance = new AlgoritimoQuick();
        }
        return instance;
    }
    @Override
    public int[] sort(int[] vetor) {
        System.out.println("Vetor ordenado com Quick Sort");
        return null;
    }
    
}
