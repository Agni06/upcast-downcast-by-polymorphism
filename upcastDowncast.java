class machine
  {
public void start()
    {

      System.out.println("Machine starting");
      
    }
    
    
  }

class camera extends machine
  {
    void start()
    {
System.out.println("camera is starting");
      
      
    }
    void snap()
    {

      System.out.println("photo snaped");
    }
  }

class app
  {
public static void main(String,args[])
    {

machine m1 = new machine();
      camera c1  =  new camera();

      m1.start();
      c1.start();
      c1.snap();
//upcasting
      machine m2 = c1;
      m2.start();
   //downcasting
      camera c2 = (camera)m2;
      c2.start();
      c2.snap();
      
      
      
    }
    
  }
