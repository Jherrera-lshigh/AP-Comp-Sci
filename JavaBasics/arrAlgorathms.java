import java.util.Arrays;

public class arrAlgorathms{

    int[] list = {1,5,6,7,5,3,10,3};
    
    
    public int counting()
    {
        //sets count value to 0;
        int count=0;
        
        //for each loop that adds to count for every element in the array
        for(int num: list)
        {
            count ++;
        }
        //returns the count value after the for each loop
        return count;
    }
    public int maxNumber()
    {
        //sets the current number and current max to 0
        int currentNum = 0;
        int currentMax = 0;

        //for each loop that runs through each element in array
        for(int num: list)
        {
            //asigns num to current element
            currentNum = num;

            //checks if current max is still max
            if(currentNum > currentMax){
                currentMax = currentNum;
            }
        }
        return currentMax;

    }

    public String swap(int a, int b)
    {
        //clone of orinigal list
        int[] copy = list.clone();
        //swaps the elemets in the variables 
        int temp = list[a];
        list[a]= list[b];
        list[b]= temp;

        //prints out the Original list and the Swapped List
        return "Original list: " + Arrays.toString(copy) +" " +"Changed list: " + Arrays.toString(list);

    }
}
