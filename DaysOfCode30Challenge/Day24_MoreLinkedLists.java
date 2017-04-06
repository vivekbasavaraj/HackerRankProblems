/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaysOfCode30Challenge;
import java.io.*;
import java.util.*;
/**
 *
 * @author vivek.basavaraj123
 */
class Node24{
	int data;
	Node24 next;
	Node24(int d){
        data=d;
        next=null;
    }
	
}
public class Day24_MoreLinkedLists {
    
     public static Node24 removeDuplicates(Node24 head) {
      //Write your code here
        Set<Integer> nodes = new HashSet();
        Node24 currnode = head;
        Node24 prevnode = currnode;
        while(currnode!=null){
            Boolean flag = nodes.add(currnode.data);
            if(!flag){
                prevnode.next = currnode.next; 
                currnode = prevnode.next;
            }else{
                prevnode = currnode;
                currnode = currnode.next;
            }
            
        }
      return head;
    }
      public static  Node24 insert(Node24 head,int data)
     {
        Node24 p=new Node24(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node24 start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node24 head)
        {
              Node24 start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node24 head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
}
