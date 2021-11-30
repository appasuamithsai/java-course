package assignments.assignment10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SList<Integer> list=new SList<>();
        SListIterator iterator=new SListIterator(list);
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter the Operation :: ");
            System.out.println("1.Insert \t 2.Delete \t 3.Display \t 4.Exit");
            int ch=sc.nextInt();
            switch (ch){
                case 1: System.out.println("Enter data :: ");
                    int n=sc.nextInt();
                    iterator.insert(new SList(n));
                    System.out.println("Inserted :: "+n);
                    break;
                case 2:SList temp=iterator.delete();
                    System.out.println("Deleted :: "+temp.data);
                    break;
                case 3:iterator.display();
                    break;
                case 4:
                default:System.exit(1);
            }
        }
    }
}
