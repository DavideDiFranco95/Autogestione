package LoopCycle;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {12, 23, 44, 56, 78};
        for (int i : arr) {
            System.out.println(i);
        }

        System.out.println("-------------------------------------------------------------");

        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("-------------------------------------------------------------");

        aa:
        for (int i=1;i<=3;i++){
            bb:
            for (int j=1;j<=3;j++){
                if (i==2&&j==2){
                    break bb;
                }
                System.out.println(i + " " + j);
            }
        }

        System.out.println("-------------------------------------------------------------");

        //Infinite loop
        /*for (;;){
            System.out.println("infinite loop");
        }*/


    }
}
