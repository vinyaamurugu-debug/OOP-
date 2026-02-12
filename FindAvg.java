public class FindAvg{
	public int findAvg(int numA, int numB, int numC)
{
	return(numA+numB+numC)/3;
}
	public static void main(String args[])
{
FindAvg obj= new FindAvg();
int avg = obj.findAvg(50,60,70);

System.out.println("Average is:"+ avg);
}
}
 
