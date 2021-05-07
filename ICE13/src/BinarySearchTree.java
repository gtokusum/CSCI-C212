
public class BinarySearchTree{

	  private Node root;

	  public BinarySearchTree(){
	    root = null;
	  }
	  
	  public void add(Comparable<Node> obj){
	    Node newNode = new Node();
	    newNode.data = obj;
	    newNode.left = null;
	    newNode.right = null;
	    if (root == null){ root = newNode;}
	    else{ root.addNode(newNode);}
	  }

	  public boolean find(Comparable<Node> obj){
	    Node current = root;
	    while (current != null){
	      int d = current.data.compareTo(obj);
	      if (d==0) {return true;}
	      else if(d>0){current = current.left;}
	      else{current = current.right;}
	    }
	    return false;
	  }

	  public void remove(Comparable<Node> obj){
	    Node toBeRemoved = root;
	    Node parent = null;
	    boolean found = false;
	    while (!found && toBeRemoved != null){
	      int d = toBeRemoved.data.compareTo(obj);
	      if (d==0) {found = true;}
	      else{
	        parent = toBeRemoved;
	        if (d > 0){toBeRemoved = toBeRemoved.left;}
	        else{toBeRemoved = toBeRemoved.right;}
	      }
	    }

	    if (!found){return;}

	    if (toBeRemoved.left == null || toBeRemoved.right == null){
	      Node newChild;
	      if (toBeRemoved.left == null){
	        newChild = toBeRemoved.right;
	      }
	      else{
	        newChild = toBeRemoved.left;
	      }

	      if (parent == null){
	        root = newChild;
	      }
	      else if (parent.left == toBeRemoved){
	        parent.left = newChild;
	      }
	      else{
	        parent.right = newChild;
	      }
	      return;
	    }

	    Node smallestParent = toBeRemoved;
	    Node smallest = toBeRemoved.right;
	    while (smallest.left != null){
	      smallestParent = smallest;
	      smallest = smallest.left;
	    }

	    toBeRemoved.data = smallest.data;
	    if(smallestParent == toBeRemoved){
	      smallestParent.right = smallest.right;
	    }
	    else{
	      smallestParent.left = smallest.right;
	    }
	  }

	  public void print(){
	    print(root);
	    System.out.println();
	  }

	  private static void print(Node parent){
	    if (parent == null){return;}
	    print(parent.left);
	    System.out.print(parent.data+ " ");
	    print(parent.right);
	  }

	  class Node{
	    public Comparable data;
	    public Node left;
	    public Node right;

	    public void addNode(Node newNode){
	      int comp = newNode.data.compareTo(data);
	      if(comp<0){
	        if (left == null){left = newNode;}
	        else{left.addNode(newNode);}
	      }
	      else if (comp < 0){
	        if (right == null) {right = newNode;}
	        else{right.addNode(newNode);}
	      }
	    }
	  }


	}