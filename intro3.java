package project1;

public class intro3 extends intro2 {
	public intro3()
	{
		
	}
	public intro3(int a){
		super(a);
	}
	public void div(int a,int b)//Overriding
	{
		
	}
	public void sub(int a,int b)
	{
		System.out.println("Keep the result of Subtraction in your mind = "+(a-b));
	}
	public void mul(int a,int b)
	{
		System.out.println("Keep the result of Multiplication in your mind = "+(a*b));
	}
}