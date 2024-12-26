//command line arguments apan execute krtanna deto eg : java CommandLineArg 11

class CommandLineArg 
{
    public static void main(String Arg[])
    {
        System.out.println("Number of command line arguments are : "+Arg.length);

        for(int i = 0; i < Arg.length; i++)
        {
            System.out.println(Arg[i]);
        }

    }
}

//javac CommandLineArg.java
//java CommandLineArg.java Hello 21 Marvellous
