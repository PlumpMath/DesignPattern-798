/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Behavior.Memento;

/**
 *
 * @author Administrator
 */
public class Test {

    public static void main(String[] args) {

        // ����ԭʼ��  
        Original origi = new Original("egg");

        // ��������¼  
        Storage storage = new Storage(origi.createMemento());

        // �޸�ԭʼ���״̬  
        System.out.println("��ʼ��״̬Ϊ��" + origi.getValue());
        origi.setValue("niu");
        System.out.println("�޸ĺ��״̬Ϊ��" + origi.getValue());

        // �ظ�ԭʼ���״̬  
        origi.restoreMemento(storage.getMemento());
        System.out.println("�ָ����״̬Ϊ��" + origi.getValue());
    }
}
