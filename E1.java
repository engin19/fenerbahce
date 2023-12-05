package groupProject;

public class E1 {
    public static void main(String[] args) {
        //Create a program that uses an array to store a list of temperatures for a week,
        //and then uses a loop to find the highest and lowest temperature for the week.
        int[] temp={67,41,58,55,37,54,62};
        int highest=temp[0];
        int lowest=temp[0];
        for (int i=1; i< temp.length;i++){
                if (temp[i]>highest);{
                highest=temp[i];

            }if (temp[i]<lowest){
                lowest=temp[i];

            }System.out.println("The highest temperature for the week: " + highest);
            System.out.println("The lowest temperature for the week: " + lowest);
        }





    }
}
