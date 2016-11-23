package estructuras;

public interface ICola {
	// Pre: !isFull()
	public void enqueue(Object o);

	// Pre: !isEmpty()
	public void dequeue();

	// Pre: !isEmpty()
	public Object front();

	// Pre: !isEmpty()
	public Object frontAndDequeue();

	public int size();

	public void empty();

	public boolean isEmpty();

	public boolean isFull();

	public boolean exists(Object o);

	// Pre: exists(o)
	public void remove(Object o);
}