package assignments;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    int id,age,yearOfEnroll;
    String name,gender,engDepartment;
    double perTillDate;
    public Student(int id, String name, int age,String gender, String engDepartment,int yearOfEnroll,  double perTillDate) {
        this.id = id;
        this.age = age;
        this.yearOfEnroll = yearOfEnroll;
        this.name = name;
        this.gender = gender;
        this.engDepartment = engDepartment;
        this.perTillDate = perTillDate;
    }
    public String toString(){
        return id+" : "+name;
    }

}

public class Assignment12 {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        studentList.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        studentList.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        studentList.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        studentList.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        studentList.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        studentList.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        studentList.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        studentList.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        studentList.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        studentList.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        studentList.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        studentList.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        studentList.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        studentList.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        studentList.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        studentList.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));


        //1. Print the name of all departments in the college?
        Set<String> deptNames=studentList.stream().map(i->i.engDepartment).collect(Collectors.toSet());
        System.out.println(deptNames);          //deptNames.stream().forEach(System.out::print);


        //2.Get the names of all students who have enrolled after 2018?
        List<String> namesStudentsAfter2018=studentList.stream().filter(s->s.yearOfEnroll>2018).map(s->s.name).collect(Collectors.toList());
        System.out.println(namesStudentsAfter2018);     //namesStudentsAfter2018.stream().forEach(System.out::println);


        //3. Get the details of all male student in the computer sci department?
        List<Student> maleStudentsComputerSci=studentList.stream().filter(s->s.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(i->i.gender)).get("Male");
        System.out.println(maleStudentsComputerSci);   //maleStudentsComputerSci.stream().forEach(System.out::println);


        //4. How many male and female student are there ? (HINT:use Collectors.groupingBy() for grouping based on gender)
        int maleCount=studentList.stream().collect(Collectors.groupingBy(s->s.gender)).get("Male").size();
        System.out.println("Male Count :: "+maleCount);
        int femaleCount=studentList.stream().collect(Collectors.groupingBy(s->s.gender)).get("Female").size();
        System.out.println("Female Count :: "+femaleCount);


        //5.What is the average age of male and female students?
        int maleAgeSum= studentList.stream().filter(i->i.gender.equals("Male")).mapToInt(i->i.age).sum();
        int femaleAgeSum=studentList.stream().filter(i->i.gender.equals("Female")).mapToInt(i->i.age).sum();
        float avgAgeMale=(float) maleAgeSum/maleCount;
        float avgAgeFemale=(float) femaleAgeSum/femaleCount;
        double roundOffMale = Math.round(avgAgeMale* 100.0) / 100.0;
        double roundOffFemale = Math.round(avgAgeFemale* 100.0) / 100.0;
        System.out.println("Male Avg Age :: "+roundOffMale);
        System.out.println("Female Avg Age :: "+roundOffFemale);


        //6.Get the details of highest student having the highest percentage ?
        Student highPerStudent=studentList.stream().max((i1,i2)->(i1.perTillDate<i2.perTillDate)?-1:(i1.perTillDate>i2.perTillDate)?1:0).get();
        System.out.println("Student With Highest Percentage:: "+highPerStudent);


        //7.Count the number of students in each department? (Hint :use Collectors.groupingBy())
        Map<Object, Long> deptCount=studentList.stream().collect(Collectors.groupingBy(s->s.engDepartment,Collectors.counting()));
        System.out.println(deptCount);


        //8. What is the average percentage achieved in each department?
        Map<Object, List<Student>> deptDetails=studentList.stream().collect(Collectors.groupingBy(s->s.engDepartment));
        for(Object deptName:deptDetails.keySet()){
            double deptPerSum=deptDetails.get(deptName).stream().mapToDouble(i->i.perTillDate).sum();
            double avgPer=deptPerSum/deptDetails.get(deptName).size();
            double roundOffPer = Math.round(avgAgeMale* 100.0) / 100.0;
            System.out.print(deptName+" : "+roundOffPer+" | ");
        }
        System.out.println();


        //9. Get the details of youngest male student in the Electronic department?(Hint :Use Collectors.minBy)
        Student youngElectronicStudent=studentList.stream().filter(s->s.engDepartment.equals("Electronic"))
                .collect(Collectors.minBy((i1,i2)->(i1.age<i2.age)?-1:(i1.age>i2.age)?1:0)).get();
        System.out.println("Young Electronic Student :: "+youngElectronicStudent);


        //10.How many male and female students are there in the computer science department?
        int computerSciMaleStudents=studentList.stream().filter(s->s.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(i->i.gender)).get("Male").size();
        int computerSciFemaleStudents=studentList.stream().filter(s->s.engDepartment.equals("Computer Science")).collect(Collectors.groupingBy(i->i.gender)).get("Female").size();
        System.out.println("Male Count in CSE :: "+computerSciMaleStudents);
        System.out.println("Female Count in CSE :: "+computerSciFemaleStudents);

    }
}
