package collections_by_engineerDigest.Queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
class Producer implements Runnable{
    private BlockingQueue<Integer> queue;
    private int value=0;
    public Producer(BlockingQueue<Integer>queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true ){
          try{
              System.out.println("producer produced : "+ value    );
              queue.put(value++);
              Thread.sleep(500);
          } catch (InterruptedException e) {
              Thread.currentThread().interrupt();
              System.out.println("Producer Interrupted");
          }

        }
    }
}
class Consumer implements Runnable{
    private BlockingQueue<Integer> queue;
//    private int value=0;
    public Consumer(BlockingQueue<Integer>queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true ){
            try{
                Integer value = queue.take();
                System.out.println("consumer  consumed: "+ value    );
                queue.put(value);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("consumer Interrupted");
            }

        }
    }
}
public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread Producer  = new Thread(new Producer(queue));
        Thread Consumer = new Thread(new Consumer(queue));
        Producer.start();
        Consumer.start();
    }
}
