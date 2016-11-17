    public static long fibonacci(int n)
  { if(n == 1 || n == 2) //one of 2  base cases
      return 1;
    else
    { long rp1 = fibonacci(n-1); // first reduced problem
      long rp2 = fibonacci(n-2); // second reduced problem
      long gs = rp1 + rp2;  // general solution
      return gs;
    }
  }