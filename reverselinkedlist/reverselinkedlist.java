package reverselinkedlist;

////Iterative
//public class reverselinkedlist 
//{
//	static Node head;
//    static class Node
//	{
//		int data;
//		Node next;
//		Node(int d)
//		{
//			data=d;
//			next=null;
//		}
//	}
//    void printList(Node node)
//    {
//    	while(node!=null)
//    	{
//    		System.out.print(node.data+" ");
//    		node=node.next;
//    	}
//    }
//    Node reverse(Node node)
//    {
//    	Node prev=null;
//    	Node current=node;
//    	Node next=null;
//    	while(current!=null)
//    	{
//    		next=current.next;
//    		current.next=prev;
//    		prev=current;
//    		current=next;
//    	}
//    	return prev;
//    }
//	   void push(int data)
//     {
//          Node temp=new Node(data);
//  		temp.next=head;
//  		head=temp;
//		}
//    public static void main(String args[])
//	{
//    	reverselinkedlist list=new reverselinkedlist();
//		list.push(85);
//      list.push(15);
//      list.push(4);
//      list.push(20);
//		System.out.println("Given linked list");
//		list.printList(head);
//		head=list.reverse(head);
//		System.out.println("");
//		System.out.println("Reversed linked list");
//		list.printList(head);
//	}
//}


//Recursive
//public class reverselinkedlist 
//{
//	static Node head;
//    static class Node
//	{
//		int data;
//		Node next;
//		Node(int d)
//		{
//			data=d;
//			next=null;
//		}
//	}
//    void printList(Node node)
//    {
//    	while(node!=null)
//    	{
//    		System.out.print(node.data+" ");
//    		node=node.next;
//    	}
//    }
//    void reverse(Node node)
//    {
//    	if(node==null)
//    		return;
//    	reverse(node.next);
//    	System.out.print(node.data+" ");
//    }
//      void push(int data)
//      {
//    	  Node temp=new Node(data);
//    	  temp.next=head;
//    	  head=temp;
//      }
//    public static void main(String args[])
//	 {
//    	reverselinkedlist list=new reverselinkedlist();
//		list.push(85);
//		list.push(15);
//		list.push(4);
//		list.push(20);
//		System.out.println("Given linked list");
//		list.printList(head);
//		System.out.println();
//		System.out.println("Reversed linked list");
//	    list.reverse(head);
//		
//	}
//}

