/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package squareshift;

/**
 *
 * @author User
 */

import java.util.*;
public class Squareshift
{
	 static boolean twopower(int a)
	    {
	        return a != 0 && ((a & (a - 1)) == 0);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No.: of customers : ");
		int n=sc.nextInt();
		int l=0,l1=0,l2=0,j1=0;
		int[] id=new int[n];
		int[] pri=new int[n];
		int[] pow=new int[n];
		int[] rem=new int[n];
		int[] fin=new int[n];
		for(int i=0;i<n;i++)
		{
			id[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			 int flag=0;            
			  if(id[i]==0)
			  {  
				  break;
			  }
			  else if(id[i]==1)
			  {
				   flag=1;
			  }
			  else if(twopower(id[i]))
				{
					int h1=id[i];
					pow[l1++]=h1;
				}	
			  else
			  {  
			   for(int j=2;j<=n;j++)
			   {      
			    if(id[i]%j!=0)
			    {          
			     flag=1;         
			    }      
			    else
			    {
			    	flag=0;
			    	int h2=id[i];
			    	rem[l2++]=h2;
			    	break;
			    }
			   }      
			   if(flag==1)  
			   { 
				   int h=id[i];
				   pri[l++]=id[i];
			   }
	
			  }  
			}  
		for(int i=0;i<l;i++)
		{
			fin[j1++]=pri[i];
		}
		
		for(int i=0;i<l1;i++)
		{
			fin[j1++]=pow[i];
		}
		for(int i=0;i<l2;i++)
		{
			fin[j1++]=rem[i];
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(fin[i]);
		}
		
		}

	}


