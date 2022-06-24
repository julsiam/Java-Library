
package InheritanceDodong;


public class Lolo { 

    public int yuta = 10; //the class attributes is yuta

//getBahin is the method
//class members are yuta and getBahin basta naay public nga keyword
    public double getBahin(int numOfChildren) { //local variables are inside the parameter "int numOfChildren" and the double bahin
        double bahin = yuta / numOfChildren;    
        return bahin;
    }

//    public double getBahin(float numOfChildren, float bahinLola) {
//        double bahin = (yuta - bahinLola) / numOfChildren;
//        return bahin;
//    }
//}
