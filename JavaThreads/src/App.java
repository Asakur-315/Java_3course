
public class App {

    static void task1(){
        NewThread thread= new NewThread();
        thread.start();
    }
    static void task2(){
        Runnable r = new RunnableClass();
        Thread thread0 = new Thread(r);
        Thread thread1 = new Thread(r);
        Thread thread2 = new Thread(r);
        thread0.start();
        thread1.start();
        thread2.start();
    }

    static void task3(){
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        NewThread2 thread0 = new NewThread2(builder);
        thread0.start();
        NewThread2 thread1 = new NewThread2(builder);
        thread1.start();
        NewThread2 thread2 = new NewThread2(builder);
        thread2.start();

    }
    static void task5(){
        int[] forks = new int[6];

        Philosopher p1 = new Philosopher(1, forks);
        Philosopher p2 = new Philosopher(2, forks);
        Philosopher p3 = new Philosopher(3, forks);
        Philosopher p4 = new Philosopher(4, forks);
        Philosopher p5 = new Philosopher(5,forks);
        
        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        
    }
    public static void main(String[] args) throws Exception {
        task5();
    }
}
