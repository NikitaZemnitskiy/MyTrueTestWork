public class Task3 {

    public static double AreaOfATriangle(int x1, int y1, int x2, int y2, int x3, int y3){


        double a = Math.sqrt((x1-y1) *(x1-y1)+(x2-y2)*(x2-y2));
        double b = Math.sqrt((x1-y1)*(x1-y1)+(x3-y3)*(x3-y3));
        double c  = Math.sqrt((x2-y2)*(x2-y2)+(x3-y3)*(x3-y3));

        boolean valid = a + b >  c
                && b + c > a
                && c + a > b;

        if (!valid) {
            System.out.println("The entered coordinates do not form a triangle");
            return -1;
        }

        double p = (a+b+c)/2;
        double S = Math.sqrt(p* ((p-a)*(p-b)*(p-c)));
        return S;
    }

}
