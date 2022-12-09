public class NewThread extends Thread{

    @Override
    public void run() {
        int i;
        super.run();
        for (i = 1;i <= 100;i++){
            System.out.println(i);
        }
    }
}
