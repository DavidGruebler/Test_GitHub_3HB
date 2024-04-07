package queue;

public class ArrayQueue {
	
	private static int front;
	private static int rear;
	private static int capacity;
	private static int[] queue;

	public ArrayQueue(int size) {
		front = 0;
		rear = 0;
		capacity = size;
		queue = new int[size];
	}
	
	
	/**
     * Inserts an element at the end of the queue.
     * @param item The item to be inserted.
     */
	public  void queueEnqueu(int item) {
		if(rear == capacity) {
			System.out.println("Queue ist voll.");
		} else {
			queue[rear]=item;
			rear++;
		}	
	}
	
	/**
     * Removes and returns the first element from the queue.
     * @return The removed element, or 0 if the queue is empty.
     */
	public  int queueDequeue() {
		int firstElement= 0;
		if(rear == front) {
			System.out.println("Queue ist leer");
		} else {
			firstElement = queue[front];
			for (int i = 0; i < (rear - 1); i++) {
				queue[i] = queue[i+1];	
			}
			if(rear < capacity) {
				queue[rear] = 5;
			}
			rear--;
		}
		return firstElement;
	}
	
	/**
     * Displays the contents of the queue.
     */
	public  void queueDisplay() {
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			for(int i = front; i < rear; i++) {
				System.out.println(i);
			}
		}
		
	}
	
	 /**
     * Returns the front element of the queue without removing it.
     * @return The front element of the queue, or 0 if the queue is empty.
     */
	public  int queueFront() {
		//TODO erstes Element ohne Löschen zurückgeben
		int firstElement = 0;
		if(front == rear) {
			System.out.println("Queue is empty");
		}else {
			firstElement = queue[front];
		}
		return firstElement;
	}
	//HÜ: ArrayQueueTest - alle Methoden von ArrayQueue testen
	//JavaDoc-Kommentare
	//Kapitel 5 durchlesen

}
