package Oops;

public final class FinalClassExample {

    private int age;

    public FinalClassExample(int age)
    {
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {

        FinalClassExample fc=new FinalClassExample(10);
        System.out.println(fc.getAge());


    }
}
