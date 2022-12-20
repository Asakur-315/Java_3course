import java.util.Arrays;

public class SecondTask {
    

    public static void findNumber(){
        int l = 10000; // При прогоне с длиной больше - поиск перебором иногда вызывает переполнение стека вызовов
        int[] array = new int[l];
        for (int i = 0; i < array.length; i++){
            array[i] = 10000-i;
        
        }
        
        long startTime = System.nanoTime();

        SecondTask.checkWithEnumeration(array, 7770, 0);

        long finishTime = System.nanoTime(); 
        System.out.println("На поиск методом перебора потребовалось "+ (finishTime - startTime) + " нс");
        
        
        startTime = System.nanoTime();

        Arrays.sort(array);
        SecondTask.checkWithBinarySearch(array,7770,0,l);

        finishTime = System.nanoTime(); 
        System.out.println("На двоичный поиск потребовалось "+ (finishTime - startTime) + " нс");

        //По наблюдениям поиск методом перебора требует меньше времени только в случае, если искомый элемент находится в начале массива
        //Метод перебора работает быстрее только до x ~ 5500
        //Хотя, честно говоря - наблюдения не особо достоверные, слишком в наносекундах получается большой разброс. Было бы проще с длиной массива 10000000, если бы не stack owerflow, но я не понимаю как его избежать.
        //P.S. потом попробую прогнать на ноутбуке, он послабее, наверное будет нагляднее
    }

    public static boolean checkWithEnumeration(int[] array, int x, int i){
        if (i >=  array.length) {
            System.out.println("No");
            return false;
        }
        if (array[i] == x){
            System.out.println("index: " + i);
            return true;
        }

        return checkWithEnumeration(array, x, i+1);
    }

    public static boolean checkWithBinarySearch(int[] array, int x , int i1, int i2){

        if (i2 >= i1) {
            int mid = i1 + (i2 - i1) / 2;

            if (array[mid] == x){
                System.out.println("index: " + mid);
                return true;
            }

            if (array[mid] > x){
                return checkWithBinarySearch(array, x, i1, mid - 1);
            }
            return checkWithBinarySearch(array, x, mid + 1, i2);
        }
        System.out.println("Net");
        return false;
    }

}
