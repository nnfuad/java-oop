import java.util.*;

public class constructor2{

    public static class Student{

        private String name;// purest form of encapsulation
        private int roll;

        public Student(){}

        public Student(String a, int b ){
            setName(a);
            setRoll(b);
        }
        
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
        
        //Student s1 = new Student(); //because we have a custom constructor, to have it we need to build or write the code of custom constructor ourselves
        //now it will, cuz we added publlic student(){}
        Student s1 = new Student();
        //we can also use:
        Student s2 = new Student("Nafis", 32);
        //no need to write all the codes below for s2, just s1, cuz we called it with defcons...
        System.out.println("Enter Student's name");
        s1.setName(sc.nextLine());
        System.out.println("Enter Student's roll");
        s1.setRoll(sc.nextInt());
        System.out.println("Student's name: "+s1.getName()+"\nStudent's Roll: "+s1.getRoll());
        System.out.println("Student's name: "+s2.getName()+"\nStudent's Roll: "+s2.getRoll());
        sc.close();

    }
}
 