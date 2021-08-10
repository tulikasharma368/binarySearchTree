package binarySearchTree;

public class BinaryTree<k extends Comparable<k>> {

	private BinaryNode<k> root;

	public void add(k key) {
		
		this.root = this.addRecursively(root, key);
		
	}

	private BinaryNode<k> addRecursively(BinaryNode<k> current, k key) {
		if(current==null)
			return new BinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if(compareResult==0)
			return current;
		if(compareResult<0)
			current.left = addRecursively(current.left, key);
		else
			current.right = addRecursively(current.right, key);
		return current;
	}
	
	public int getSize() {
		return this.getSizeRecursion(root);
	}

	private int getSizeRecursion(BinaryNode<k> current) {
		return current == null ? 0 : (1+this.getSizeRecursion(current.left)+this.getSizeRecursion(current.right));
	}
	
}
