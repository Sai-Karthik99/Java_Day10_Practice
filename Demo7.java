
class Demo7 extends Thread 
{
	Demo7(String s)
	{
		super(s);
	}

}
class DriveThread
{
	public static void main(String[] args) {
		Demo7 d=new Demo7("Thread1");
		System.out.println(d.getName());
		System.out.println(d.getId());
		System.out.println(d.getPriority());
		
	}

}
