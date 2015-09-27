package arrays;

//majority element is the element that occurs more than n/2 times in an array
//but to achieve auxillary space of O(1) use MOORE'S VOTING ALGO


public class Main {
	
	static final int a[] = {3,3,4,5,3,6,3,4,5};
	
	 public static void main(String args[]){
		int candidate = findCandidate();
		boolean is_major = check(candidate);
		if(is_major){
			System.out.println(candidate);
		}
		else
			System.out.println("NONE");
	 }
/* Function to find the candidate for Majority */
public static int findCandidate()
{
    int maj_index = 0, count = 1;
    int i;
    for(i = 1; i < a.length; i++)
    {
        if(a[maj_index] == a[i])
            count++;
        else
            count--;
        if(count == 0)
        {
            maj_index = i;
            count = 1;
        }
    }
    return a[maj_index];
}
 
/* Function to check if the candidate occurs more than n/2 times */
public static boolean check( int cand)
{
    int i, count = 0;
    for (i = 0; i < a.length; i++)
      if(a[i] == cand)
         count++;
    if (count > a.length/2)
       return true;
    else
       return false;
}
}
