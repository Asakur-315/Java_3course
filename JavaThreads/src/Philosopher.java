import java.util.Random;

public class Philosopher extends Thread{
    private boolean leftFork, rightFork = false;
    private int spaghettiQty = 600;
    private int leftForkId;
    private int rightForkId;
    private volatile int[] forksInt = new int [6];
    private Random rnd = new Random();
    //volatile Forks forks;

    Philosopher (int leftForkId, int[] forks){
        this.leftForkId = leftForkId;
        this.forksInt = forks;
        rightForkId = (getLid() == 1 ? 5 : getLid() - 1);
    }

    public int getLid(){
        return this.leftForkId;
    }
    public int getRid(){
        return this.rightForkId;
    }

    private void takeLeftFork(){
        if (forksInt[getLid()] == 1){think();}
        else{
            forksInt[getLid()] = 1;
            //forks.take(getLid());
            leftFork = true;
            System.out.println(Thread.currentThread().getName() + " берёт левую вилку");    

        }
    }
    private void takeRightFork(){
        if (forksInt[getRid()] == 1){think();}
        else{
            forksInt[getRid()] = 1;
            //forks.take(getRid());
            rightFork = true; 
            System.out.println(Thread.currentThread().getName() + " берёт правую вилку");    

        }
    }
    private void dropLeftFork(){
        forksInt[getLid()] = 0;
        //forks.put(getLid());
        leftFork = false;
        try{
            System.out.println(Thread.currentThread().getName() + " кладёт левую вилку");    
            Thread.sleep(450);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private void dropRightFork(){
        forksInt[getRid()] = 0;
        try{
            System.out.println(Thread.currentThread().getName() + " кладёт правую вилку");    
            Thread.sleep(450);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        //forks.put(getRid());
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

    private void think(){
        try{
            System.out.println(Thread.currentThread().getName() + " размышляет");    
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }              
    }
    @Override
    public void run() {
        while (true){
            if (!(leftFork && rightFork)){
                takeLeftFork();
                takeRightFork();
            } else{
                break;
            }
        }

        while (spaghettiQty > 0){
            eat();
        }

        if (leftFork) dropLeftFork();
        if (rightFork) dropRightFork();
        System.out.println(Thread.currentThread().getName() + " закончил есть");
        super.run();
    }
}
