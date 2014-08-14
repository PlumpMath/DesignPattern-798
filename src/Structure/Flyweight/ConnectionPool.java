/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structure.Flyweight;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author Administrator
 * ��Ԫģʽ
 */
public class ConnectionPool {  
      
    private Vector<Connection> pool;  
      
    /*��������*/  
    private String url = "jdbc:mysql://localhost:3306/test";  
    private String username = "root";  
    private String password = "root";  
    private String driverClassName = "com.mysql.jdbc.Driver";  
  
    private int poolSize = 100;  
    private static ConnectionPool instance = null;  
    Connection conn = null;  
  
    /*���췽������һЩ��ʼ������*/  
    private ConnectionPool() {  
        pool = new Vector<Connection>(poolSize);  
  
        for (int i = 0; i < poolSize; i++) {  
            try {  
                Class.forName(driverClassName);  
                conn = (Connection) DriverManager.getConnection(url, username, password);  
                pool.add(conn);  
            } catch (ClassNotFoundException | SQLException e) {            
                e.printStackTrace();
            }  
        }  
    }  
  
    /* �������ӵ����ӳ� */  
    public synchronized void release() {  
        pool.add(conn);  
    }  
  
    /* �������ӳ��е�һ�����ݿ����� */  
    public synchronized Connection getConnection() {  
        if (pool.size() > 0) {  
            Connection conn = pool.get(0);  
            pool.remove(conn);  
            return conn;  
        } else {  
            return null;  
        }  
    }  
}  
