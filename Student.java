import java.util.*;
class Student{
    private String name;
    private double gpa;
 
    public Student(String name, double gpa){
       this.name = name;
       this.gpa = gpa;
    }
 
    public String getName(){
       return name;
    }
    public double getgpa(){
       return gpa;
    }
 
 
 
    public static void main(String[] args) {
       List<Student>  students = new ArrayList<>();
       students.add(new Student("Alice", 3.5));
       students.add(new Student("Bob", 3.7));
       students.add(new Student("Charlie", 3.5));
       students.add(new Student("Akshit", 3.9));

      Comparator<Student> comparator = Comparator.comparing(Student:: getgpa).reversed().thenComparing(Student::getName);
      students.sort(comparator);
      //  students.sort((a,b) -> {
      //    if(b.getgpa() - a.getgpa() >0) {
      //       return 1;
      //    }else if(b.getgpa() - a.getgpa()<0){
      //       return -1;
      //    }
         // return a.getName().compareTo(b.getName());
      //  });
       for(Student s : students){
           System.out.println(s.getName() +": "+s.getgpa());
       }
    }
 
 
 
 }
