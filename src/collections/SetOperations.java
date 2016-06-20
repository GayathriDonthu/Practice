package collections;

import java.util.*;

public class SetOperations  {
	public static void main (String[] arqs) {
		new SetOperations() .go();
	}
	public void go() {
		Book b1 = new Book ("Bow cats Work") ;
		Book b2 = new Book ("Remix your Body") ;
		Book b3 = new Book("Finding Emo");
		TreeSet<Book> tree = new TreeSet<Book>() ;
		tree.add (b1);
		tree.add(b2);
		tree.add (b3);
		System.out.println(tree);
	}
}

class Book implements Comparable {
		String title;
		public Book(String t) {
		title = t;
		}

		public int compareTo(Object b) {
			Book book = (Book) b;
			return (title.compareTo(book.title));
			
		}
}
