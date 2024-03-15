package codings.searching;

public class LinearSearch {

	public static void main(String[] args) {

		int key = 12;
		int flag=0;
		int i;
		int[] arr = { 16, 12, 10, 5, 13 }; //static initialization
		for (i = 1; i < arr.length-1; i++) {  //IndexOutOfBoundException
			if (arr[i] == key) {
				flag++;
				break;
			}
		}
			if(flag>0) {
				System.out.println(key + " found at position "+i);
			} else {
				System.out.println(key + "could not be find");
			}
	}

}

//10 did not find  0
//10 did not find  1
//10 found at position :: 2
//10 did not find  3
//10 did not find  4


//Expected Output:
// 10 found at position 2
// 20 could not be find