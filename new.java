class Main
{
    public static void main(String args[])
    {
        for(int i=0;i<5;i++)
        {
            if(i==2)
            break;
            System.out.println(i);
        }

            System.out.println("break example");
            for(int i=0;i<5;i++)
            {
                if(i==2)
                continue;
                System.out.println(i);
            }
        
    }
}