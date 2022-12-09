import java.util.HashMap;
import java.util.Map;

public class Forks {
    Map<Integer,Boolean> forks = new HashMap<Integer,Boolean>();


    Forks (){
        forks.put(1, false);
        forks.put(2, false);
        forks.put(3, false);
        forks.put(4, false);
        forks.put(5, false);
        forks.put(6, false);
    }

    public void take(int key){
        forks.replace(key, true);

    }

    public void put(int key){
        forks.replace(key, false);

    }

    public boolean isTaken(int key){
        return forks.get(key);
    }
}
