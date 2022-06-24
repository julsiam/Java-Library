
package InheritanceDodong;


public class Lolo { 

    public int yuta = 10; //the class attributes is yuta

//getBahin is the method
//class members are yuta and getBahin basta naay public nga keyword
    public double getBahin(int numOfChildren) { //local variables are inside the parameter "int numOfChildren" and the double bahin
        int yuta = 100; // declaring the local varibale but it cannot be accesed inn the main method as its local
        double bahin = this.yuta / numOfChildren;    //this signifies that you use the class and not the local variable
        return bahin;
    }

    public double getBahin(float numOfChildren, float bahinLola) {
        double bahin = (yuta - bahinLola) / numOfChildren;
        return bahin;
    }
}

//we have the two methods above the getBahin but the only difference are their parameters. 
// Method Overloading = same name with another method as long as different parameters/ Multiple methods of the same name/to avoid making too many methods with same functionality
 