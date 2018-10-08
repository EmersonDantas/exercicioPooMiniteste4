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
public class Ordenador {
    private Algoritimo algoritimo;
    private static Ordenador instance;
    
    private Ordenador(){}
    
    public static Ordenador getInstance(){
        if(instance == null){
            instance = new Ordenador();
        }
        
        return instance;
    }
    
    public void setAlgoritimoBubble(){
        algoritimo = AlgoritimoBubble.getInstance();
    }
    
    public void setAlgoritimoInsertion(){
        algoritimo = AlgoritimoInsertion.getInstance();
    }
    
    public void setAlgoritimoMerge(){
        algoritimo = AlgoritimoMerge.getInstance();
    }
    
    public void setAlgoritimoQuick(){
        algoritimo = AlgoritimoQuick.getInstance();
    }
    
    public int[] ordedar(int[] vetor){
        return algoritimo.sort(vetor);
    }
    
}
