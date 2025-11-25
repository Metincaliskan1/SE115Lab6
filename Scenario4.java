import java.util.Random;

public class Scenario4 {
    public static void main(String[] args){
        Random random=new Random();
        int[] array=new int[30];
        int peak=0;

        for(int i=0;i< array.length;i++){
            int number= random.nextInt(1,101);
            array[i]=number;

        }
        for (int i=0;i<array.length;i++){
            if (i==0||i==29){
                System.out.println(array[i]);
                continue;
            }

            if(array[i]>array[i-1]&&array[i]>array[i+1]){
                System.out.println(array[i]+" is peak");
                peak++;
            }
            else {
                System.out.println(array[i]);
            }
        }






    }
}
