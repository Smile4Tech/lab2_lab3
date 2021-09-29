
package lab2_3;

import java.util.Scanner;

public class TestStudent {
    public static void main(String[] args) {
        PostStudent[]pstd=new PostStudent[1];        
        Student[]std=new Student[1];

        
        Scanner input=new Scanner(System.in);
        int ch;
        for(int i=0;i<5;i++)
        {
            System.out.println("1- post student \n2- undergraduate student. \n\n1choose 1 or 2");
            ch=input.nextInt();
            
            if(ch==1)
            {
                pstd[i]=new PostStudent();
                
                System.out.println("Enter name of student :");
                String s=input.nextLine();
                pstd[i].setName(s);
                
                input.next();
                
                System.out.println("Enter ID of student :");
                int id=input.nextInt();
                pstd[i].setID(id);
                
                int course_id;
                String grade;
                for(int a=0;a<3;a++)
                {
                    System.out.println("Enter course_id ");
                    course_id=input.nextInt();
                    pstd[i].AddCourse(course_id);
                    
                    
                    System.out.println("Enter grade of student :");
                    grade=input.next();
                    pstd[i].AddGrade(course_id, grade);
   
                }
                
            }
            else if(ch==2)
            {
                std[i]=new Student();
                
                System.out.println("Enter name of student :");
                String s=input.nextLine();
                std[i].setName(s);
                
                input.next();

                                
                System.out.println("Enter ID of student :");
                int id=input.nextInt();
                std[i].setID(id);
                
                int course_id;
                int mark;
                for(int a=0;a<3;a++)
                {
                    System.out.println("Enter course_id ");
                    course_id=input.nextInt();
                    std[i].AddCourse(course_id);
                    
                    input.next();
                    
                    System.out.println("Enter mark of student :");
                    mark=input.nextInt();
                    std[i].AddMark(course_id,mark);
   
                }
            }
            else
            {
                System.out.println("Error input");
            }
            
        }
        
        Person[] per=new Person[10];
        for(int i=10;i<10;i+=2)
        {
            per[i]=pstd[i];
            per[++i]=std[i];
        }
        
        for(int i=0;i<2;i++)
        {
            System.out.println(per[i]);
        }
        System.out.println("jhhhhhhh");
        
    }
}
