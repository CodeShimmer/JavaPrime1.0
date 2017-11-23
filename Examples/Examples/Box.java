public class Box 
{
	private double length,breadth,height;

	public Box()
	{
		length=breadth=height=0;
	}
	public Box(double l,double b,double h)
	{
		length=l;
		breadth=b;
		height=h;
	}
 
	public double getLength() 
	{
		return length;
	}

	public void setLength(double length) 
	{
		this.length = length;
	}

	public double getBreadth() 
	{
		return breadth;
	}

	public void setBreadth(double breadth) 
	{
		this.breadth = breadth;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(double height) 
	{
		this.height = height;
	}
	public double volume()
	{
		return length*breadth*height;
	}
	/*
    public static void main(String args[])
    {
    	Box b=new Box();
    	//Box b1=new Box(10,20,20);
    	b.setLength(10);
    	b.setBreadth(20);
    	b.setHeight(20);
    	System.out.println(b.volume());
    	//System.out.println(b1.volume());
    }
    */
}
