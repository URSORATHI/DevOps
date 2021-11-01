import static java.lang.Math.pow;
 
class Series
{

static double sum( int n)
{
    double i, total = 0;
    for (i = 1; i <= n; i++)
    {
        total = total + 1/(Math.pow(i, i));
                
    }
    return total;
}
 
public static void main(String args[])
{
    int n = Integer.parseInt(args[0]);
    System.out.printf("%.5f", sum(n));
}
}
