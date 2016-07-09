
class Node{
		public Node left,right;
		public int data;
		public int liss = -1;
		public Node(int data){
			this.data = data;
		}
	}
public class LargestIndependentSubset {
	public static int liss(Node root){
		if(root == null){
			return 0;
		}
		if(root.liss != -1){
			return root.liss;
		}
		else{
			if(isLeaf(root)){
				return (root.liss=1);
			}
			else{
				int excluding =  liss(root.left) + liss(root.right);
				int including = 1 + ((root.left!=null)?(liss(root.left.left) + liss(root.left.right)):0) +
						((root.right!=null)?(liss(root.right.left) + liss(root.right.right)):0);
				root.liss = max(excluding,including);
				
			}
		}
		return root.liss;
	}
	public static boolean isLeaf(Node node){
		return((node.left==null)&&(node.right==null));
	}
	public static int max(int a, int b){
		return (a>b)?a:b;
	}
	public static void main(String[] args) {
		Node root         =  new Node(20);
	    root.left                = new Node(8);
	    root.left.left          = new Node(4);
	    root.left.right         = new Node(12);
	    root.left.right.left   = new Node(10);
	    root.left.right.right  = new Node(14);
	    root.right               = new Node(22);
	    root.right.right        = new Node(25);
	    liss(root);
		System.out.println(root.liss + "!!!!");

	}

}
