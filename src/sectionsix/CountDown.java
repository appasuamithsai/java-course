package sectionsix;

public class CountDown {
    public static void countUpTo(int start,int end){
        if(start>=end)return;
        System.out.println(start);
        countUpTo(start+1,end);
    }

    public static void main(String[] args) {
        countUpTo(0,5);
    }
}
