package binarySearch;

public class BinarySearch {
	
	Node root;
	
	public Node createNode(int data)
	{
		Node n=new Node();
		n.data=data;
		n.left=null;
		n.right=null;
		return n;
	}
	
	public void preorder(Node root)
	{
		if(root!=null)
		{
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		}
	}
	
	public void postOrder(Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
	}
	
	public void inOrder(Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	
	public boolean isBST(Node root)
	{
		Node previous=null;
		if(root!=null)
		{
			if(!isBST(root.left))
			{
				return false;
			}
			else if(previous!=null && previous.data>=root.data)
			{
				return false;
			}
			previous=root;
			return isBST(root.right);
		}
		else
		{
			return true;
		}
	}

}
