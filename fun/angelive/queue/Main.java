package fun.angelive.queue;

import fun.angelive.queue.impl.QueueImpl;

public class Main {

    public static void main(String[] args) {
        QueueImpl<Integer> queue = new QueueImpl<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
