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
    public static void main(String[] args) throws Exception {
        task3();
    }
}
