package bst;

public class MyBinaryTree<k extends Comparable<k>> {
	
	private MyBinaryNode<k> root;
	
	public void add(k key) {
		this.root = this.addRecursively(root, key);
	}

	/**
	 * @method add nodes recursively to form binary tree structure
	 * @param current
	 * @param key
	 * @return
	 */
	private MyBinaryNode<k> addRecursively(MyBinaryNode<k> current, k key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;
		if (compareResult < 0) {
			current.left = addRecursively(current.left, key);
		} else {
			current.right = addRecursively(current.right, key);
		}
		return current;
	}

	public int getSize() {
		return this.getSizeRecursive(root);
	}

	/**
	 * @method get the size calling left and right sides recursively
	 * @param current
	 * @return
	 */
	private int getSizeRecursive(MyBinaryNode<k> current) {
		return current == null ? 0 : 1 + this.getSizeRecursive(current.left) + this.getSizeRecursive(current.right);
	}
	
	public void displayNodes() {
		this.printNodes(root);
	}
	
	/**
	 * @method prints the nodes using inorder technique
	 * @param root
	 */
	private void printNodes(MyBinaryNode<k> root) {
		if (root == null)
			return;
		printNodes(root.left);
		System.out.print(root.key + " ");
		printNodes(root.right);
	}
}
