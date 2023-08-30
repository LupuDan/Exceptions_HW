public class Task_2 {
    {
    try {
        int d = 0;
        int[] intArray = new int[8]; 
        double catchedRes1 = (double) intArray[8] / d; 
        System.out.println("catchedRes1 = " + catchedRes1);
     } catch (ArithmeticException e) {
        System.out.println("Catching exception: " + e);
     } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Catching exception: " + e);
     }
}
}
