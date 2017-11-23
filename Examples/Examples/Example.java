public class Example 
{
	public static void main(String args[])
	{
		
			try
			{
		       int a=10;
			   int count=args.length;
			   args[6]="20";
			   
			  //System.out.println("Number of values given:"+count);
			   if(count==0)
				   throw new ArithmeticException("please check denominator.....");
			   int result=a/count;
			   System.out.println("Result :"+result);
			}
			catch(ArithmeticException ar)
			{
			   System.out.println(ar.getMessage());
				//System.out.println("Denominator is zero");
			}
			catch(ArrayIndexOutOfBoundsException ai)
			{
				System.out.println("invalid index");
			}
			//finally
			//{
				
			//}
			
			
		
	}

}
