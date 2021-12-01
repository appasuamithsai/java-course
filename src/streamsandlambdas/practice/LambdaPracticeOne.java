package streamsandlambdas.practice;
interface interf{
    public void show();
}
//class Demo implements interf
//{
//
//    @Override
//    public void show()
//        {
//            System.out.println("Hello");
//        }
//
//}


public class LambdaPracticeOne {
    public static void main(String[] args) {
//        Demo d=new Demo();
//        d.show();
        interf i=()-> System.out.println("Hello");
        i.show();
    }
}
