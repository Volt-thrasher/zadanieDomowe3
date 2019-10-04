public class Mathematics {
    boolean isEven(int a) {
        boolean even = a % 2 == 0;
        return even;
    }
    boolean isOdd(int a){
        boolean odd = !isEven(a);
        return odd;
    }
    double circleField(double r){
       double fld = r*r*3.14;
        return fld;
    }
    int power(int a){
        int pwr = a*a;
        return pwr;
    }
}
