public class Main 
{
    public static void main(String args[]) 
    {
        Person pl = new Person();
        pl.setName("Aarav");
        pl.setAge(13);
        System.out.println(pl.getName());
        System.out.println(pl.getAge());

        Person pl2 = new Person("Sharmi", 41);
        System.out.println(pl2.getName());
        System.out.println(pl2.getAge());

        Person pl3 = pl2;
        pl3.setName("OOOOOOOO");
        System.out.println(pl3.getName());
        System.out.println(pl2.getName());

        System.out.println(pl);
        System.out.println(pl2);
        System.out.println(pl3);
    }
}

class Person {
    private String name = "";
    private int age = 0;

    Person(){
        name = "Samith";
    }

    Person(String name1, int age1) {
        name = name1;
        age = age1;
    }

    Person(String name1) {
        name = name1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name1){
        name = name1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age1) {
        age = age1;
    }

    public boolean isAdult() {
        boolean adult = false;
        if (age >= 18) adult = true;
        return adult;
    }
}