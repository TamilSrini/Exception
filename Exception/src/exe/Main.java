package exe;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args)
	{
		Scanner scr=new Scanner(System.in);
		Bookstore  books=new Bookstore();
		boolean loop=true;
		while(loop)
		{
			System.out.println("1.Book Registration");
			System.out.println("2.Book Search");
			System.out.println("3.Total Revenue");
			System.out.println("4.Shopping Cart");
			System.out.println("5.exit");
			
		   int choice=scr.nextInt();
		   switch(choice)
		   {
		   
		   case 1:
		   {
			 try {
			   System.out.println("Enter the ISBN Number");
			   String isbnno=scr.next();
			   System.out.println("Enter the Title of the book");
			   String title=scr.next();
			   System.out.println("Enter the Author");
			   String author =scr.next();
			   
			   System.out.println("Enter the Price");
			   double price=scr.nextDouble();
			   books.bookreg(isbnno,title,author,price);
			 }
			 catch(Exception e)
			 {
				 System.out.println(e.getMessage());
			 }
			     
		   }
		   break;
		   case 2:
		   {
			   System.out.println("Enter the ISBN Number");
			   String isbn=scr.next();
		   
				books.booksearch(isbn);
		   }
		   
			
			   
		   
		   break;
			
		   case 3:
		   {
			   
				books.totalrevenue();
		   }
		   
			
			   
		   
		   break;
		   case 4:
		   {
			   System.out.println("Enter the ISBN Number");
			   String isbn=scr.next();
				
				  System.out.print("Enter quantity: ");
			        int quantity;

			        try {
			            quantity = scr.nextInt();
			        } catch (InputMismatchException e) {
			            throw new RuntimeException("Invalid quantity,... enter a numeral value");
			        }
			        books.shopingcart(isbn,quantity);
		   }
		   
			
			   
		   
		   break;
		   case 5:
		   {
			   loop=false;
		   }
		   default:
			   break;
			   
		   }
			
		}
	}
}
