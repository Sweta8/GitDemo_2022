package linkedList;

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
	
	public int show()
	{
		int count=0;
		Node ptr=head;
		while(ptr!=null)
		{
			count++;
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
		return count;
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
	
	public Node insertAtBeginning(int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		temp.next=head;
		head=temp;
		return head;
		
	}
	
	public Node reverseList()
	{
		Node current=head;
		Node previous=null;
		while(current!=null)
		{
			Node temp=current.next;
			current.next=previous;
			previous=current;
			current=temp;
		}
		
		return previous;
	}
	
	public void showreverSedList(Node head)
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
		System.out.println();
	}
	
	public void insertAtEndOfList(int data)
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
	
	public Node deleteFirstElement()
	{
		Node ptr=head;
		head=ptr.next;
		ptr=null;
		return head;
	}
	
	public void deleteLastElement()
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
		pos--;
		while(pos!=0)
		{
			previous=current;
			current=current.next;
			pos--;
		}
		previous.next=current.next;
		current=null;
	}
	
	public void insertAtPosition(int pos,int data)
	{
		Node temp=new Node();
		temp.data=data;
		temp.next=null;
		Node ptr=head;
		pos--;
		while(pos!=1)
		{
			ptr=ptr.next;
			pos--;
		}
		temp.next=ptr.next;
		ptr.next=temp;
		
	}
	
	public void deleteEntireList()
	{
		Node ptr=head;
		while(ptr!=null)
		{
			head=ptr.next;
			ptr=null;
		}
	}
	
	

}
