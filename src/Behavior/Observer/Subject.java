/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Behavior.Observer;

/**
 *
 * @author Administrator
 */
public interface Subject {  
      
    /*���ӹ۲���*/  
    public void add(Observer observer);  
      
    /*ɾ���۲���*/  
    public void del(Observer observer);  
      
    /*֪ͨ���еĹ۲���*/  
    public void notifyObservers();  
      
    /*����Ĳ���*/  
    public void operation();  
}  
