package queue;

public class Test {

	public static void main(String[] args) {
		
		ArrayQueue queue = new ArrayQueue(5);

		queue.queueEnqueu(1);
		queue.queueEnqueu(2);
		queue.queueEnqueu(3);
        
        System.out.println("Elemente wurden erfolgreich in die Queue eingefügt.");

        queue.queueDequeue();
        
        queue.queueDisplay();

       
        queue.queueFront();
    }
}
