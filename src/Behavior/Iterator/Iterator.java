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
public interface Iterator {  
    //ǰ��  
    public Object previous();  
      
    //����  
    public Object next();  
    public boolean hasNext();  
      
    //ȡ�õ�һ��Ԫ��  
    public Object first();  
}  

