public class p7_1 {
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.printf("%s", element);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = {'H','E','L','L','O'};
        System.out.println("Array integerArray contains:");
        printArray(intArray);
        System.out.println("Array doubleArray contains:");
        printArray(doubleArray);
        System.out.println("Array characterArray contains:");
        printArray(charArray);
        System.out.println("This Program is created by 21CE150_Aum");
    }
}