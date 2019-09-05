package lab04;

public class lab04 {
    private String name;
    private int age;
    private char gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public lab04(String name,int age,char gender){
        this.name = name;
        this.age = age;                         /*Hello, my name is Dean. I am a man and I am 40 years old.*/
        this.gender = gender;
    }

    @Override
    public String toString(){
        String s = "";
        s = "Hello, my name is "+getName()+"." + "I am a " +getGender() +"I am " + getAge()+"years old.";
        return s;
    }
}
class Main{
    public static void main(String[]args){
        lab04 myself = new lab04("Dean",45,'m');
       // System.out.println(myself.toString());
        System.out.println(myself);
    }

}















