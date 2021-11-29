package sectionfive;

public class StringBuilderFun {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Mr.Bob");
        name.replace(0,2,"Dr");
        System.out.println(name.toString());
    }
}
