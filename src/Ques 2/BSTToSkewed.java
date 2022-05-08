package DSAProject3;


//Class Node

class Node{

	int key;
	Node left, right;
	
	// Create a new node with the given data and NULL left and right
	
	Node(int item)
	{
		key = item;
		left = right = null;
	}
}

public class BSTToSkewed 
{
	public static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	
	// search tree into a skewed tree in increasing order

static void bstToSkewed(Node root){

		if(root == null) {
		return;}
		
	
		// Method to check the order
		
		
		bstToSkewed(root.left);
		Node rightNode = root.right;
		
	
		// Condition to check the root Node of the skewed tree 
		
		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}
		bstToSkewed(rightNode);		
	}

	
	// skewed tree using recursion
	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.key + "  ");
		traverseRightSkewed(root.right);	
	}

// Main 
	
public static void main (String[] args) {
	
		BSTToSkewed BtS = new BSTToSkewed();
		BtS.node = new Node(50);
		BtS.node.left = new Node(30);
		BtS.node.right = new Node(60);
		BtS.node.left.left = new Node(10);
		BtS.node.right.left= new Node(55);
		
		
		bstToSkewed(node);
		traverseRightSkewed(headNode);
	}
}



