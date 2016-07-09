public class BinarySearchTree {
	TreeNode root;

	public void insert(int data) {
		root = insertRecurr(root, data);
	}

	public TreeNode insertRecurr(TreeNode root, int data) {
		if (root == null) {
			root = new TreeNode(data);
		} else {
			if (data < root.data) {
				TreeNode temp = insertRecurr(root.left, data);
				temp.parent = root;
				root.left = temp;
			} else {
				TreeNode temp = insertRecurr(root.right, data);
				root.right = temp;
				temp.parent = root;
			}
		}
		return root;
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.data + " ");
			inOrder(root.right);
		}
	}

	public boolean isLeaf(TreeNode node) {
		return (node.right == null && node.left == null);
	}

	public TreeNode inOrderSuccessor(TreeNode node) {
		if (node.right != null) {
			return min(node.right);
		}

		TreeNode parent = node.parent;
		//if node is the root with no right child
		if(parent == null){
			return null;
		}
		// checking if node is not the right child of its parent in which
		// case there will be no successor
		if (parent.right == node) {
			return null;
		}
		if (parent.right == null) {
			return parent;
		}
		return min(parent.right);
	}

	public TreeNode min(TreeNode node) {
		if(node.left == null){
			return node;
		}
		return min(node.left);
	}
	
	public void delete(TreeNode node){
		//if the node to be deleted is the leaf node
		if(isLeaf(node)){
			TreeNode parent = node.parent;
			if(node == parent.left){
				parent.left = null;
			}
			else{
				parent.right = null;
			}
			return;
		}
		if(node.right == null){
			TreeNode parent = node.parent;
			if(node == parent.left){
				parent.left = node.left;
			}
			else{
				parent.right = node.left;
			}
			return;
		}
		if(node.left == null){
			TreeNode parent = node.parent;
			if(node == parent.left){
				parent.left = node.right;
			}
			else{
				parent.right = node.right;
			}
			return;
		}
		TreeNode successor = inOrderSuccessor(node);
		node.data = successor.data;
		delete(successor);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(2);
		tree.insert(3);
		tree.insert(1);
		tree.insert(7);
		tree.insert(6);
		tree.inOrder(tree.root);
		tree.delete(tree.root);
		tree.inOrder(tree.root);
		System.out.println(tree.root.data + " root");
	}
}
