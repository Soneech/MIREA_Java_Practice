package practice8;

public class BoundedWaitList<E> extends WaitList<E> {
    private int capacity;

    public BoundedWaitList(int capacity) {
        super();
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(E element) {
        if (content.size() < capacity) {
            content.add(element);
        }
        else {
            throw new Error("Error: [BoundedWaitList] the addition limit has been exceeded");
        }
    }
}
