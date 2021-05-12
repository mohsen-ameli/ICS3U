public class test {
    public static void main (String[] args)
    {
        // setting a string variable called name
        int x, y, z;
        x = 7;
        y = 4;

        z = x; // setting the value of x to another variable z = 7
        x = y;
        y = z;

        System.out.println("x:" + x + "\ny:" + y);

    }
}
