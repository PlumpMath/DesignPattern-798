/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavior.State;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {

        State state = new State();
        Context context = new Context(state);

        //设置第一种状态  
        state.setValue("state1");
        context.method();

        //设置第二种状态  
        state.setValue("state2");
        context.method();
    }
}
