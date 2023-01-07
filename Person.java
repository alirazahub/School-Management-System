public class Person
{
    private String Name;
    private int Age;
    private Address add;
    private String Gender;

    public Person(String name, int age, Address add, String gender)
    {
        Name = name;
        Age = age;
        this.add = add;
        Gender = gender;
    }
    public String getName(){

        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getAge() {
        return Age;
    }
    public void setAge(int age)
    {
        Age = age;
    }

    public Address getAddress(){return add;}
    public void setAdd(Address add)
    {
        this.add = add;
    }

    public String getGender(){return Gender;}
    public void setGender(String gender)
    {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", add=" + add +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}