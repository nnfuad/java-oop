import java.util.*;

public class settergetter{

    public static class Student{

        private String name;// purest form of encapsulation
        private int roll;
        
        void setName(String a){
            this.name = a;
        }
        void setRoll(int a ){
            this.roll = a;
        }
        String getName(){
            return name;
        }
        int getRoll(){
            return roll;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter Student's name");
        s1.setName(sc.nextLine());
        System.out.println("Enter Student's roll");
        s1.setRoll(sc.nextInt());
        System.out.println("Student's name: "+s1.getName()+"\nStudent's Roll: "+s1.getRoll());
        sc.close();
    }
}
 