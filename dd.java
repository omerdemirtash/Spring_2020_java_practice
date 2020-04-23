package _torba;

import java.util.*;

class dd {
    public static void main(String[] args) {

        /*
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int day =0;

        System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

        int newinhabitants[]= {0,0,0,0,0,0,0,0};


        for(int j=1;j>0;j++) {

            for(int i=0;i<8;i++){
                inhabitants[i]=inhabitants[i]/2;
            }
            day++;
            System.out.println("Day "+day+" "+Arrays.toString(inhabitants));

            if(Arrays.equals(newinhabitants,inhabitants)){
                System.out.println("---- EXTINCT ----");
                System.exit(0);  }

        }
        */

        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.

        int total=0;

        int [] pow= new int[8];
        for(int i =7;i>=0;i--) {
        pow[7-i]= (int) Math.pow(2,7-i); }


        for(int i=0;i<8;i++) {

            total+=binary[i]*pow[i];
        }


        System.out.println(total);
    }
}
