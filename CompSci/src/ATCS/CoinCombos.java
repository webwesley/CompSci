package ATCS;

//a method that takes an amount in cents and prints out all possible
//representations of that amount as a sum of several quarters, dimes, nickels and
//pennies.

	public class CoinCombos {
	    
	    public void allCoins(int cents)
	    {
	    	
	        int nickel = 0;
	        int penny = 0;
	        for(int q = 0;q<=(int)(cents/25);q++)
	        {
	            for(int d = 0; d*10<=cents;d++)
	            {
	                for(int n = 0; n*5<=cents;n++)
	                {
	                    for(int p = 0;p<=cents ;p++)
	                    {
	                        if((q*25)+(d*10)+(n*5)+p == cents)
	                        {
	                            penny = p;
	                            break;
	                        }
	                    }
	                    if((q*25)+(d*10)+(n*5)+penny != cents)
	                    {
	                        break;
	                    }
	                    System.out.println(cents + " cents = " +  q + " Quarters " + d + " Dimes " + n + " Nickels " + penny + " Pennies.");
	                    nickel = n;
	                }
	                
	            }
	        }
	    }

	}



