import java.util.Random;

public class RunnableClass implements Runnable{
    Random rnd = new Random(); 
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++){
            if (i % 10 == 0){
                try{
                    Thread t = Thread.currentThread();
                    System.out.println(t.getName() + " : " + i);
                    int sleepTime = rnd.nextInt(100,1000);
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

