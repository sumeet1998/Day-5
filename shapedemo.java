import java.util.Scanner;
//Abstraction

abstract class shape{
    float ar;
    abstract void area();  // abstract method don't have body

    void show(){
        System.out.println("Area = "+ar);
    }
}

class rectangle extends shape{
    void area(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length");
        float len=sc.nextFloat();

        System.out.println("Enter breadth");
        float br=sc.nextFloat();

        ar=len*br;
    }
}

class shapedemo{
    public static void main(String args[]){
        shape r=new rectangle();
        r.area();
        r.show();
    }
}