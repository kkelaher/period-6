
/**
 * 4/9
 *I got the first method down fine. It functioned correctly.
 *My second method functioned correctly, however rather than calling the first
 *method back to sum, this method did it itself. I did incorrectly add the 
 *new sums to the new 1D array at the end of the method. My third method 
 *called teh second method, but was unable to correctly return a true or
 *false statement as an answer based on if the rows were diverse becuase it 
 *didn't correctly determine if any 2 sums were diverse.
 *
 * @author Keegan Kelaher
 * @version (a version number or a date)
 */
public class frq
{
    public static int arraySum(int[] arr)
    {
       int sum = 0;
       for (int i = 0; i < arr.length; i ++)
       {
           sum += arr[1];
        }
       return sum;
    }
    public static int [] rowSums (int [] [] arr2D)
    {
        int [] sums = new int [ arr2D.length];
        int rowNum = 0;
        for (int [] row : arr2D)
        {
            sums [rowNum] = arraySum(row);
            rowNum ++;
        }
        return sums;
    }
    public static boolean isDiverse (int [] [] arr2D)
    {
        int [] sums = rowSums (arr2D);
        for (int i = 0; i < sums.length; i ++)
        {
            for (int j = i + 1; j < sums.length; j++)
            {
                if (sums[i] == sums[j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}
