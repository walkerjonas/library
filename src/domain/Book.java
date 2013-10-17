package domain;

import java.util.Observable;

public class Book extends Observable {
	
	private String title, author, publisher;
	private Shelf shelf;
	
	public Book(String name) {
		this.title = name;
	}

	public String getName() {
		return title;
	}

	public void setName(String name) {
		this.title = name;
		doNotify();
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String autor) {
		this.author = autor;
		doNotify();
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
		doNotify();
	}
	
	public Shelf getShelf() {
		return shelf;
	}
	
	public void setShelf(Shelf shelf) {
		this.shelf = shelf;
		doNotify();
	}
	
	@Override
	public String toString() {
		return title + ", " + author + ", " + publisher;
	}
	private void doNotify(){
		setChanged();
		notifyObservers(this);
	}
}
