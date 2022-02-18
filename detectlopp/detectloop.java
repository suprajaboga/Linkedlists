package detectlopp;

public class detectloop
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
    void detectLoop()
    {
    	Node slow=head,fast=head;
    	int flag=0;
    	while(slow!=null && fast!=null && fast.next!=null)
    	{
    		slow=slow.next;
    		fast=fast.next.next;
    		if(slow==fast)
    		{
    			flag=1;
    	     	System.out.println(slow.data+" "+fast.data);
    	     	break;
    		}
    	}
    		if(flag==1)
    			System.out.println("loop found");
    		else
    			System.out.println("loop not found");
    }
	public static void main(String[] args)
	{
		detectloop list=new detectloop();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		System.out.println(list.head.data);
		list.head.next.next.next.next = list.head.next;
		list.detectLoop();
	}

}
