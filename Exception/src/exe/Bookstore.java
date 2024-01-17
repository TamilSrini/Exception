package exe;

import java.util.ArrayList;

public class Bookstore {
	
	static ArrayList<String> isbn=new ArrayList<>();
	static ArrayList<String> book_title=new ArrayList<>();
	static ArrayList<String> book_author=new ArrayList<>();
	static ArrayList<Double> book_price=new ArrayList<>();
	static ArrayList<String> book_isbn=new ArrayList<>();

	static ArrayList<Integer> book_qty=new ArrayList<>();
	Book b=new Book();
	public void bookreg(String isbnno,String title,String author,double price)
	
	{
		
		b.ISBN=isbnno;
		b.author=author;
		b.title=title;
		b.Price=price;
		isbn.add(isbnno);
		book_title.add(title);
		book_author.add(author);
		book_price.add(price);
		
		System.out.println(b.toString());
		
	}
	public void booksearch(String isbnno)
	{
	    int t=0;
		try
		{
		for(int i=0;i<isbn.size();i++)
		{
			if(isbnno.equals(isbn.get(i)))
			{
				t=i;
			}
		}
		
			  System.out.println("Details of the book");
			  System.out.println("-------------------------- ");
			 
			   System.out.println("ISBN NO :"+isbn.get(t));
			   System.out.println("TITLE :"+book_title.get(t));
			   System.out.println("AUTHOR :"+book_author.get(t));
			   System.out.println("PRICE :"+book_price.get(t));
			   System.out.println("-------------------------- ");
			 
		
		}
		catch(Exception e)
		{
			   System.out.println(e.getMessage());
		}
		
	
		
	
		
	}
	
	public void totalrevenue()
	{

		double totalr=0;
		for(int j=0;j<isbn.size();j++)
		{
			totalr+=book_price.get(j);
			 
		}
		
		 System.out.println("TOTAL REVENUE :"+totalr);
	
		
	
		
	}
	public void shopingcart(String isbnno,int qty)
	{

		book_isbn.add(isbnno);
		book_qty.add(qty);
	
		
		 
		double total_cost_cart =0;
		for(int k=0;k<book_isbn.size();k++)
		{
			
			int  t=0;
			for(int i=0;i<isbn.size();i++)
			{
				if(isbn.get(i).equals(book_isbn.get(k)));
				{
					t=i;
				}
			}
			total_cost_cart+=book_qty.get(k)*book_price.get(t);
			 
		}
		
		 System.out.println("Total cost in cart :"+total_cost_cart);
	
		 
	
		
	}
	
	

}
