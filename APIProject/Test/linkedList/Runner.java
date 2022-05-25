package linkedList;

public class Runner {
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.insert(20);
		l.insert(30);
		l.insert(50);
		l.insert(0);
		l.insert(40);
		System.out.print("1st Insertion: ");
		l.show();
		int c=l.show();
		System.out.println("No of nodes: "+c);
		int middle=c/2;
		int value=l.middleElement(middle);
		System.out.println("Middle Element Value is: "+value);
		Node p1=l.insertAtBeginning(200);
		System.out.print("Insert at beigiining: ");
		l.show();
		l.insertAtEndOfList(3000);
		System.out.print("Insert at end: ");
		l.show();
		l.deleteFirstElement();
		System.out.print("Delete first element of list: ");
		l.show();
		l.deleteLastElement();
		System.out.print("Delete last element of list: ");
		l.show();
		l.deleteAtPosition(2);
		System.out.print("Delete element at position: ");
		l.show();
		l.insertAtPosition(2, 700);
		System.out.print("Insert elemet at position: ");
		l.show();
		Node p=l.reverseList();
		System.out.print("Reversed LinkedList: ");
		l.showreverSedList(p);
		l.deleteEntireList();
		System.out.println("List deleted Entirelys: ");
		l.show();
	}

}
