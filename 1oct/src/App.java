import java.util.*;

public class App {

    private static void task1() {
        Integer[][] arr2d = {{1,2},{3,4,5},{6,7,8}};
        Iterator2dArray<Integer> iterator = new Iterator2dArray<>(arr2d);
        for (;iterator.hasNext();) {
            System.out.println(iterator.next());
          }
    }

    private static void task2() {
       // Iterator2Iterators iterator2it = new Iterator2Iterators(null, null)
    }

    private static void task5() {
        ArrayList<String> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(new String[]{"a", "b" , "c" , "b"}));
        System.out.println(Arrays.toString(list5.toArray()));
        list5 = new ArrayList<String>(CollectionRemoveDuplicates.removeDuplicates(list5));
        System.out.println(Arrays.toString(list5.toArray()));

    }
    public static void main(String[] args) throws Exception {

        task1();
        task5();
    }
}
