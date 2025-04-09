public class Class_Demo {
    public Class_Demo()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        Class_Demo cd=new Class_Demo();
        cd.show();
        cd.add(10,20);

    }
    public void show()
    {
        System.out.println("show function call");
    }
    public void add(int a,int b)
    {
        System.out.println(a+b);
    }
}
