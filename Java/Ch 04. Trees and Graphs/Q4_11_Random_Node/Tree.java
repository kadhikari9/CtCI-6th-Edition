package Q4_11_Random_Node;

import java.security.SecureRandom;
import java.util.Random;

public class Tree {
	TreeNode root = null;
	
	public void insertInOrder(int value) {
		if (root == null) {
			root = new TreeNode(value);
		} else {
			root.insertInOrder(value);
		}
	}
	
	public int size() {
		return root == null ? 0 : root.size();
	}
	
	public TreeNode getRandomNode() {
		if (root == null) return null;
		
		Random random = new SecureRandom();
		int i = random.nextInt(size());
		return root.getIthNode(i);
	}
}
