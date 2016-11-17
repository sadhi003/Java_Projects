public static void hanoi(int n, int S, int D, int E)
{ if(n == 1) // base case
      System.out.println("move 1 ring from tower " + S + " to tower " + D);
  else // general solution
  {  hanoi(n-1, S, E, D); // reduced problem
      System.out.println("move 1 ring from tower " + S + " to tower " + D);
      hanoi(n-1, E, D, S);  // reduced problem
  }
}