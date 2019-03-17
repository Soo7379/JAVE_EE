package com.movie;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "movieData", eager = true)
public class MovieList {
	 private String[] data = {"Guardians of the Galaxy Vol. 2","Logan","The Fate of the Furious", "Pirates of the Caribbean: Dead Men Tell No Tales","Baywatch"};

	 private int count = 0;
	 private double price = 0;
	   public String[] getData() {
	      return data;
	   }

	   public void setData(String[] data) {
	      this.data = data;
	   }
	   public int getcount()
	   {
		   for(int i =0; i< data.length; i++)
		   {
			   count++;
		   }
		   return count;
	   }
	   public double getprice()
	   {
		   price =  count * 2.50;
		   return price;
	   }
}
