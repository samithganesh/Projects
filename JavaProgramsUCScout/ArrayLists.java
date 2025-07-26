import java.util.ArrayList;
// When you use an ArrayList in a program, you have to use an import statement because the ArrayList class is not part of the java.lang package - Line 1

public class ArrayLists 
{
    // Array Lists are different from regular arrays because they allow us to add and remove objects from the array and the size changes with the number of objects

    // You should use an ArrayList instead of a 1D or 2D array when you are not sure exactly how many objects or how much data you need to store
    
    // ArrayList is an object of the ArrayList class

    // Syntax to declare an ArrayList object:
    ArrayList<ClassName> nameOfArrayList = new ArrayList<ClassName>();
    Example:
    ArrayList<Cat> myCats = new ArrayList<Cat>();
    // myCats is a reference variable that refers to the ArrayList object. It holds the address of where the ArrayList object is located in memory. Each time we use myCats, the computer finds the object that is located at this address

    // Alternate Syntax:
    List<ClassName> nameOfArrayList = new ArrayList<ClassName>();

    // An ArrayList always starts out as empty but it is resizeable. It can be as large or small as you want it

    // 1D and 2D arrays can store primitive variables but ARRAYS CAN ONLY STORE OBJECTS

    // If you want to store a primitive variable such as an int or a double in a ArrayList, you have to use the integer or double wrapper class
    ArrayList<Integer> myIntegers = new ArrayList<Integer>(); 
    int numCats = 10;
    myInteger.add(numCats); // The 10 is converted from an int to an Integer object


    // ArrayList Methods

    add();
    // There are two add methods
    1. add(E object); // Appends an object to end of the list. Return true. The size of the ArrayList is automatically updated to show than an object has been added
    // Example: 
    ArrayList<Cat> myCats = new ArrayList<Cat>();
    myCats.add(new Cat("Persian"));
    myCast.add(new Cat(""));
    // We add two Cat objects to the array list. The first object has a breed of Persian. The second one doesn't have a value for breed so the breed variable gets a default value of empty

    2. add(int index, E object); // Inserts an object into an index position. If there is another object at this index position, it would be shifted along with any objects after it, over one index. This add method DOES NOT RETURN a value


    size();
    // The size method returns the number of objects in an ArrayList
    int numberofCats = myCats.size();

    // Do not get confused between the length field, the size() method, and the length() method. 
    // The length field finds the number of slots available in an array
    // The size() method finds the number of objects in an ArrayList
    // The length() method finds the number of characters in a String


    remove();
    Cat refLocCat = myCats.remove(0); // This removes the object at index 0 and now, refLocCat points to that object


    get();
    Cat someCat = myCats.get(3); // This gets the object at index 3 and now, the object someCat equals that object


    set(); // This method replaces the object in the ArrayList at the specific index. It returns a reference to the object that was replaced
    Cat c = myCats.set(1, new Cat("Siamese")); // This replaces the object at index 1. It returns a reference to the object that was previously there




    // Traversing through a list using a for loop

    for (int i = 0; i <myCats.size(); i++)
    {
        System.out.println(myCats.getBreed(i)); // This prints all of the breeds in the ArrayList
    }

    
    // Enhanced For Loop (For each loop)
    for(Cat cat : myCats) // Do not have to use index
    {
        System.out.println(cat.getBreed()); // The output is the same as the for loop
    }


    // You can also use the reference variable of the ArrayList to print out all of the objects in the ArrayList
    System.out.println(myCats);
    // This will print: ["Blue Russian", "Siamese", "Calico", "Hairless", "Tabby"]

    


}
