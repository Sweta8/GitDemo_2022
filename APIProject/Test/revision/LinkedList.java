package revision;

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
			System.out.println(ptr.data);
			ptr=ptr.next;
		}
		return count;
	}
	
	public int valueAtPos(int pos)
	{
		Node ptr=head;
		int val;
		while(pos!=0)
		{
			ptr=ptr.next;
			pos--;
		}
		val=ptr.data;
		return val;
	}
	
	public Node reverseLinkedList()
	{
		Node current=head;
		Node previous=null;
		while(current !=null)
		{
			Node temp=current.next;
			current.next=previous;
			previous=current;
			current=temp;
		}
		return previous;
	}
	
	public void  showreverseLinkedList(Node head)
	{
		Node ptr=head;
		while(ptr!=null)
		{
			System.out.print(ptr.data+" ");
			ptr=ptr.next;
		}
	}

}
