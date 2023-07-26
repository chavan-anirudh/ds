
public class LinkedList2 {
	private Node2 head;
	
	void addLast(int data) {
		
		
		//create new node and init it
		Node2 newNode=new Node2(data);
		
		if(head==null) {
			head=newNode;
		}else {
		//traverse till the last node
		Node2 trav=head;
		while(trav.getNext() != null) {
			trav=trav.getNext();
			
		}
		trav.setNext(newNode);
		}
	}
	
	void addFirst(int data) {
		Node2 newNode=new Node2(data);
		
		newNode.setNext(head);
		
		head=newNode;
	}
	
	void insertAtPos(int data,int pos) {
	  Node2 newNode=new Node2(data);
	  
	  Node2 trav=head;
	  for(int i=1;i<pos-1;i++) {
		  trav=trav.getNext();
	  }
	  
	  newNode.setNext(trav.getNext());
	  trav=newNode.getNext();
	  trav.setNext(newNode);
	}
	
	
	
	
	public void display() {
		Node2 temp=head;
		while(temp != null) {
			System.out.print(temp.getData()+" ");
			temp=temp.getNext();
		}
		System.out.println("");
	}

}
