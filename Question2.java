import java.util.*;

class Question2
{
 public static boolean convertBase (int m, int b)
 {
  int rem= m%b;
  m = m/b;

  while(m>=b && (m%b==rem))
    m= m/b;

  if(m==rem)
     return true;

  return false;
 }

 public static void main (String[]args)
 {
  Scanner sc= new Scanner(System.in);

  int m= sc.nextInt ();
  int b= 2;

  while(convertBase(m, b)!= true)
     b++;

  System.out.println(b);
 }
}
