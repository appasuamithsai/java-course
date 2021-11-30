package assignments.assignment8;

public class ExceptionClass {
    public void m1(int x) throws ExceptionOne,ExceptionTwo,ExceptionThree {
        if(x==1) throw new ExceptionOne("Exceptin One");
        else if(x==2) throw new ExceptionTwo("Exceptin Two");
        else throw new ExceptionThree("Exceptin Three");
    }

}
