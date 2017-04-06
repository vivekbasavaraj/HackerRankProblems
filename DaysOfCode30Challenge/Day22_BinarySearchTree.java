
package DaysOfCode30Challenge;
import java.util.*;
import java.io.*;
/**
 *
 * @author vivek.basavaraj123
 */

class Node1{
    Node1 left,right;
    int data;
    Node1(int data){
        this.data=data;
        left=right=null;
    }
}
public class Day22_BinarySearchTree {
    static int maxHeight=0;
   // static HashMap<Node1,Integer> map = new HashMap<Node1,Integer>();
    public static int getHeight(Node1 root){
      //Write your code here
     
     // map.put(root, 0);
        NodeHeight(root.left, 0);
        NodeHeight(root.right, 0);
        return maxHeight;
    }
    public static void NodeHeight(Node1 node, int nHt){
//        map.put(node, nHt+1);
        if(node.right==null && node.left==null && nHt+1>maxHeight){

                maxHeight = nHt+1;

        }
        if(node.right!=null){
            NodeHeight(node.right, nHt+1);
        }
        if(node.left!=null){
            NodeHeight(node.left, nHt+1);
        }
        return;
    }
    public static Node1 insert(Node1 root,int data){
        if(root==null){
            return new Node1(data);
        }
        else{
            Node1 cur;
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
        Node1 root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        int height=getHeight(root);
        System.out.println(height);
    }
    
}
