/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Create.Prototype;

/**
 *
 * @author Administrator ԭ��ģʽ
 */
public class Prototype {

    @Override
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

}
