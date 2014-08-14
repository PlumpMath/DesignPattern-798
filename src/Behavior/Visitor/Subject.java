/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavior.Visitor;

/**
 *
 * @author Administrator
 */
public interface Subject {

    public void accept(Visitor visitor);

    public String getSubject();
}
