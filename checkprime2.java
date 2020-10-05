import java.util.Scanner;

public class checkprime2 {
    
        public static void main(String[] args) {
            // write your code here
            Scanner scn = new Scanner(System.in);
            int low = scn.nextInt();
            int high = scn.nextInt();
            
            for(int i = low; i<=high; i++)
            {
                int ctr = 0;
                for(int c = 2; c*c <= i; c++)
                {
                    if(i%c==0)
                    {
                        ctr++;
                        break;
                    }
                }
                if(ctr == 0)
                {
                    System.out.println(i);
                }
            }
            scn.close();
        }
        
      
}