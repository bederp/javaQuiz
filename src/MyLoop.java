public class MyLoop
{
    public static void main(String[] args)
    {
        int y = 0;
        while(y < 14)
        {
            y++;
            for(int i = 1; i < 4; i++)
            {
                y += i;
            }
        }
        System.out.println(y);
    }
}
