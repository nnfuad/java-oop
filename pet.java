import java.util.*;

public class pet{
    public String petType;
    private String name;
    private int age;
    private String sound;
    
    public pet(){};
    public pet(String name , int age){
        setname(name);
        setage(age);
    }
    //seters
    public void setname(String name){
        this.name = name;
    }
    public void setage(int age){
        this.age = age;
    }
    public void setsound(String sound){
        this.sound = sound;
    }
    public void setType(String petType){
        this.petType=petType;
    }

    //getter
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    public void sound(){
        System.out.println(getname() + " goes "+sound);
    }
    //
    

    public static void main(String[] args){
        cat c1 = new cat("Gattoo",5);
        c1.sound();

        dog d1 = new dog();//()"Doggo",4);
        d1.sound();
    }


}

class cat extends pet{
    
    public cat(){
        setType("cat"); 
        setsound("Mewwwwwwwww...");
    };
    public cat(String name, int age){
        setname(name);
        setage(age);
        setType("cat"); 
        setsound("Mewwwwwwwww...");
    }
    
    
}
class dog extends pet{
    
    public dog(){
        setType("dog"); 
        setsound("Bark...Bark....");
    };
    public dog(String name, int age){
        setname(name);
        setage(age);
        setType("dog"); 
        setsound("Bark...Bark....");
    }
    
}
class bunny extends pet{
    
    public bunny(){
        setType("bunny");
        setsound("hishhhh.....");
    };
    public bunny(String name, int age){
        setname(name);
        setage(age);
        setType("bunny");
        setsound("hishhhh.....");
        
    }
    
}
