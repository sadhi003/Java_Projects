public static void stringReverse(String s, int n)
{  if(n == 0) // base case
        return;
    else // general solution
   { System.out.print(s.charAt(n-1)); // output the last character
      stringReverse(s, n-1); // reduced problem (recursion)
   }
}