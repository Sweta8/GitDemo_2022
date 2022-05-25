package revision;

public class Runnner {
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.insert(8);
		l.insert(56);
		l.insert(78);
		l.insert(99);
		l.insert(22);
		l.show();
		int count=l.show();
		System.out.println("Count is "+count);
		int m=count/2;
		int val=l.valueAtPos(m);
		System.out.println("value at pos"+ val);
		Node p=l.reverseLinkedList();
		l.showreverseLinkedList(p);
	}

}
