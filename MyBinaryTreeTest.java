package bst;

/**
 * class to create binary tree
 * @author Mohammad Musthafa
 *
 */
public class MyBinaryTreeTest {

	public static void insertNode() {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<Integer>();		//object creation
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		System.out.println("size of tree is "+myBinaryTree.getSize());
		myBinaryTree.displayNodes();		//call to display node
		myBinaryTree.search(63);			//call to search method to find key
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertNode();		//call to insert node
	}

}
