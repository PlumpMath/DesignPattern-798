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

        //���õ�һ��״̬  
        state.setValue("state1");
        context.method();

        //���õڶ���״̬  
        state.setValue("state2");
        context.method();
    }
}
