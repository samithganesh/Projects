// Samith Ganesh
public class Person 
{
    private String name;
    private int age;
    private int height;
    
    // No-parameter Constructor
    public Person()
    {
        name = "Unknown";
        age = 0;
        height = 0;
    }

    // Parameterized Constructor
    public Person(String name, int age, int height)
    {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Getter Methods
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public int getHeight()
    {
        return height;
    }

    // Setter Methods
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public String toString()
    {
        return "Person Name: " + getName() + " | Person Age: " + getAge() + " | Person Height: " + getHeight() + " inches";
    }

    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person("Samith", 16, 66);

        person1.setName("Jake");
        person1.setAge(23);
        person1.setHeight(70);
        person2.setName("Ganesh");

        System.out.println(person1);
        System.out.println(person2);
        
        System.out.println(13 / 4);
    }
}
