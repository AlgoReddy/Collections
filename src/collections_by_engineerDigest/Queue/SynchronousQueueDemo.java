package collections_by_engineerDigest.Queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class SynchronousQueueDemo {
    public static void main(String[] args) {
        BlockingQueue <String> queue = new SynchronousQueue<>();
        Thread Producer = new Thread(()->{
            try{
                System.out.println("Producer is waiting  to transfer . . . ");
                queue.put("Hello from producer!");
                System.out.println("Producer has transfered the message ");
            }catch (InterruptedException e ){
                Thread.currentThread().interrupt();
                System.err.println("Producer was interuppted");

            }
        });
        Thread Consumer = new Thread(()->{
            try{

                System.out.println("consumer is waiting to receive ");
                String message = queue.take();
                System.out.println("Consumer received : " + message);

            }catch (InterruptedException e ){
                Thread.currentThread().interrupt();
                System.err.println("Consumer is Interputted");
            }

        });
        Producer.start();
        Consumer.start();
    }
}
