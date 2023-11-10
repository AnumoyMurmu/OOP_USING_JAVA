// Write a java programme which will add last 4 digits of
//   your roll number and show the summation of it. 

public class Assignment02 {
    public static void main(String[] args){
        int roll=20221079;
        int numb=0;

        for(int i=0; i<4; i++){
            numb = numb+roll%10;
            roll=roll/10;
        }

        System.out.println(numb);
    }
}
