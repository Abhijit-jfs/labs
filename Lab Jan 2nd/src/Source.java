public class Source {
	public static void main(String[] args) {
		Book b = new HardCopy();
		b.open();
		b.close();
		b.purchase();
		
		b = new AudioBook();
		b.open();
		b.close();
		b.purchase();
		
		Source s = new Source();
		s.cls(Object.class);
	}
	
	void cls(Class<Object> c) {
		
	}
	
}

abstract class Book {
public abstract void open() ;
public abstract void close();
public void purchase() {
	System.out.println("Purchase Book!");
}
}

class HardCopy extends Book{

	@Override
	public void open() {
		System.out.println("Physically turn pages!");
		
	}

	@Override
	public void close() {
		System.out.println("Physically close!");
	}
	
}

class AudioBook extends Book{

	@Override
	public void open() {
		System.out.println("Hit Play button");
		
	}

	@Override
	public void close() {
		System.out.println("Close Player!");
	}
	
	@Override
	public void purchase() {
		System.out.println("Purchase Book with aadhar card!");
	}
	
}