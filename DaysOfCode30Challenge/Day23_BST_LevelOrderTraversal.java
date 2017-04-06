
package DaysOfCode30Challenge;
import java.util.*;
import java.io.*;

/**
 *
 * @author vivek.basavaraj123
 */

class Node23{
    Node23 left,right;
    int data;
    Node23(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day23_BST_LevelOrderTraversal {

    static Queue<Node23> que = new LinkedList<Node23>();
    static void levelOrder(Node23 root){
      //Write your code here
      que.add(root);
      while(!que.isEmpty()){
          Node23 node = que.poll();
          System.out.print(node.data+" ");
          if(node.left != null) {
              que.add(node.left);
          }
          if(node.right != null){
              que.add(node.right);
          }
          
      }
        
    }
    public static Node23 insert(Node23 root,int data){
        if(root==null){
            return new Node23(data);
        }
        else{
            Node23 cur;
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
            Node23 root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }	
}

