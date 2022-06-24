package InheritanceDodong;

public class Dodong extends Papa {
    
//    public int yuta = 30; //so we give the value, it will be the output since we declare it na
   
    public double yuta = super.getBahin(5); //super means, its not within the class but something that is inhireted up above which is sa ka papa na
    
    public double getBahin(int numOfChildren) { //nag inherit na pd siya sa kay papa nga method
        double bahin = (yuta - (yuta * .1)) / numOfChildren;
        return bahin;

    }
}
