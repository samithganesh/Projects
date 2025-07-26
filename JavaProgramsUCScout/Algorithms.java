public class Algorithms
{
    public static void main(String[] args)
    {
        // Swap Method
        define swap (x, y)
        temp = x
        x = y
        y = temp

        // Sequential Search Algorithm
        int sequentalSearch (int x)
        for i = 1; i <= list_size; i++
          if list[i] == x
            return i
        return null
        // A sequential search starts at the beginning of a list. For each index of the list, the algorithm checks if the item of the current index is equal to the item being searched for. If the item is found, then the location it was found at is returned.
        // if the entire list is searched but the search did not find the item, then some form of failed message is returned.



        // Find-Highest Algorithm
        findHighest (input list)
            make empty variables "highest" and "index"
            loop through the list
                if list[i] > highest
                    highest = list[i]
                    index = i
            end of loop
            print highest and index

        // This algorithm starts by creating variables to store the values of the current highest value and the value's location. It then iterates through the list. The most simple way to do this is through a for loop.
        // At each index, the current highest value is compared to the value at the index. If the index's value is greater, the value of the highest is reassigned. The value of index is also changed to keep track where the highest value is. 
        // Once the entire list has been searched, the highest value and its index have been found, which we'll then print it




    }
}