/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Create.Singleton;

import java.util.Vector;

/**
 *
 * @author Administrator
 * 补充：采用"影子实例"的办法为单例对象的属性同步更新
 */
public class SingletonTest1 {

    private static SingletonTest1 instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingletonTest1() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonTest1();
        }
    }

    public static SingletonTest1 getInstance() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonTest1 shadow = new SingletonTest1();
        properties = shadow.getProperties();
    }

}
