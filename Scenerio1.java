public class Scenerio1 {
    public static int[] larger(int new_size,int oldroster[]){
        int[] newroster=new int[new_size];
        for (int i=0;i<oldroster.length;i++){
            newroster[i]=oldroster[i];
        }
        return newroster;
    }



    public static void main(String[] args){
        int[] roster=new int[20];
        int num=1000;


        for(int i=0;i<20;i++){
            roster[i]=num;
            num++;
        }
        System.out.println("The old array");
        for(int i=0;i< roster.length;i++){
            System.out.println(roster[i]);
        }
        System.out.println("----------------------");


        int[] NewRoster=larger(42,roster);

        System.out.println("The new array");
        System.out.println("----------------------");

        for(int i=0;i< NewRoster.length;i++){
            System.out.println(NewRoster[i]);
        }


    }
}
