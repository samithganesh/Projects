public class SortingAlgorithms 
{
    public static void main(String[] args)
    {
        // TIME COMPLEXITY
        // Time complexity is measured by observing how many operations are needed to execute a given task in terms of n, where n is the number of items being manipulated.

        // When looking at how long an algorithm takes, we measure it in time n, or how long it will take relative to the number of n items in the list.

        // When calculating runtime, we are looking for what type of time it runs in (Quadratic, Linear, Logarithmic)

        // When looking at runtime, we just care about the highest multiplier of n. For example, if an algorithm that requires 7n^4 + 2n^2 + 42n + 7 cycles, it is considered a quadratic function that runs in n to the 4th time


        // SORTING ALGORITHMS

        INSERTION SORT

        Insertion Sort works by iterating through the list
        For each time in the list, it is compared to the previous item
        If the previous time is larger than the current item, then the current item and the previous items positions are swapped. The current item, now to the left of the previous item is checked against the item directly to its left to see which is larger


        SELECTION SORT

        Selection Sort takes an unsorted list and loops through each item in it. If a given item is smaller than current item, it saves that items location. When it reaches the end of the list, the smallest item is swapped with the item at the front of the list. 
        This process is then repeated on a sublist of all unsorted items.


        MERGE SORT

        Merge sort starts by splitting the list in half, to make two sublists of about half the size of the original list. It then calls merge sort again on each sublist, using recursion, until the lists are all individual items. 
        At this point, they begin to merge together into a sorted list. They do this by comparing the first item of each list being merged. The lower value is put into a new list made from the combined values of both sublists.
        After an item has been sorted into a new list, the next item of the list it came from is compared to the same element from the other list. This repeats until the sublist is sorted.



        // BINARY SEARCH
        Binary search is not a sorting algorithm like the others weve looked at so far. But it is still very important to know because it is used in many applications. Binary search is a recursively defined function that quickly looks through sorted lists for the target input.
        It begins by calculating the middle index of the given list, and checking if that index is equal to the target. If the midpoint is a greater value than what the target is, then the algorithm calls binary search again using the sublist of all items smaller than the midpoint.



    }
}
