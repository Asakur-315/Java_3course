import java.util.Iterator;
public class Iterator2dArray<T> implements Iterator<T> {

  private T[][] array;
  private int i, j;
  public Iterator2dArray(T[][] array) {
    this.array = array;
  }
  @Override
  public boolean hasNext() {
    return i < array.length && j < array[i].length;
  }
  @Override
  public T next() {
    T r = array[i][j++];
    if (j >= array[i].length) {
      i++;
      j = 0;
    }
    return r;
  }
  
}