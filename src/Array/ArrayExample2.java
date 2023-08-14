package Array;

public class ArrayExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] stu_height = {175,167,160,164,183,187,188,179,176,175,169,175,176,178,165};
		
		int aboveavg=0, belowavg=0;
		int sum=0;
		for (int i=0; i< stu_height.length; i++) {
			sum += stu_height[i];
		}
		
		int avg= sum/stu_height.length; 
		System.out.print("Total = " + sum);
		System.out.println("Average = " + sum/stu_height.length);
		
		for (int i=0; i < stu_height.length; i++) {
			if (stu_height[i]> avg)
				aboveavg++;
			if (stu_height[i] <avg)
				belowavg++;
		}
		System.out.println("Above average = "+ aboveavg);
		System.out.println("Below average = "+ belowavg);
		
		int max = stu_height[0];
		int min = stu_height[0];
		
		for(int i=1; i<stu_height.length; i++) {
			if (stu_height[i]> max)
				max=stu_height[i];
			else if (stu_height[i] < min)
				min=stu_height[i];
			
		}
		System.out.println("The Shortest Height = "+ min);
		System.out.println("The Hightest Height = "+ max);

	}

}
