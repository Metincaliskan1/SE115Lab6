import java.util.Random;

public class Bonus {
    public static void ScoreTable(int student1[],int student2[],int student3[],int student4[],int student5[]){
        String s =

        "         Q1"+" Q2"+" Q3"+" Q4\n"+
         "Student1"+"|"+student1[0]+"|"+student1[1]+"|"+student1[2]+"|"+student1[3]+"|\n"+
         "Student2"+"|"+student2[0]+"|"+student2[1]+"|"+student2[2]+"|"+student2[3]+"|\n"+
         "Student3"+"|"+student3[0]+"|"+student3[1]+"|"+student3[2]+"|"+student3[3]+"|\n"+
         "Student4"+"|"+student4[0]+"|"+student4[1]+"|"+student4[2]+"|"+student4[3]+"|\n"+
         "Student5"+"|"+student5[0]+"|"+student5[1]+"|"+student5[2]+"|"+student5[3]+"|";
        System.out.println(s);
    }
    public static double[] studentAvarage(int student1[],int student2[],int student3[],int student4[],int student5[]){
        double[] averages=new double[5];
        averages[0]= (double)(student1[0] + student1[1] + student1[2] + student1[3]) / 4;
        averages[1]= (double)(student2[0] + student2[1] + student2[2] + student2[3]) / 4;
        averages[2]= (double)(student3[0] + student3[1] + student3[2] + student3[3]) / 4;
        averages[3]= (double)(student4[0] + student4[1] + student4[2] + student4[3]) / 4;
        averages[4]= (double)(student5[0] + student5[1] + student5[2] + student5[3]) / 4;
        return averages;
    }
    public static double[] quizAverage(int student1[],int student2[],int student3[],int student4[],int student5[]){
        double[] averages=new double[4];
        averages[0]=(double)(student1[0]+student2[0]+student3[0]+student4[0]+student5[0])/5;
        averages[1]=(double)(student1[1]+student2[1]+student3[1]+student4[1]+student5[1])/5;
        averages[2]=(double)(student1[2]+student2[2]+student3[2]+student4[2]+student5[2])/5;
        averages[3]=(double)(student1[3]+student2[3]+student3[3]+student4[3]+student5[3])/5;
        return averages;
    }
    public static void findingHighScore(int student1[],int student2[],int student3[],int student4[],int student5[]){
        int row=0;
        int column=0;
        int maxScore=0;
        int studentindex=0;
        int quizindex=0;
        for(int i=0;i<4;i++){
            if (student1[i]>maxScore){
                maxScore=student1[i];
                studentindex=0;
                quizindex=i;
            }
        }
        for(int i=0;i<4;i++){
            if (student2[i]>maxScore){
                maxScore=student2[i];
                studentindex=1;
                quizindex=i;
            }
        }
        for(int i=0;i<4;i++){
            if (student3[i]>maxScore){
                maxScore=student3[i];
                studentindex=2;
                quizindex=i;
            }
        }
        for(int i=0;i<4;i++){
            if (student4[i]>maxScore){
                maxScore=student4[i];
                studentindex=3;
                quizindex=i;
            }
        }
        for(int i=0;i<4;i++){
            if (student5[i]>maxScore){
                maxScore=student5[i];
                studentindex=4;
                quizindex=i;
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("Highes score is "+maxScore);
        System.out.println("The location "+quizindex+","+studentindex);


    }
    public static void main(String[] args){
        Random random = new Random();
        int[] student1=new int[4];
        int[] student2=new int[4];
        int[] student3=new int[4];
        int[] student4=new int[4];
        int[] student5=new int[4];
        int quizNum = random.nextInt(0, 101);


        for(int i=0;i<4;i++) {
            quizNum = random.nextInt(0, 101);
            student1[i] = quizNum;
            quizNum = random.nextInt(0, 101);
            student2[i] = quizNum;
            quizNum = random.nextInt(0, 101);
            student3[i] = quizNum;
            quizNum = random.nextInt(0, 101);
            student4[i] = quizNum;
            quizNum = random.nextInt(0, 101);
            student5[i] = quizNum;
        }
        ScoreTable(student1,student2,student3,student4,student5);
        double[] student_avrge= studentAvarage(student1,student2,student3,student4,student5);
        System.out.println("----------------Student avarages----------------");

        for(int i=0;i<5;i++){
            i++;
            System.out.print("Student "+i);
            i--;
            System.out.print(" "+student_avrge[i]);
            System.out.println();
        }
        System.out.println("----------------Quiz avarages-------------------");

        double[] quiz_avrge=quizAverage(student1,student2,student3,student4,student5);

        for (int i=0;i<4;i++){
            i++;
            System.out.print("Quiz "+i);
            i--;
            System.out.print(" "+quiz_avrge[i]);
            System.out.println();
        }
        findingHighScore(student1,student2,student3,student4,student5);







    }
}
