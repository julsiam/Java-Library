package Interface;

public class ImplementsClass implements InterfaceClass {

    int val;

    public ImplementsClass() {
        val = 0;
    }

    public int getNext() {
        val += 2;
        return val;
    }

    public double getSum(double a, double b) {
        double val = a + b;
        return val;
    }
    
    public double getSubtract(double c, double d) {
        double val = c - d;
        return val;
    }
    
    public double getTimes(double e, double f) {
        double val = e * f;
        return val;
    }
    
    public double getDivide(double g, double h) {
        double val = g / h;
        return val;
    }
    
    
    
    
}
