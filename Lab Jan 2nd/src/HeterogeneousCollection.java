import java.util.ArrayList;

public class HeterogeneousCollection {

	public int a;
	public String b;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HeterogeneousCollection other = (HeterogeneousCollection) obj;
		if (a != other.a)
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		return true;
	}

	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		
		Movie movie = new Movie();
		arr.add(movie);
		
		arr.add(1);
		arr.add("hello");
		arr.add(new RuntimeException("fake exception"));
		
		System.out.println(arr);
	}

}
