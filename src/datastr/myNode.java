package datastr;

public class myNode <Ttype> {
	//1.mainīgie
	private Ttype element;
	private myNode rightChildNode = null;
	private myNode leftChildNode = null;
	private myNode parentNode = null;
	//2. getters
	public Ttype getElement() {
		return element;
	}
	
	public myNode getRightChildNode() {
		return rightChildNode;
	}
	
	public myNode getLeftChildNode() {
		return leftChildNode;
	}
	
	public myNode getParentNode() {
		return parentNode;
	}

	//3.setters
	public void setElement(Ttype element) {
		if(element != null) {
			this.element = element;
		}
		else
		{
			this.element = (Ttype)new Object();
		}
		
	}

	public void setRightChildNode(myNode rightChildNode) {
		this.rightChildNode = rightChildNode;
	}

	public void setLeftChildNode(myNode leftChildNode) {
		this.leftChildNode = leftChildNode;
	}

	public void setParentNode(myNode parentNode) {
		this.parentNode = parentNode;
	}
	
	//4. konstruktors
	public MyNode (Ttype element) {
		setElement(element);
	}
	
	//5.toString
	public String toString() {
		return ""+element;
	}
	
	
}
