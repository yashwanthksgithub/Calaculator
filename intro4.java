package project1;
import project1.intro2;
 
public class intro4 extends intro3{
	int y;
	public int count;
	public intro4(){
		
	}
	
	public intro4(int x,int y) {
		super(x);
		this.y=y;
	}

	public void div(int a,int b)//Overriding
	{
		System.out.println("Keep the result of Division in your mind = "+(a/b));
	}
	public synchronized void synchro()
	{
		count=count+1;
	}
}
