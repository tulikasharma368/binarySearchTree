package binarySearchTree;
import org.junit.Assert;
import org.junit.Test;

public class TreeTest {
	
	@Test
	public void givenThreeNumbers_whenAddedToBST_shouldReturnThree(){
		BinaryTree<Integer> binaryTree = new BinaryTree();
		binaryTree.add(56);
		binaryTree.add(30);
		binaryTree.add(70);
		
		int size = binaryTree.getSize();
		System.out.println(size);
		Assert.assertEquals(3,size);
		
	}

}
