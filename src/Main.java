import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[]nums = {1, 2, 3};
        reverse(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void reverse (int[] nums)
    {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[nums.length - 1 - i] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }
    }
}
//Переменная — это ячейка в памяти компьютера, которой можно присвоить имя и в которой можно хранить данные.
// Типы - Целочисленные типы byte b = 5; short s = 100; int i = 700; long l = 1000L;
// Тип пременных с плавающей точкой float f = 45.78f; float f = (float) 45.78;
//Метод-геттер  - это метод, с помощью которого получают (считывают) значение переменной, доступ к которой напрямую ограничен