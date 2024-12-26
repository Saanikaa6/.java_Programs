class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running\t" + Thread.currentThread().getName());
        for (int i = 0; i <= 1000; i++) 
        {
            System.out.println(Thread.currentThread().getName() + "with ID : "+ i);
        }
    }
}

class ThreadDemo5   //yaat donhi thread(LB ani PPA) parallely work hotayt
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main thread");

        Demo dobj1 = new Demo();
        Thread tobj1= new Thread(dobj1);
        tobj1.setName("PPA"); 
        
        Demo dobj2 = new Demo();
        Thread tobj2 = new Thread(dobj2);
        tobj2.setName("LB");
        tobj1.start();
        tobj2.start();
    }
} 

