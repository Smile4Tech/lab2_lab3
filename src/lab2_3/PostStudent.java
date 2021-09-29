
package lab2_3;

public class PostStudent extends Person{
    private int []cources=new int[3];
    private String []grade=new String[3];
    
    
    public PostStudent(String n,long ID)
    {
        super(n,ID);
    }
    public PostStudent()
    {
        
    }
    public void AddCourse(int c_id)
    {
        for(int i=0;i<cources.length;i++)
        {
            if(cources[i]==0)
            {
                cources[i]=c_id;
            }
        }
        
    }
    public void AddGrade(int c,String g)
    {
        for(int i=0;i<cources.length;i++)
        {
            if(cources[i]==c)
            {
                grade[i]=g;
            }
        }
    }
    
    public String toString()
    {
       String grades="";
       for(int i=0;i<cources.length;i++)
       {
           grades+="/n cources "+cources[i]+" grades = "+grade[i];
       }
        return super.toString()+grades;
    }
    
    
}
