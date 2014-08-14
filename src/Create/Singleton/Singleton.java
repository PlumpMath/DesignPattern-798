/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Create.Singleton;

/**
 *
 * @author Administrator
 */
public class Singleton {

    /* ˽�й��췽������ֹ��ʵ���� */
    private Singleton() {
    }

    /* �˴�ʹ��һ���ڲ�����ά������ */
    private static class SingletonFactory {

        private static Singleton instance = new Singleton();
    }

    /* ��ȡʵ�� */
    public static Singleton getInstance() {
        return SingletonFactory.instance;
    }

    /* ����ö����������л������Ա�֤���������л�ǰ�󱣳�һ�� */
    public Object readResolve() {
        return getInstance();
    }
}
