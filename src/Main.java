import java.util.Arrays;
public class Main {
    public static void main(String[] arguments) {
        int number = 6;
        CustomList customList = new CustomList(new int[]{5, 7, 8, 9, 10, 6, 6});

        customList.add(number);
        System.out.println(customList);

        customList.remove(number);
        System.out.println(customList);

        customList.removeAll(number);
        System.out.println(customList);

        int firstFoundIndex = customList.indexOf(number);
        System.out.println(firstFoundIndex);
    }
}
