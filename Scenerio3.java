import java.util.Random;

public class Scenerio3 {
    public static void main(String[] args){
        Random random =new Random();
        int[] day=new int[1000000];
        //String[] targets={"sunny","sunny","sunny","sunny","cloudy","cloudy","cloudy",
        //"rainy","rainy","stormy"};
        int[] targets={1,1,1,1,2,2,2,3,3,4};

        float sunnyCount=0;
        float cloudyCount=0;
        float rainyCount=0;
        float stormyCount=0;


        for(int i=1;i<1000000;i++){
            int randomNum=random.nextInt(10);
            day[i]=targets[randomNum];
            if (day[i]==1){
                //System.out.println("Sunny");
                sunnyCount++;
            }
            if (day[i]==2){
                //System.out.println("Cloudy");
                cloudyCount++;
            }
            if(day[i]==3){
                //System.out.println("Rainy");
                rainyCount++;
            }
            if(day[i]==4){
                //System.out.println("Stormy");
                stormyCount++;
            }
        }
        System.out.println("In the 1.000.000 days;");
        System.out.println("Sunny "+sunnyCount+" times executed.");
        System.out.println("Cloudy "+cloudyCount+" times executed.");
        System.out.println("Rainy "+rainyCount+" times executed.");
        System.out.println("Stormy "+stormyCount+" times executed.");

        System.out.println("Sunny: "+(sunnyCount/1000000)*100+"%");
        System.out.println("Cloudy: "+(cloudyCount/1000000)*100+"%");
        System.out.println("Rainy: "+(rainyCount/1000000)*100+"%");
        System.out.println("Stormy: "+(stormyCount/1000000)*100+"%");




    }
}
