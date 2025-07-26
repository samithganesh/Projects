public class Arrays // ARRAYS ARE OBJECTS AND HAVE THEIR OWN OBJECTS
{
    public static void main(String[] args)
    {

        String[] movieArray = {"The Little Mermaid", "Gone With the Wind", "Sleepless in Seattle"}; // Syntax to create Array

        String foxQuote = "The quick brown fox jumped over the lazy dog.";

        char[] foxQuoteArray = foxQuote.toLowerCase().toCharArray(); // Takes every character from foxQuote and makes it lowercase. It then turns it into an array

        System.out.println(foxQuote);


        // Another syntax to create an array (Three-step process)
        char[] lettersArray; // Creates an array
        lettersArray = new char[5]; // Use the "new" keyword to create a new object
        char[] lettersArray = new char[5]; // You can do all of this in one step.nAfter creating the object, we declare the length. This length will never change


        // You can also declare and create them in a single line
        char[] letterArray = new char[] {'a', 'b', 'c', 'd', 'e'};

        // How to access a specific index
        char[0] = 'a';

        // You can get the length of a list by using .length
        String[] myArray = {"John", "Frank", "Tom", "Chris", "Aaron"};
        int result = myArray.length; // Equals 5


        // Traversing through a list using for loop
        String[] movieArray = {"The Little Mermaid", "Gone With the Wind", "Sleepless in Seattle"};
        for (int i = 0; i < movieArray.length; i++)
        {
            System.out.println(movieArray[i]);
        }

        // You can also use a for each loop (also called enhanced loop) to traverse through an array
        for (String movie: movieArray)
        {
            System.out.println(movie);
        }



    }
}
