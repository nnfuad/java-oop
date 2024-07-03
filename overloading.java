import java.util.*;

public class overloading {
    public static class Students{
        private String name;// purest form of encapsulation
        private String membership;
        
        void setName(String a){
            this.name = a;
        }
        
        void setMembership(String a){
            this.membership = a;
        }

        //here here....An OVERLOADING...yay...
        void setMembership(Membership membership){//Membership in argument is an enumeration,we will create it later in code...
            this.membership = membership.name();
        }
        public enum Membership{
            Bronze, Silver, Gold;
        }

        // void setName(){
        //     //this is method overloading, because of different argument passing...
        // }
        String getName(){
            return name;
        }

        String getMembership(){
            return membership;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students s1 = new Students();//Student() is a default constructor , methods with no return types and same Class name
        System.out.println("Student's name and membership");
        s1.setName(sc.nextLine());
        s1.setMembership(Students.Membership.Gold);//Usage of enum too... :)
        System.out.println(s1.getName()+" "+s1.getMembership());
        sc.close();
    }
}