public class Person {
    String firstName;
    String lastName;
    int age;
    double salary;
    String phone;
    boolean isMarried;

    public Person(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }
    public Person(String firstName,String lastName,int age, double salary, String phone, boolean isMarried){
        this(firstName,lastName,age);
        this.salary=salary;
        this.phone=phone;
        this.isMarried=isMarried;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
        if(age<0){
            System.out.println("Yaş 0 dan küçük olamaz");
            return false;
        }
        return age>12 && age<20;
    }
}
