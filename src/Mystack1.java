import java.util.*;
class Emp{
    public int empid;
    public String name;

    public Emp(int empid,String name)
    {
        this.empid=empid;
        this.name=name;
    }

    public String toString()
    {
        return this.empid +  " " + this.name;
    }
}
public class Mystack1 {
    public int top;
    public int maxsize;
    public Emp[] stack;

    public Mystack1(int size)
    {
        maxsize=size;
        top=-1;
        stack=new Emp[maxsize];
    }


    public boolean isfull()
    {
        if(top==maxsize-1)
            return true;
        else
            return false;

    }
    public boolean isempty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }


    public void push(Emp val)
    {
        if(!isfull())
        {
            top=top+1;
            stack[top]=val;
        }
        else
            System.out.println("stack is full");
    }
    public void pop()
    {
        if(!isempty())
        {
            System.out.println(stack[top--]);
        }
        else
            System.out.println("stack is empty");
    }
   void display() {
       if (isempty())
           System.out.println("stack is empty");
       else
           for (Emp emp : stack) {
               if (emp != null)
                   System.out.println(emp);
           }
   }

    public static void main(String[] args) {
      Mystack1 obj=new Mystack1(5);
        Emp e1=new Emp(101,"aaa");
        Emp e2=new Emp(102,"ajp");
        Emp e3=new Emp(103,"ajh");
        Emp e4=new Emp(104,"abk");
        Emp e5=new Emp(105,"bgf");
        System.out.println(obj.isfull());
        System.out.println(obj.isempty());
        obj.push(e1);
        obj.push(e2) ;
        obj.push(e3);
        obj.push(e4);
        obj.push(e5);
        obj.pop();
        obj.pop();
    }
           }
