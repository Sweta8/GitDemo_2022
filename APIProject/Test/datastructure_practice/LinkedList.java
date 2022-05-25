package datastructure_practice;

public class LinkedList {
	
	Node head;
	
	public void insert(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		
		if(head==null)
		{
			head=temp;
		}
		else
		{
			Node ptr=head;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=temp;
		}
	}
	
	public void show()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	public int countNodes()
	{
		int count=0;
		Node ptr=head;
		while(ptr!=null)
		{
			count++;
			ptr=ptr.next;
		}
		return count;
	}
	
	public Node insertAtBeginning(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		temp.next=head;
		head=temp;
		return head;
	}
	
	public void insertAtEnd(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		Node ptr=head;
		while(ptr.next!=null)
		{
			ptr=ptr.next;
		}
		
		ptr.next=temp;
	}
	
	public int middleElement(int pos)
	{
		int val;
		Node ptr=head;
		
		while(pos!=0)
		{
			ptr=ptr.next;
			pos--;
		}
		val=ptr.data;
		return val;
	}
	
	public void insertAtPostion(int pos,int data)
	{
		Node ptr=head;
		pos--;
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		while(pos!=1)
		{
			ptr=ptr.next;
			pos--;
		}
		temp.next=ptr.next;
		ptr.next=temp;
	}
	
	public Node deleteFirstNode()
	{
		Node ptr=head;
		head=ptr.next;
		ptr=null;
		return head;
	}
	
	public void deleteLastNode()
	{
		Node ptr=head;
		while(ptr.next.next!=null)
		{
			ptr=ptr.next;
		}
		ptr.next=null;
	}
	
	public void deleteAtPosition(int pos)
	{
		Node current=head;
		Node previous=head;
		while(pos!=1)
		{
			previous=current;
			current=current.next;
			pos--;
		}
		
		previous.next=current.next;
		current=null;
	}
	
	public Node reverSeLinkedList()
	{
		Node previous=null;
		Node current=head;
		while(current!=null)
		{
			Node temp=current.next;
			current.next=previous;
			previous=current;
			current=temp;
		}
		return previous;
	}
	
	public void showOnReverse(Node head)
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	public Node deleteEntireList()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			ptr=ptr.next;
			head=null;
			head=ptr;
		}
		return head;
	}
	

}
