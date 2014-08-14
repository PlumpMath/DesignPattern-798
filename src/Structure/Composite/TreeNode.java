/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Structure.Composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author Administrator
 */
public class TreeNode {  
      
    private String name;  
    private TreeNode parent;  
    private Vector<TreeNode> children = new Vector<>();  
      
    public TreeNode(String name){  
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public TreeNode getParent() {  
        return parent;  
    }  
  
    public void setParent(TreeNode parent) {  
        this.parent = parent;  
    }  
      
    //��Ӻ��ӽڵ�  
    public void add(TreeNode node){  
        children.add(node);  
        node.setParent(this);
    }  
      
    //ɾ�����ӽڵ�  
    public void remove(TreeNode node){  
        children.remove(node);
        node.setParent(null);
    }  
      
    //ȡ�ú��ӽڵ�  
    public Enumeration<TreeNode> getChildren(){  
        return children.elements();  
    }  
}  
