import java.util.Random;

public class Scenerio2 {

    public static int[] rotatedArr(int arr[]){
        int[] rotatedArr=new int[arr.length];
        int lastElement=arr[arr.length-1];
        rotatedArr[0]=lastElement;

        for(int i=0;i<arr.length-1;i++){
            rotatedArr[i+1]=arr[i];
        }
        return rotatedArr;
    }



    public static void main(String[] args){
        Random random =new Random();
        int arraysize= random.nextInt(10,21);

        int[] arr=new int[arraysize];
        for(int i=0;i<arr.length;i++){
            int randomValue=random.nextInt(0,100);
            arr[i]=randomValue;
        }
        System.out.println("The old array");

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("-----------------");
        System.out.println("The rotated array");
        int rotatedArr[]=rotatedArr(arr);
        for (int i=0;i<rotatedArr.length;i++){
            System.out.println(rotatedArr[i]);
        }



    }
}
