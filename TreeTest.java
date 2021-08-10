package binarySearchTree;
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
	
	@Test
	public void givenThreeNumbers_whenAddedToBST_shouldReturnThree(){
		BinaryTree<Integer> binaryTree = new BinaryTree();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(22);
		binaryTree.add(11);
		binaryTree.add(3);
		binaryTree.add(16);
		binaryTree.add(40);
		binaryTree.add(70);
		binaryTree.add(60);
		binaryTree.add(65);
		binaryTree.add(63);
		binaryTree.add(67);
		binaryTree.add(95);
		
		int size = binaryTree.getSize();
		System.out.println(size);
		
		binaryTree.searchNode(binaryTree.root, 63);
		
		if(BinaryTree.flag)  {
	        System.out.println("Element is present in the binary tree");  
	    }
	    else  {
	        System.out.println("Element is not present in the binary tree");  
	    }
		
		Assert.assertEquals(13,size);
		
	}

}
