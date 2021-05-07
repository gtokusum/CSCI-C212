import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class BST<Key extends Comparable, Value> {

    private Node root;
    private static int prod = 1;

    // note: the outer class has direct access to values in this inner class
    private class Node {
        private Key key;
        private Value value;
        private Node lChild;
        private Node rChild;

        // number of nodes at this subtree
        // N for the root == # of nodes in entire tree
        // N for leaf node == 1
        // N needs to be updated every time a new node is inserted into the tree
        private int N;

        public Node(Key key, Value value, int N) {
            this.key = key;
            this.value = value;
            this.N = N;
            this.lChild = null;
            this.rChild = null;
        }
    }

    public int size() {
        return this.root.N;
    }

    public Value get(Key key) {
        //return null; // TODO: return value associated with key, or null if key doesn't exist
    	Node tmpRoot = get_recur(root,key);
    	if (tmpRoot == null) {
    		return null;
    	}
    	else {
    		return tmpRoot.value;
    	}
    }
    
    Node get_recur(Node root,Key key) {
    	if (root == null || root.key == key){
    		return root;
    	}
    	if((Integer)root.key > (Integer)key) {
    		return get_recur(root.lChild,key);
    	}
    	return get_recur(root.rChild,key);
    }
    

    public void put(Key key, Value val) {
        // TODO: insert key/value pair into tree and update the value of N
    	root = put_recursion(key,val,root);
    	root.N++;
    }
    
    Node put_recursion(Key key,Value val, Node root) {
    	if (root == null) {
    		root = new Node(key,val,0);
    		return root;
    	}
    	else if((Integer)root.key > (Integer)key) {
    		root.lChild = put_recursion(key, val, root.lChild);
    	}
    	else {
    		root.rChild = put_recursion(key,val,root.rChild);
    	}
    	return root;
    }
    

    public String walk(String choice) {
        // TODO: walk the tree in order & print the values
        // if choice is "in" then perform in-order walk (default)
        // if choice is "pre" then perform pre-order walk
        // if choice is "post" then perform post-order walk
        // any other choice or wrong choice will use default option
    	String output;
    	if (choice.equals("in")) {
    		output = inorder(root,"");
    		return output;
    	}
    	else if(choice.equals("pre")) {
    		output = preorder(root,"");
    		return output;
    	}
    	else if(choice.equals("post")) {
    		output = postorder(root,"");
    		return output;
    	}
    	else {
    		return "choice not valid";
    	}
    }

    public String inorder(Node root,String output) {
    	if (root != null) {
    		inorder(root.lChild,output);
    		output = output + root.value;
    		inorder(root.rChild,output);
    	}
    	return output;
    }
    
    public String preorder(Node root, String output) {
    	if (root != null) {
    		output = output + root.value;
    		preorder(root.lChild,output);
    		preorder(root.rChild,output);
    	}
    	return output;
    }
    
    public String postorder(Node root,String output) {
    	if (root != null) {
    		preorder(root.lChild,output);
    		preorder(root.rChild,output);
    		output = output+root.value;
    	}
    	return output;
    }
    
    @Override
    public String toString() {
        String inorder = this.walk("in");
        String preorder = this.walk("pre");
        String postorder = this.walk("post");
        return inorder + "\n" + preorder + "\n" + postorder;
    }

    @Override
    public boolean equals(Object obj) {
        return this.toString().equals(obj.toString());
    }

    // returns true if this tree (using root node) is perfectly balanced, return false otherwise.
    public boolean isBalanced() {
    	if (root == null) {
    		return true;
    	}
    	int LH = height(root.lChild);
    	int RH = height(root.rChild);
    	if (Math.abs(LH - RH) <= 1) {
    		return true;
    	}
    	return false;
    }
    int height(Node root) {
    	if (root == null) {
    		return 0;
    	}
    	return 1 + Math.max(height(root.lChild), height(root.rChild));
    }
   

    // returns the number of leaf nodes in the BST
    public int countLeafNodes(){
    	return getLeafCount(root);
    }
    
    int getLeafCount(Node root) {
    	if (root == null) {return 0;}
    	if (root.lChild == null && root.rChild == null) {
    		return 1;
    	}
    	else {
    		return getLeafCount(root.lChild) + getLeafCount(root.rChild);
    	}
    }

    // returns the number of nodes in BST with only one child
    public int getOneChildNodes(){
    	return countOneChild(root);
    }
    
    int countOneChild(Node root) {
    	if (root == null) {return 0;}
    	int tmp = 0;
    	if ((root.lChild == null && root.rChild != null)||(root.lChild != null && root.rChild ==null)) {
    		tmp++;
    		tmp += (countOneChild(root.lChild) + countOneChild(root.rChild));
    	}
    	return tmp;
    }

    // returns  the number of nodes in BST with two children.
    public int getTwoChildrenNodes(){
    	return countTwoChild(root);
    }
    
    int countTwoChild(Node root) {
    	if (root == null) {
    	return 0;
    	}
    	if (root.lChild != null && root.rChild != null) {
    		return 1 + (countTwoChild(root.lChild) + countTwoChild(root.rChild));
    	}
    	return countTwoChild(root.lChild) + countTwoChild(root.rChild);
    }

    // For a given key, find how far away it is from the root (i.e., how many edges between it and root)
    // Return -1 if not found.
    // For ex. In Figure 1. in PDF, node k's distance from root is 2, node x => 3 etc
    public int distanceFromRoot(Node root, Key key){
    	if (root == null) {return -1;}
    	int dist = -1;
    	
    	if ((root.key == key) || (dist = distanceFromRoot(root.lChild,key)) >= 0||
    			(dist = distanceFromRoot(root.rChild,key))>=0) {
    		return dist+1;
    	}
    	return dist;
    }

    // returns the sum of keys of nodes in the left branch of the passed key
    public int sumLeft(Key key){
    	if (root == null) {
    		return 0;
    	}
    	Node tmpNode = get_recur(root,key);
    	int sum = 0;
    	while (tmpNode.lChild!=null) {
    		sum++;
    		tmpNode = tmpNode.lChild;
    	}
    	return sum;
    }
    
    

    // Multiply (int)key of all non-leaf nodes & update the static variable prod
    public void findNonLeafProduct(Node root)  {
    	if (root == null || (root.lChild == null && root.rChild == null)) {
    		return;
    	}
    	if (root.rChild != null || root.lChild != null) {
    		prod *= Integer.parseInt((String) root.key);
    	}
    	findNonLeafProduct(root.lChild);
    	findNonLeafProduct(root.rChild);
    }

    //Returns maximum depth of the tree.
    public int maximumDepthOfTheTree(Node root) {
        //To do:
        //1.	Write a recursive function that performs a depth-first search (dfs) of the tree.
        //2.	Check if the current node is null. If it is null, then return 0.
        //3.	Otherwise, explore the left subtree and the right subtree of the node using dfs recursively.
        //4.	Then determine whether the left subtree or right subtree is at a greater height.
        //5.	Add 1 to the Math.max(depthOfLeftSubtree, depthOfRightSubtree) and return this value.
    	if (root == null) {
    		return 0;
    	}
    	else {
    		int LH = maximumDepthOfTheTree(root.lChild);
    		int RH = maximumDepthOfTheTree(root.rChild);
    		
    		return 1 + Math.max(LH, RH);
    	}
    }

    //Check this link to understand dfs: https://en.wikipedia.org/wiki/Depth-first_search

    //Example for maximumDepthOfTheTree(Node root):
    //Input:		5
    //			   / \
    //			  4   8
    //			 /   / \
    //			2   7   9
    //			   /     \
    //			  6       10
    //
    //Output: The maximum depth for the above tree is 4.


    //Performs level order traversal and returns an array list.

    public List<Integer> levelOrderTraversal(Node root) {
        //    To do:
        //1.	Create a Queue as Queue<Node> q = new LinkedList<>();
        //2.	Add root node to q as q.offer(root).
        //3.	Iterate through the queue using a while loop. You need to check if queue is empty through while(!q.isEmpty()) {}
        //4.	Next, remove a node from q using poll() as Node node = q.poll().
        //5.	Add the value of the node in the array list.
        //6.	Next, check if left and right child of node are null. If they are not null add them in q using offer.
        //7.	Continue this process till q is not empty.
    	Queue<Node> q = new LinkedList<>();
    	List<Integer> output = new ArrayList<Integer>();
    	q.offer(root);
    	while(!q.isEmpty()) {
    		Node tmpNode = q.poll();
    		output.add((Integer) tmpNode.value);
    		if (tmpNode.lChild != null) {
    			q.offer(tmpNode.lChild);
    		}
    		if (tmpNode.rChild != null) {
    			q.offer(tmpNode.rChild);
    		}
    	}
    	return output;
    }

    //Example for levelOrderTraversal(Node root):
    //Input:	    5
    //			   / \
    //			  4   8
    //			 /   / \
    //			2   7   9
    //			   /     \
    //			  6       10
    //
    //Output: [5,4,8,2,7,9,6,10]


    public static void main(String[] args) {

        // Test the
        BST<Integer, Integer> bstTree = new BST<>();
        bstTree.put(12, 12);
        bstTree.put(17, 17);
        bstTree.put(6, 6);
        bstTree.put(24, 24);
        bstTree.put(31, 31);
        bstTree.put(47, 47);
        bstTree.put(27, 27);
        bstTree.put(20, 20);
        bstTree.put(11, 11);
        bstTree.put(53, 53);
        bstTree.put(96, 96);
        bstTree.put(40, 40);
        bstTree.put(25, 25);
        bstTree.put(70, 70);
        bstTree.put(75, 75);
        
        bstTree.walk("in");
        // test all implemented functions for bstTree
        Random rand = new Random();
        BST<Integer, Integer> randomTree = new BST<>();

        for (int i = 0; i < 13; i++) {
            int key = rand.nextInt(30);
            int val = key;
            randomTree.put(key, val);
        }

        // note: not all of these integers will end up being generated from the for loop
        // some of these return values will be null
        System.out.println(randomTree.get(24));
        System.out.println(randomTree.get(12));
        System.out.println(randomTree.get(10));
        System.out.println(randomTree.get(5));
        System.out.println(randomTree.get(17));
        System.out.println(randomTree.get(28));

        randomTree.walk("in");
        // test all implemented functions for randomTree

    }
}
