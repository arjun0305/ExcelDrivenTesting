package inheritance;

public class ChildClassDemo extends ParentClassDemo{

	public void engine()
	{
		System.out.println("Engine upgraded");
	}
	
	public void colour()
	{
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClassDemo cd = new ChildClassDemo();
		cd.colour();
		cd.brakes();
		cd.audioSystem();
		cd.gear();
		cd.headlights();
		
	}

}
