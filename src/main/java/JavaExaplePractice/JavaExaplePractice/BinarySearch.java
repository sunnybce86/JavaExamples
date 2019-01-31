package JavaExaplePractice.JavaExaplePractice;

class Node
{
	int data;
	Node next;
	public String info;
	Node(int info)
	{
		data=info;
		next=null;
		
	}
	
}

public class BinarySearch {

	static Node head;
	
	static Node first=head;
	
	static Node secound=head;
	
	
	public static void main(String[] args) {
		
		BinarySearch.head=new Node(10);
		BinarySearch.head.next=new Node(20);
		BinarySearch.head.next.next=new Node(30);
		
		
		if(head!=null)
		{
	
			while(first != null && secound.next != null)
			{
			 
				first=first.next;// one step
				secound=secound.next.next;// secound step
				
				
			}
			System.out.println(secound.data);
			
		}
		
		
		
	}
	
	
}
