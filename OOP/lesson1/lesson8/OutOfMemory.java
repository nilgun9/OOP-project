
public class OutOfMemory
{
    public static void main(String[] args)
    {
        try {
            int[] hugeArray = new int[Integer.MAX_VALUE];
        } catch (OutOfMemoryError e) {
            System.err.println("Out of Memory Error occurred!");
            System.gc();
        }
    }
}
