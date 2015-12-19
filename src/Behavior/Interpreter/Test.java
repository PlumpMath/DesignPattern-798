/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavior.Interpreter;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {

        // 计算9+2-8的值  
        int result = new Minus().interpret((new Context(new Plus()
                .interpret(new Context(9, 2)), 8)));
        System.out.println(result);
    }
}
