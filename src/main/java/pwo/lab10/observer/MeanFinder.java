/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab10.observer;
import pwo.lab10.observer.Publisher.Subscriber;
/**
 *
 * @author Kuba
 */
public class MeanFinder implements Subscriber{
    Integer sum = null;
    Integer ile = 0;
    @Override
    public void action(int x) {
        sum = sum == null ? x : sum + x; 
        ile += 1;
    }
    
    public int getMean() {
        return sum / ile;
    }
}
