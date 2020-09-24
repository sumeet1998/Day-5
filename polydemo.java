class foo{
	void m1()
	{
		System.out.println("first m1");
	}
	void m1(int i)
	{
		System.out.println("Second m1");
	}
}

class polydemo{
	public static void main(String args[]){
		foo f1=new foo();
		f1.m1();
		foo f2=new foo();
		f2.m1(10);
		
	}
}