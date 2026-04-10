package datastr;

public class MyHeap <Ttype> {
	private myNode<Ttype> rootNode = null;
	private myNode<Ttype> lastNode = null;
	private int howManyElements = 0;
	private int level = 0;
	
	public int getHowManyElements() {
		return howManyElements;
	}
	
	
	public boolean isEmpty() {
		return (howManyElements == 0);
	}
	
	public boolean isFull() {
		try {
			new myNode('a');
			return false;
		} catch (OutOfMemoryError error) {
			return true;
		}

	}

	
	public void add(Ttype element) throws Exception{
		if(isFull()) {
			throw new Exception("Kaudze ir pilna un nevar pievienot jaunu elementu");
		}
		
		if(element == null) {
			throw new Exception("Ievades elements nevar būt null");
		}
		
		if(isEmpty()) {
			myNode newNode = new myNode(element);
			rootNode = newNode;
			lastNode = newNode;
			howManyElements++;
		}
		else
		{
			myNode newNode = new myNode(element);
			if(howManyElements == 1) {
				newNode.setParentNode(rootNode);
				rootNode.setLeftChildNode(newNode);
				lastNode = newNode;
				level++;
			}
			
			if(lastNode.getParentNode().getRightChildNode() == null) {
				lastNode.getParentNode().setRightChildNode(newNode);
				newNode.setParentNode(lastNode.getParentNode());
				lastNode = newNode;
			}
			
			int sum = 0;
			for(int i = 0; i < level; i++) {
				sum += Math.pow(2, i);
			}
			
			if(howManyElements == sum) {
				myNode currentNode = rootNode;
				
				while(currentNode.getLeftChildNode()!=null) {
					currentNode = currentNode.getLeftChildNode();
				}
				
				currentNode.setLeftChildNode(newNode);
				newNode.setParentNode(currentNode);
				lastNode = newNode;
			}
			
			
			
			
			//TODO reheapUp(newNode);
			howManyElements++;
		}
		}
	private void reheapUp(myNode<Ttype> node) {
        if (node != null && node.getParentNode() != null) {

            myNode<Ttype> parent = node.getParentNode();

            if (((Comparable) parent.getElement())
                    .compareTo(node.getElement()) < 0) {

                Ttype temp = (Ttype) parent.getElement();

                parent.setElement(node.getElement());
                node.setElement(temp);

                reheapUp(parent);
            }
        }
    }
	public void print() throws Exception {
		if(isEmpty()) {
			throw new Exception("Kaudze ir tuksa un nav elementu ko printet");
		}
		printHelper(rootNode);
	}
	private void printHelper(myNode node) {
		if (node!= null) {
			System.out.println("P:"+node.getElement());
		}
		if (node.getLeftChildNode()!= null) {
			System.out.println("P:"+node.getElement()+"LC: "+node.getLeftChildNode().getElement());
			printHelper(node.getLeftChildNode());
		}
		if (node.getRightChildNode()!= null) {
			System.out.println("P:"+node.getElement()+"RC: "+node.getRightChildNode().getElement());
			printHelper(node.getRightChildNode());
		}
	}
}

	
