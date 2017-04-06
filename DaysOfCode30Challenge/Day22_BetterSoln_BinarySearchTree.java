package DaysOfCode30Challenge;

import java.util.*;
import java.io.*;
/**
 *
 * @author vivek.basavaraj123
 */

class Node11{
    Node11 left,right;
    int data;
    Node11(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day22_BetterSoln_BinarySearchTree {
    
    
    public static int getHeight(Node11 root){
    if (root == null){
        return -1;
    }
    else{
        return 1 + Math.max( getHeight(root.left), getHeight(root.right) );
    }
}
     public static Node11 insert(Node11 root,int data){
        if(root==null){
            return new Node11(data);
        }
        else{
            Node11 cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	 public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node11 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
    
}
