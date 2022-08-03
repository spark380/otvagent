package otvagent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int iIndex = 0;
	      
	      while(true)
	      {
	         iIndex++;
	         System.out.println("Hello otv " + iIndex);
	         
	         if(iIndex >= 30000)
	         {
	            iIndex = 0;	            
	         }
	         else
	         {
	            try
	            {
	               Thread.sleep(1000);
	            }
	            catch (Exception e) 
	            {
	               // TODO: handle exception
	            }
	         }
	      }
	}

}
