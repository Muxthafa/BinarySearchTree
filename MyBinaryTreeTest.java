package bst;

public class MyBinaryTreeTest {

	public static void insertNode() {
		MyBinaryTree<Integer> myBinaryTree=new MyBinaryTree<Integer>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		System.out.println("size of tree is "+myBinaryTree.getSize());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		insertNode();
	}

}
