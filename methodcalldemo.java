class methodcalldemo{
    static void m1(){
        System.out.println("m1");
    }

    void m2(){
        System.out.println("m2");
    }

    public static void main(String args[]){
        m1();
        new methodcalldemo().m2();
    }
}