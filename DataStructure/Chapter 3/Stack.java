
public class Stack
{ private Listing[] data;
   private int top;
   private int size;
   public Stack( )
   {  top = -1;
      size = 100;
      data = new Listing[100];
   }
   public Stack(int n)
   {  top = -1;
      size = n;
      data = new Listing[n];
   }
   public boolean push(Listing newNode)
   {  if(top == size-1)
           return false;  // ** overflow error **
       else
       {  top = top +1;
          data[top] = newNode.deepCopy();
          return true;  // push operation successful
       }
   }
   public Listing pop( )
   {  int topLocation;
       if(top == -1)
           return null;  // ** underflow error **
       else
       {  topLocation = top;
           top = top -1;
           return data[topLocation];
       }
   }
   public void showAll( )
   {  for(int i = top; i >= 0; i--)
         System.out.println(data[i].toString());
   }
}

