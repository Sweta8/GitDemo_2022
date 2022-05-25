package binarySearch;

public class Runner {
	
	public static void main(String [] args)
	{
		BinarySearch b=new BinarySearch();
		
		Node p=b.createNode(30);
		Node p1=b.createNode(10);
		Node p2=b.createNode(40);
		Node p3=b.createNode(5);
		p.left=p1;
		p.right=p2;
		p1.left=p3;
		System.out.print("Pre order traversal is: ");
		b.preorder(p);
		System.out.println();
		System.out.print("Post oder traversal is: ");
		b.postOrder(p);
		System.out.println();
		System.out.print("In Order Traversal is: ");
		b.inOrder(p);
		System.out.println();
		boolean flag=b.isBST(p);
		System.out.println(flag);
		
	}

}
