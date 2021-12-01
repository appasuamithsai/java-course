package streamsandlambdas.practice;
interface inter{
    public void add(int a,int b);
}
interface interf1{
    public int squareIt(int n);
}
//class Demo implements inter
//{
//
//    @Override
//    public void add(int a,int b)
//        {
//            System.out.println("Sum :: "+(a+b));
//        }
//
//}


public class LambdaPracticeTwo {
    public static void main(String[] args) {
//        Demo d=new Demo();
//        d.add();
        inter i=(a,b)-> System.out.println("Sum :: "+(a+b));
        i.add(10,20);
        interf1 interf1=n->n*n;
        System.out.println(interf1.squareIt(10)+"");
    }
}
