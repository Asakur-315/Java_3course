import java.util.Collection;
import java.util.HashSet;

public class CollectionRemoveDuplicates<T> {
    public static <T> Collection<T> removeDuplicates(Collection<T> collection){
        return new HashSet<>(collection);
    }

}
