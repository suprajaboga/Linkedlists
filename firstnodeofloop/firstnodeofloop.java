//detect the first node of the loop

package firstnodeofloop;
import java.util.*;

public class firstnodeofloop
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
	static Node detectLoop(Node node)
	{
		HashSet<Node> hs=new HashSet<>();
		while(node!=null)
		{
			if(hs.contains(node))
				return node;
			hs.add(node);
			node=node.next;
		}
		return null;
	}
	public static void main(String[] args)
	{
		firstnodeofloop list=new firstnodeofloop();
		list.push(50);
		list.push(20);
		list.push(15);
		list.push(4);
		list.push(10);
		head.next.next.next.next.next = head.next.next;
		Node temp=detectLoop(head);
		if(temp==null)
			System.out.println("No loop found");
		else
			System.out.println("Starting node of the loop: "+temp.data);
	}

}
