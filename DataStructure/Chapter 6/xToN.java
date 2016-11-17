   public static double xToN(double x, int n)
  { if(n == 0)  // base case
      return  1;
    else
    { double rp = xToN(x, n-1); // calculate the reduced problem (recursion)
      double gs = x * rp; // calculate the general solution
      return gs; // return the general solution
    }
  }