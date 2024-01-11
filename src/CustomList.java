import java.util.Iterator;
import java.util.Arrays;
public class CustomList implements Iterable{
    private int[] array;
    public CustomList(int[] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new CustomIterator(array);
    }
    public void add(int number)  {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = number;
    }
    @Override
    public String toString() {
        return Arrays.toString(array);
    }
    public void remove(int number) {
        int indexOfNumberToRemove = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                indexOfNumberToRemove = i;
                break;
            }
        }
        if (indexOfNumberToRemove != -1) {
            for (int i = indexOfNumberToRemove; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array = Arrays.copyOf(array, array.length - 1);
        }
    }
    public void removeAll(int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        int newSize = array.length - count;
        int[] newArray = new int[newSize];
        int newIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[newIndex++] = array[i];
            }
        }
        array = newArray;
    }
    public int indexOf(int number) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
}
