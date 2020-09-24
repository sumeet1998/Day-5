class foo{
    static void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
    }
}

class polydemo2{
    public static void main(String args[]){
        //m1 is static so we can directly access m1

        foo.m1();   //function call

        //m2 is non static while main func is static so we have to create object

        foo f1=new foo();
        f1.m2();    //function with help of object

    }
}