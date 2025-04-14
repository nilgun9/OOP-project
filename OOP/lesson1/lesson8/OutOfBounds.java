public class OutOfBounds {
    public static void main(String[ ] args)
    {
        try
        {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index is out of bounds!");
        }
    }
}