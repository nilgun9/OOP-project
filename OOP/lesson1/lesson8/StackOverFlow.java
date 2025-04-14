public class StackOverFlow
{

    public static void recursiveMethod()
    {
        recursiveMethod();
    }

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Calling recursive method...");
            recursiveMethod();
        }
        catch (StackOverflowError e)
        {
            System.out.println("Caught a StackOverflowError!");
            System.out.println("Error message: " + e);
        }

        System.out.println("Program continues after handling the error.");
    }
}