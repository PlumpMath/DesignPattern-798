/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Behavior.Iterator;

/**
 *
 * @author Administrator
 */
public interface Collection {  
      
    public Iterator iterator();  
      
    /*ȡ�ü���Ԫ��*/  
    public Object get(int i);  
      
    /*ȡ�ü��ϴ�С*/  
    public int size();  
}  

