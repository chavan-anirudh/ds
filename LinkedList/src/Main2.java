
public class Main2 {

	public static void main(String[] args) {
		LinkedList2 list=new LinkedList2();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		
		list.display();
		
		list.addFirst(50);
		list.display();
		
		list.insertAtPos(80, 3);
		list.display();

	}

}
