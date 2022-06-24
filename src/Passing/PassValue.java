package Passing;

//pass by value is just directly passing the premitive type (int, double)
//pass by reference in passing the reference type 

public class PassValue {
    public double sum(Values val){ //Inside the parameter will be the reference type - from another class
        double a = val.num1;    // reference variable val
        double b = val.num2;       // Values is the Reference type while the val is the reference variable
        return a + b;
        
    }
    public double minus(Values val){
        double a = val.num1;
        double b = val.num2;
        return a - b;
        
    }
    
    public double times(Values val){ 
        double a = val.num1;
        double b = val.num2;
        return a * b;
    }
    
    public double divide(Values val){
        double a = val.num1;
        double b = val.num2;
        return a / b;
        
    }
    
    public double modulos(Values val){
        double a = val.num1;
        double b = val.num2;
        return a % b;
        
    }
}
