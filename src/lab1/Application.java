package lab1;

public class Application {
    public static void main(String[] args) {
        //Тs = Р1 * t1 + (1 – Р1) * Р2 * t2 + (1 – P1 -  (1 – Р1) * Р2 ) * t3 =
        //=P1*t1 + (1-P1)*P2*t2 + (1 - P1 – P2 + P1*P2)*t3
        //10	30	14	0.95	0.75
        System.out.println("Ts = " + getTime(10, 30, 14 / 1000000, 0.95, 0.75) + " ns");
    }

    private static double getTime(double t1, double t2, double t3, double p1, double p2) {
        return p1*t1 + (1-p1)*p2*t2 + (1 - p1 - p2 + p1*p2)*t3;
    }
}
