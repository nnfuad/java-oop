public class overriding1 {

    //means changing an existing method... that can be either builtin iones or the custom ones...
    //we have done one built in one...toString() 
    //see?  nowhere near overloading...
    public static class Employee{
        private String name;
        private int age;

        public String toString(){
            return getName()+" "+Integer.toString(age);//typecasted
        }

        public void equals(Employee e){
            if(e.getName()== getName()
            && e.getAge()== getAge()){
                System.err.println("Same employee...");
            }
            else
            System.out.println("Different employee");
        }

        Employee(String name , int age){
            setName(name);
            setAge(age);
        }

        public void setName(String name){
            this.name = name;
        }
        public void setAge(int age){
            this.age = age;
        }
        
        public String getName(){
            return name;
        }
        public int getAge(){
            return age;
        }

    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Nafis",20);
        Employee e2 = new Employee("Sharif", 0);
        Employee e3 = new Employee("Nafis", 20);
        Employee e4 = e1;
        System.out.println(e1);//this actually means sout(e1.toString())...dont beleive me?...:{
        System.out.println(e1.toString());
        //we gonna override this toString() func...we will show the value rather than the address


        // even though e1 and e3 have the same value they aint same(cuz of diff address) but e4 is...
        System.out.println(e1 == e3); //false
        System.out.println(e1 == e4); //true     
        //== and .equals() does the same thing...
        //System.out.println(e1.equals(e2));// false    //but it wont work now cuz:
        //now we are gonna override the equals() method in Employee class to show more info rather than just returning boolean value
        // we also changed the return type...so just gonna call it
        //just learnt it from gpt its not actually overriding(just the equals() one why?)...
        // •	Overriding is about a subclass modifying a method from its superclass to provide a specific behavior.
        // •	Overloading is about having multiple methods with the same name but different parameters to provide different ways to perform a similar action within the same class.
        //what we did was 
        // 1.	Method Overriding:
        // •	Involves a superclass and a subclass.
        // •	Methods have the same name, parameters, and return type.
        // •	Provides specific implementation in the subclass.
        // 2.	Method Overloading:
        // •	Occurs within the same class.
        // •	Methods have the same name but different parameter lists.
        // •	Provides multiple ways to call a method based on different parameter inputs.
        //we did none -_-,cuz we changed return type...
        e1.equals(e4);
        e1.equals(e3);//its returning the same but if address were dif itd retun false
    }

}
