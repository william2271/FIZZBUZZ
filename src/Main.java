public class Main {
    public static void main(String[] args) {

/*Classic FIZZBUZZ Project
        //Rules:
        // 1.Count from 1 to 100
        //2. if a number is multiple of 3 then print FIZZ
        //3. if a number is multiple of 5 then print BUZZ
        //4. if a number is multiple of both then print FIZZBUZZ  */

        for(int i = 1; i<=100;i++ ) {
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FIZZBUZZ");
            } else if(i % 3 ==0 ) {
                System.out.println("FIZZ");

            } else if (i % 5==0){
                System.out.println("BUZZ");
            } else {
                System.out.println(i);
            }

        }

    }

}
