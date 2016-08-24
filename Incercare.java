package Incercari;

import java.util.Scanner;

/**
 * Created by filip.badea on 8/24/2016.
 */
public class Incercare {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int T=sc.nextInt();
        long Limit;
        for (int i = 0; i < T; i++) {
            Limit = sc.nextInt();
            //System.out.println(Limit);
            long Fsum1=1;
            long Fsum2=2;
            long temp=0;
            long Bun=0;
            while(true) {
                if (Fsum2 > Limit) {
                    break;
                }

                temp=Fsum2;
                Fsum2 = Fsum1+Fsum2;
                Fsum1 = temp;
                if(Fsum1%2==0)
                    Bun=Bun+Fsum1;

            }
                System.out.println(Bun);

                
            }
            
        }


}
