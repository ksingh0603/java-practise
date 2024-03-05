package codings.seaching;

public class LinearSearch {

	public static void main(String[] args) {

		int key = 10;
		int[] arr = { 16, 12, 10, 5, 13 };
		for (int i = 0; i <= arr.length; i++) {
			if (arr[i] == key) {
				System.out.println(key + " found at position :: " + i);
			} else {
				System.out.println(key + "did not find");
			}
		}

	}

}
