class Demo extends Thread
{
    public void run()
    {
        System.out.println("Thread is running\t" + Thread.currentThread().getName());
    }
}

class ThreadDemo4
{
    public static void main(String Arg[])
    {
        System.out.println("Inside main thread");

        Demo dobj = new Demo();
        Thread tobj = new Thread(dobj);
        tobj.setName("PPA");
        tobj.start(); //yaat adhi apan start la call kel ani start ne run la call kel
    }
} 
