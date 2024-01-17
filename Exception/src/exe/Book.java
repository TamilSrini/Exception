package exe;

public class Book {
	String ISBN;
	String title;
	String author;
	double Price;
	public String getISBN() {
		return ISBN;
	}
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public double getPrice() {
		return Price;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(double price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Book [ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", Price=" + Price + "]";
	}
	

}
