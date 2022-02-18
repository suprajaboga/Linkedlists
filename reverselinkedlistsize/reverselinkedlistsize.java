//Reverse a linked list in groups of given size

package reverselinkedlistsize;

public class reverselinkedlistsize 
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
	void printList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	Node reverse(Node node,int k)
    {
		Node prev=null;
  		Node current=node;              
  		Node next=null;
  		int c=0;
  		while(current!=null&&c<k)
  		{
  			next=current.next;
  			current.next=prev;
  			prev=current;
  			current=next;
  			c++;
  		}
  		if(next!=null)
  			node.next=reverse(next,k);

  		return prev;       
  	}
	public static void main(String[] args) {
		reverselinkedlistsize list=new reverselinkedlistsize();
		int k=3;
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		list.push(6);
		list.push(7);
//		list.push(8);
		System.out.println("Given linked list");
		list.printList(head);
		System.out.println();
		System.out.println("Reversed linked list");
		head=list.reverse(head,k);
		list.printList(head);	
	}
}
