
public class Queue<E> implements QueueInterface<E> {

	private E[] data;
	private int f = 0;
	private int counter = 0;
	
	
	public Queue(int size) {
		data = (E[]) new Queue[size];
	}
	
	public int size() {
		
		return counter;
	}

	public boolean isEmpty() {
		
		return counter==0;
	}

	public E first() {
		if (isEmpty()) return null;
		return data[f];
	}

	public void enqueue(E e) throws IllegalStateException {
		if (counter == data.length) throw new IllegalStateException("Queue is full");
		int avail = (f + counter)%data.length;
		System.out.println(counter);
		System.out.println(f);
		System.out.println(data.length);
		System.out.println(avail);
		data[avail] = e;
		counter++;

		
	}

	public E dequeue() {
		if (isEmpty()) return null;
		E answer = data[f];
		data[f] = null;
		f = (f+1) % data.length;
		return answer;
	}

}
