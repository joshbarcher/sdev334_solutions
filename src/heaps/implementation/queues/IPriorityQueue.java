package heaps.implementation.queues;

public interface IPriorityQueue
{
    /**
     * Adds a new element to the heap
     * @param element the new element
     */
    void insert(int element);

    /**
     * Remove and return the min element
     * @return the smallest element
     */
    int remove();

    /**
     * Returns the min element
     * @return the smallest element
     */
    int peek();

    int size();
    boolean isEmpty();
}