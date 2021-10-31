import static java.lang.Math.pow;
class Series
{
static double sum(int x, int n)
{
 double i, total = 1.0,power;
 for (i = 2; i <= n; i++){
power = Math.pow(i,2);
total = total + (Math.pow(x,power))/i;
}

 return total;
}
public static void main(String args[])
{
 int x = Integer.parseInt(args[0]);
 int n = Integer.parseInt(args[1]);
 System.out.printf("Sum of series = %.2f", sum(x, n));
}
}
