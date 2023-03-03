package LoopCycle;

public class ForLoop {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("-------------------------------------------------------------");

        for (int i=0;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.println(i+ " " + j);
            }
        }
        System.out.println("-------------------------------------------------------------");

        for (int i=0;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");

        int a=6;
        for (int i=1; i<=a;i++){
            for (int j=a;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");

    }
}
