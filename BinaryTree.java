package binarySearchTree;

public class BinaryTree<k extends Comparable<k>> {

	public BinaryNode<k> root;
	public static boolean flag = false;  

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
	
	 public void searchNode(BinaryNode<k> temp, k value){  
	     //Check whether tree is empty  
		 if(root == null){  
			 System.out.println("Tree is empty");  
	     }  
	     else{  
	         //If value is found in the given binary tree then, set the flag to true  
	         if(temp.key == value){  
	        	 flag = true;  
	        	 return;  
	         }  
	         //Search in left subtree  
	         if(flag == false && temp.left != null){  
	            searchNode(temp.left, value);  
	         }  
	         //Search in right subtree  
	         if(flag == false && temp.right != null){  
	            searchNode(temp.right, value);  
	         }  
	     }  
	 }
	
}
