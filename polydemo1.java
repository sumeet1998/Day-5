class foo{
	static void m1()
	{
		System.out.println("first m1");
	}
	void m1(int i)
	{
		System.out.println("Second m1");
	}
}

class bar extends foo{
	static void m1(){
		System.out.println("Bar m1");
	}
}

class polydemo1{
	public static void main(String args[]){
		foo f1=new bar();
		f1.m1();
		/*foo f2=new foo();
		f2.m1(10);*/
		
		/*foo.m1();
		bar.m1();*/
		
	}
}

