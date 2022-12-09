import java.util.Random;

public class Philosopher extends Thread{
    private boolean leftFork, rightFork = false;
    int spaghettiQty = 600;
    private Random rnd = new Random();
    private void takeLeftFork(){
        try{
            System.out.println(Thread.currentThread().getName() + " берёт левую вилку");    
            Thread.sleep(450);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        leftFork = true;
    }
    private void takeRightFork(){
        try{
            System.out.println(Thread.currentThread().getName() + " берёт правую вилку");    
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        rightFork = true;
    }
    private void dropLeftFork(){
        try{
            System.out.println(Thread.currentThread().getName() + " кладёт левую вилку");    
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        leftFork = false;
    }
    private void dropRightFork(){
        try{
            System.out.println(Thread.currentThread().getName() + " кладёт правую вилку");    
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        rightFork = false;
    }
    
    private void eat(){
        int qty =  rnd.nextInt(30,200);
        if (qty > spaghettiQty) qty = spaghettiQty;
        try{
            spaghettiQty -= qty;
            System.out.println(Thread.currentThread().getName() + " ест " + qty + " грамм спагетти, осталось " + spaghettiQty + " грамм"); 
            Thread.sleep(qty + 500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override
    public void run() {
        if (!rightFork) takeRightFork();
        if (!leftFork) takeLeftFork();
        while (spaghettiQty > 0){
            eat();
        }
        if (leftFork) dropLeftFork();
        if (rightFork) dropRightFork();
        System.out.println(Thread.currentThread().getName() + " закончил есть");
        super.run();
    }
}
