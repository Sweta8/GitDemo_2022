package harness;

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
	
	public Node reverseLinkedList()
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
	
	public void showReverse(Node head)
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
	
	public int middleElement(int pos)
	{
		Node ptr=head;
		while(pos!=0)
		{
			ptr=ptr.next;
			pos--;
		}
		return ptr.data;
	}

}
