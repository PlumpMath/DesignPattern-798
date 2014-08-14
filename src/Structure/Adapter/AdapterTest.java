/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Structure.Adapter;

/**
 *
 * @author Administrator
 */
public class AdapterTest {

    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
        
        Source source = new Source(); 
        Targetable target1 = new Wrapper(source);
        target1.method1();
        target1.method2();
    }

}
