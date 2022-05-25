package harness;

public class Runner {
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.insert(78);
		l.insert(97);
		l.insert(66);
		l.insert(67);
		l.insert(55);
		System.out.print("List after insertion: ");
		l.show();
		int countTotalNodes=l.countNodes();
		System.out.println("Total No of nodes is: "+countTotalNodes);
		int pos=countTotalNodes/2;
		int val=l.middleElement(pos);
		System.out.println(val);
		Node p=l.reverseLinkedList();
		System.out.print("List after reverse: ");
		l.showReverse(p);
	}

}
