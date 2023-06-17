package chapter6java;

public class ch6insertremove {
	
	static int content[] = new int[10];
	static int index = 0;
	
	static boolean empty() {
		return (index == 0) ? true : false;
	}
	
	static boolean full() {
		return (index > 9) ? true : false;
	}
	
	static void push(int i) {
		content[index++] = i;
	}
	
	static int pop() {
		return content[--index];
	}

	public static void main(String[] args) {
		
         int number = 1;
         while(!full()) {
        	 push(number);
        	 System.out.println("Number pushed is " + number);
        	 number++;
         }
         
         System.out.println();
         
         while(!empty()) {
        	 number = pop();
        	 System.out.println("Number popped is " + number);
         }
	}

}
