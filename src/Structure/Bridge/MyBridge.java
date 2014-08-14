/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structure.Bridge;

/**
 *
 * @author Administrator
 */
public class MyBridge extends Bridge {  
    @Override
    public void method(){  
        getSource().method();  
    }  
}  
