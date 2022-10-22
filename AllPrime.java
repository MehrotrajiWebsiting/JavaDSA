import java.util.Scanner;
public class AllPrime{
// find prime number between two number
    public static void main(String[] args){
        try (Scanner scn = new Scanner(System.in)) {
            int lw= scn.nextInt();
            int hg= scn.nextInt();

            for(int num= lw ;num<= hg;num++){
                int i=2;
                while(i*i<=num){
                  if(num%i==0)
                  break;
                  i++;
                }
                if(num==1)continue;
                
                if(i*i>num)System.out.println(num);
              
            }
        }

    }

}
