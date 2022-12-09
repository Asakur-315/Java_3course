public class NewThread2 extends Thread{

    volatile StringBuilder builder;
    NewThread2(StringBuilder builder){
        this.builder = builder;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            System.out.println(Thread.currentThread().getName() +" " + i +": "+ builder);
        }
        builder.append('a');
        super.run();
    }
}
