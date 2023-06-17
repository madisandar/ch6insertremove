package chapter6java;

public class ch6stackobject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
         Stack1 s = new Stack1();
         while(!s.full()) {
        	 s.push(number);
        	 System.out.println("Number pushed is " + number); 
        	 number++;
         }
         
         System.out.println();
         
         while(!s.empty()) {
        	 number = s.pop();
        	 System.out.println("Number popped is " + number);
  	 
         }      
	}
}

 class Stack1{
	int content[] = new int[10];
	int index = 0;
	
	boolean empty() {
		return (index == 0) ? true : false;
	}
	
	boolean full() {
		return (index > 9) ? true : false;
	}
	
	void push(int i) {
		content[index++] = i;
	}
	
	int pop() {
		return content[--index];
	}
}
