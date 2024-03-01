class Student{

public int rollNo;
private int age;
private float marks;

Student(){
   rollNo=0;
   age = 21;
   marks= 0.0f;
}
Student(int rollNo, int age, float marks){
   this.rollNo= rollNo;
   this.age = age;
   this.marks= marks;

}

void studentDetails()
{

System.out.println(rollNo+" " +age+ " "+ marks+ " " );
}

}


class StudentDemo{
public static void main(String args[]){

Student obj= new Student();
Student obj1= new Student(1,22,75.0f);

//System.out.println("Student details");
//obj.studentDetails();
//obj1.studentDetails();

System.out.println("Student ID"+ obj.rollNo);


}

}
