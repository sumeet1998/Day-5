class methodcalldemo1{
    int i=200;
    static int j=300;
    void m3(){
        System.out.println(i);
        System.out.println(j);
        
    }
    
    public static void main(String args[]){
        //System.out.println(new methodcalldemo1().i);

        //System.out.println(i);  it will give error

        System.out.println(j);

        new methodcalldemo1().m3();

    } 
} 