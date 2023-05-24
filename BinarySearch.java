public class BinarySearch {
	
	public static void insertionSort(String v[]) {
		String aux;
		int i, j;
	    for (i = 1; i < v.length; i++){
	        aux = v[i];
	        for (j = i; (j > 0) && (aux.compareTo(v[j - 1]) < 0); j--){
	            v[j] = v[j -1];
	        }
	        v[j] = aux;
	    }
	}

	public static int binarySearch(String value,String v[]) {
		int first = 0;
		int last = v.length - 1;
		int half = 0;
		
		while(first <= last) {
			half = (first + last) / 2;
			if (value.equals(v[half]))
				return 0;
			else {
				if (value.compareTo(v[half]) < 0)
					last = half -1;
				else
					first = half + 1;
			}
		}
		return -1;
	}

	public static void Test() {
		int result = 0;
		String str_vect[] = {
				"Ethan",
				"Olivia",
				"Mason",
				"Ava",
				"Jackson",
				"Sophia",
				"Liam",
				"Emma",
				"Noah",
				"Isabella",
		};
		System.out.println("Before Sorting:");
		System.out.println("\n****************************\n");
		for(String s : str_vect)
			System.out.println(s);
		System.out.println("\n****************************\n");
		System.out.println("Executing Insertion sort...");
		insertionSort(str_vect);
		System.out.println("After Sorting:");
		System.out.println("\n****************************\n");
		for(String s : str_vect)
			System.out.println(s);
		System.out.println("\n****************************\n");
		System.out.println("Executing Binary Search...");
		System.out.println("\n****************************\n");
		System.out.println("Searching Sophia in Array...");
		result = binarySearch("Sophia", str_vect);
		if (result == 0) 
			System.out.println("Sophia Found!!");
		else
			System.out.println("Sophia Not Found!!");
		System.out.println("\n****************************\n");
		System.out.println("Searching Rodrygo in Array...");
		result = binarySearch("Rodrygo", str_vect);
		if (result == 0) 
			System.out.println("Rodrygo Found!!");
		else
			System.out.println("Rodrygo Not Found!!");
		System.out.println("\n****************************\n");
	}

	public static void main(String[] args) {
		Test();
	}
}
