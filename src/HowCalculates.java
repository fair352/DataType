import jdk.swing.interop.SwingInterOpUtils;

public class HowCalculates {
    public static void main(String[] args) {
        int n=5%3;
        System.out.println("n="+n);
        double m=5./0*0;
        System.out.println("m="+m);

        m=Math.sin(Math.PI/6);
        System.out.println("m="+m);
    }
}
