public class exercise1 {
    public static void main(String[] args) {
        //so=2.5
        //vo=25.0
        //a=1.8
        //t=10.0
        double so = 2.5; //initial position
        double vo = 25.0; //initial velocity
        double a = 1.8; //acceleration
        double t = 10.0; //time
        double s; //final position

        s = so + (vo * t) + (0.5 * a * (t*t));
        System.out.println(s);
    }
}
