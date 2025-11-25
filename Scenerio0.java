public class Scenerio0{
    public static void main(String[] args) {
        int[] myArr = {4, 8, 15, 16, 23, 42};
        System.out.println ("The length of array is "+myArr.length);
        System.out.println ("The first element is "+myArr[0]);
        System.out.println ("The last element is "+myArr[5]);
        System.out.println ("The third element is "+myArr[2]);
        System.out.println ("myArr[3] value is "+myArr[3]);
        System.out.println ("ıf we put [10], Index 10 out of bounds for length 6");
//Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 6
// at Main.main(Main.java:15)
    }
}

