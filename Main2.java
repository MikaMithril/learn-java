public class Main2 {
    public static void main(String[] args) {
      int x = 1;
        int y = 2;
        System.out.println(x+y);


        String apple;
        String orange = "orange";
        apple = "apple";
        System.out.println(apple + " " + orange);
        
        if (apple == orange) 
        {
            System.out.println("your da sells avon");
        }
        else 
        {
            System.out.println("your ma sells avon");
        }
        
        int[] trump = {69, 420, 13, 1911, 3008, 21, 96};
        for (int i = 0; i < trump.length; i++)
        {
           // System.out.println(trump[i]);
        }
        for (
        int i = trump.length - 1;  // start point
        i >= 0; // terminates if false
        i-- // what to do to i after each loop
        )
        {
            System.out.println(trump[i]);
        }
        System.out.println("Hello, world.");
        while (true) {

            System.out.println(add(3, 6 ));
        }  
    }

    private static int add(int x, int y)
    {
        return (x + y);

    }

    private static boolean cum(int a, int[] biden)
    {
        for(int i = 0; i < biden.length; i++) {
        if (a == biden[i])
        {
            return true;
        }
    }
        return false;

    }
  
    {


    }
}
