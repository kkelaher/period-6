
/**
 * Write a description of class SkillsReview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SkillsReview
{
    public static void main(String [] args)
    {
        int [] nums1 = {17,22,43, -10, 41, -3};
        int [] nums2 = {3, 8, 19, 45, 73, 74};
        System.out.println(findMaxValue(nums1));
        
        System.out.println(inOrder(nums1));
        System.out.println(inOrder(nums2));
    }
    
    public static int findMaxValue(int [] arr)
    {
        int val = arr[0];
        for (int i = 1; i < arr.length; i ++)
        {
            if (arr[i] > val)
            {
                val = arr[i];
            }
        }
        return val;
    }
    
    public static boolean inOrder(int [] arr)
    {
        boolean inOrder = true;
        for (int i = 1; i < arr.length; i ++)
        {
            if (arr[i - 1] > arr[i])
            {
                inOrder = false;
            }
        }
        return inOrder;
    }
}
