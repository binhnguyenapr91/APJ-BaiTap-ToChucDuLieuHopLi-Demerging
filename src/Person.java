public class Person {
    private String name;
    private String gender;
    private String dob;

    public Person(String name, String gender, String dob){
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }

    public void display() {
         System.out.printf("%-20s%-7s%-5s\n",this.name,this.gender,this.dob);
    }
}
