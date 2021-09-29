
package lab2_3;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
       
        Person[] person = new Person[5];
        
        Scanner input=new Scanner(System.in);
        int ch;
        
        for(int i=0;i<person.length;i++)
        {
            System.out.println("1- post student \n2- undergraduate student. \n\nchoose 1 or 2");
            ch=input.nextInt();
            
            if(ch==1)
            {
                PostStudent pstd=new PostStudent();
                
                System.out.println("Enter name of student :");
                String s=input.next();
                pstd.setName(s);
                
              // input.next();
                
                System.out.println("Enter ID of student :");
                int id=input.nextInt();
                pstd.setID(id);
                
                int course_id;
                String grade;
                for(int a=0;a<3;a++)
                {
                    System.out.println("Enter course_id ");
                    course_id=input.nextInt();
                    pstd.AddCourse(course_id);
                    
                    
                    System.out.println("Enter grade of student :");
                    grade=input.next();
                    pstd.AddGrade(course_id, grade);
   
                }
                
                person[i]=new PostStudent();
                person[i]=pstd;
            }
            else if(ch==2)
            {
                 Student std=new Student();
                
                
                System.out.println("Enter name of student :");
                String name=input.next();
                std.setName(name);
                
                input.next();

                                
                System.out.println("Enter ID of student :");
                int id=input.nextInt();
                std.setID(id);
                
                int course_id;
                int mark;
                for(int a=0;a<3;a++)
                {
                    System.out.println("Enter course_id ");
                    course_id=input.nextInt();
                    std.AddCourse(course_id);
                    
                    //input.next();
                    
                    System.out.println("Enter mark of student :");
                    mark=input.nextInt();
                    std.AddMark(course_id,mark);
   
                }
                
                person[i]=new Student();
                person[i]=std;
            }
            else
            {
                System.out.println("Error input");
            }
            
        }
        
        
        
        
        for(int i=0;i<person.length;i++)
        {
            System.out.println(person[i]);
        }
       
        
    }
}
