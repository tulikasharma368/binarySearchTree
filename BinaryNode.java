package binarySearchTree;

public class BinaryNode<k> {
	
	k key;
	BinaryNode<k> left;
	BinaryNode<k> right;
	
	public BinaryNode(k key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}
