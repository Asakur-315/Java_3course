public class FirstTask {

    public static int oneToN(int i, int n){
        if (i > n)
        {
            return -1;
        }
        System.out.println(i);
        return oneToN(i + 1, n);
    }
}

