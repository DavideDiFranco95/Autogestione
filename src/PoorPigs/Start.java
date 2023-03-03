package PoorPigs;

public class Start {
    public static void main(String[] args) {
        Solution pig1 = new Solution();
        Solution pig2 = new Solution();
        Solution pig3 = new Solution();
        Solution pig4 = new Solution();
        pig1.poorPigs(1,10,15);
        pig2.poorPigs(2,10,15);
        pig3.poorPigs(3,10,15);
        pig4.poorPigs(4,10,15);

        System.out.println(pig1);
        System.out.println(pig2);
        System.out.println(pig3);
        System.out.println(pig4);


    }
}
