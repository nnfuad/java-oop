import java.util.*;

public class constructors {
    public static class Students{
        private String name;// purest form of encapsulation
        private String roll;
        
        void setName(String a){
            this.name = a;
        }
        void setRoll(String a ){
            this.roll = a;
        }
        String getName(){
            return name;
        }
        String getRoll(){
            return roll;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();//Student() is a default constructor , methods with no return types and same Class name
        System.out.println("Student's name and roll");
        s1.setName(sc.nextLine());
        s1.setRoll(sc.nextLine());
        System.out.println(s1.getName()+" "+s1.getRoll());
        sc.close();
    }
}
