package InheritanceDodong;

public class Papa extends Lolo {
    public int yuta = 20;   //kung walay value si papa, adtu moinhirit sa ka lolo si papa then si dodog muinhirit sa ka papa which is from lolo
    
      public double getBahin(int numOfChildren) { //so this method is from Lolo, meaning, two methods iya giinherit. But pwede siya ma change, like:   
        double bahin = (yuta - (yuta * .1)) / numOfChildren;    //changed the method. So here, mukuha sa si papa ug 10%
        return bahin;
    }
    //the method getBahin is the method that overrides the method that was declared on the superclass Lolo
}

//Method Overriding = ang pagcopy sa sa method from lolo to papa is overriding. Meaning, same method and parameters but gichange ang implementation sa sulod. Just like sa babaw, gikwaan niyag 10% usa gidistribute 
//define your own method =    meaning, if we run the code, dili na kay lolo nga mehod kundi ka papa na kay siya may pinakaclose sa kay dodong