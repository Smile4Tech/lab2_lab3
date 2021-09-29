
package lab2_3;

public class Person {
    private String name;
    private long ID;
    
    public Person()
    {
        
    }
            
    public Person(String name,long ID)
    {
        this.name=name;
        this.ID=ID;
    }

    
    public void setName(String n)
    {
        this.name=n;
    }
    public String getName()
    {
        return name;
    }
    public void setID(long i)
    {
        ID=i;
    }
    public long getID()
    {
        return ID;
    }
    
    public String toString()
    {
        return "Name is :"+name+" and id is :"+ID+"  ";
    }
    
}
