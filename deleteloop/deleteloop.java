package deleteloop;
import java.util.*;

public class deleteloop
{
	static Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	void push(int data)
	{
		Node new_node=new Node(data);
		
	    //if linkedlist is empty, make new node as head
		if(head==null)
		{
			head=new_node;
			head.next=null;
			return;
		}

		//this newnode is gng to be the last node, make next of it as null
		new_node.next=null;
		
		//else traverse till last node
		Node last=head;
		while(last.next!=null)
			last=last.next;
		
		//change the next of last node
		last.next=new_node;
	}
     static boolean deleteLoop(Node node)
    {
    	HashSet<Node> hs=new HashSet<>();
    	Node prev=null;
    	while(node!=null)
    	{
    		if(hs.contains(node))
    		{
    			prev.next=null;
    			return true;
    		}
    		else
    		{
    			hs.add(node);
        		prev=node;
        		node=node.next;
    		}
    	}
    	return false;
    }
	public static void main(String[] args)
	{
		deleteloop list=new deleteloop();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.head.next.next.next.next = list.head.next;
		if(deleteLoop(head))
			System.out.println("Removed loop");
		else
			System.out.println("No loop found");
	}

}
