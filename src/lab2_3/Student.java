
package lab2_3;

public class Student extends Person{
    private int []cources=new int[5];    
    private double []marks=new double[5];
    private int numberOfCources=0;
    public int getNumberOfCources()
    {
        return numberOfCources;
    }
    public void setNumberOfCources(int n)
    {
        numberOfCources=n;
    }
    public Student(String n,long ID)
    {
        super(n,ID);
    }
    public Student()
    {
        
    }
    
    public void AddCourse(int c_id)
    {
        cources[numberOfCources++]=c_id;
        //numberOfCources++;
    }
    public void AddMark(int c,int m)
    {
        for(int i=0;i<cources.length;i++)
        {
            if(cources[i]==c)
            {
                marks[i]=m;
            }
        }
    }
    
    public String toString()
    {
        String mark="";
       for(int i=0;i<numberOfCources;i++)
       {
           mark+="\n cources "+cources[i]+" marks = "+marks[i];
       }
        return super.toString()+mark;
    }
}
