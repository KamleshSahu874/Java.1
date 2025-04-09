public class Demo {
    public static char ch='Z';
    int a,b;
    public Demo(int k,int m)
    {
        a=k;
        b=m;
    }

    public void show()
    {
        int A=500;
        System.out.println(a+"--"+b);
        System.out.println(A);
    }
    public static void main(String args[])
    {
        Demo d=new Demo(10,20);
        d.show();
        System.out.println(Demo.ch);

    }
}
