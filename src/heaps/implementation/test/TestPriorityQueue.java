package heaps.implementation.test;

import queues.IntegerHeap;

public class TestPriorityQueue
{
    public static void main(String[] args)
    {
        IntegerHeap queue = new IntegerHeap();

        queue.insert(500);
        queue.insert(250);
        queue.insert(750);
        queue.insert(150);
        queue.insert(300);
        queue.insert(500);
        queue.insert(110);

        System.out.println(queue);

        //print them out
        while (!queue.isEmpty())
        {
            System.out.println(queue.remove());
        }
    }
}