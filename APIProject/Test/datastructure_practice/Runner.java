package datastructure_practice;

public class Runner {
	
	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.insert(56);
		l.insert(90);
		l.insert(78);
		System.out.print("Elements default values at beginning: ");
		l.show();
		l.insertAtBeginning(0);
		System.out.print("Elements after inserting at beginning: ");
		l.show();
		l.insertAtEnd(102);
		System.out.print("Elements after inserting at end: ");
		l.show();
		int noOfElements=l.countNodes();
		int middleElementPosition=noOfElements/2;
		int value=l.middleElement(middleElementPosition);
		System.out.println("Middle Element Value is: "+ value);
		l.insertAtPostion(5, 66);
		System.out.print("Elements after inserting at position: ");
		l.show();
		l.deleteFirstNode();
		System.out.print("Elements after deleting first node: ");
		l.show();
		l.deleteLastNode();
		System.out.print("Elements after deleting last node: ");
		l.show();
		l.deleteAtPosition(3);
		System.out.print("Elements after deleting at position: ");
		l.show();
		Node head=l.reverSeLinkedList();
		System.out.print("Elements after reversingLinkedList: ");
		l.showOnReverse(head);
		l.deleteEntireList();
		System.out.print("List after deleting all elements: ");
		l.show();
		
		
	}
}
