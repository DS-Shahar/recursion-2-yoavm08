package recursya;
import java.util.Scanner;
public class HW311024 {
	public static Scanner reader = new Scanner (System.in);

	public static int q14(int[] a, int i) 
	{
	    if(i < 0)
	    {
	    	return 0;
	    }
	    return a[i] + q14(a, i-1);
	}
	
	
	public static int q15(int[] a, int i)
	{
        if(i < 0)
        {
        	return 0;
		}
        if(a[i] >= 0)
        {
        	return 1 + q15(a, i-1);
        }
        return q15(a, i-1);
    }
	
	
	public static int q16(int[] a, int n, int i) 
	{
        if(i < 0)
        {
        	return -1;
        }
        if(a[i] == n)
        {
        	return i;
        }
        return q16(a, n, i-1);
    }
	
	
	public static boolean q17(int[] a, int i) 
	{
        if(i == 0)
        {
        	return true;
        }
        if(a[i] > a[i-1])
        {
        	return q17(a, i-1);
        }
        return false;
    }
	
	
	static boolean q18A(int n, int m)
	{
		if (n<2)
			return false;
		
		if(m>=n)
			return true;
			
		if(n%m==0)
			return false;
		
		else 
			return q18A(n, m+1); 
	
	}
	public static boolean q18B(int[] a, int index) 
	{
        if (index < 0) 
            return true;
            
        if(q18A(a[index],2)) 
            return false;
        
        return q18B(a, index - 1);
    }
	
	
	public static int q19(int[][] matrix, int num, int row) 
	{
        if(row < 0)
        {
        	return 0;
        }
        boolean flag = false;
        for (int i = 0; i < matrix[row].length; i++) 
        {
            if (matrix[row][i] == num) 
            {
                flag = true;
            }
        }
        int count = 0;
        if (flag == true)
        {
            count = 1;
        }
        return count + q19(matrix, num, row - 1);
    }
	
	

		public static boolean q20(int[]arr,int start, int end)
		{
			if(start>=end)
			{
				return true;
			}
			if (arr[start] != arr[end]) 
			{
	            return false;
	        }
			return q20(arr, start+1, end-1);
		}
	
}
