package sectionfive;

public class StringMethods1 {
    public static void main(String[] args) {
        String nameOne="amith";
        String nameTwo="Bob";
        if(nameOne.equals(nameTwo)){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }
        if(nameOne.compareTo(nameTwo)>0){
            System.out.println(nameOne+" is greater then "+nameTwo);
        }else{
            System.out.println(nameTwo+" is greater then "+nameOne);
        }
    }
}
