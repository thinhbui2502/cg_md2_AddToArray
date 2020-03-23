import java.util.Scanner;

public class AddToArray {
    public static void main(String[] args) {
        int[] array = {9, 5, 3, 6, 2, 1};
        int length = array.length;
        int[] newArray = new int[length + 1];
        Scanner sc = new Scanner(System.in);
        System.out.println("What element do you want to add?");
        int x = sc.nextInt();
        System.out.println("Which position do you need to add?");
        int add_index = sc.nextInt();
        newArray[add_index] = x;

        if (add_index >= length) {
            System.out.println("Can not add element at this position!!");
        } else {
            for (int i = 0; i < add_index; i++) {
                newArray[i] = array[i];
            }
            for (int i = add_index + 1, j = add_index; i < newArray.length && j < array.length; i++, j++) {
                newArray[i] = array[j];
                System.out.println(newArray[i]);
            }
            System.out.println("The array after adding the element: ");
            for (int value : newArray) {
                System.out.print(value + " ");
            }
        }
    }
}
