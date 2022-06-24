
package Constructor;


public class Chicken {
    
     public Chicken(){
        System.out.println("Chixxx");
    }
     
    static{
        System.out.println("The static block can be executed once when the class is  loaded");
    }
     
     public Chicken(String[] color){
         System.out.println(color);
     }
     
    public void sound(){
        System.out.println("Cock-a--dole");
    }
    
    public void eat(){
        System.out.println("tuka");
    }
    
    public void walk(){
        System.out.println("kembot twerk");
    }
}
