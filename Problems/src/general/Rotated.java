package general;

/*
 * Given 2 integer arrays, determine of the 2nd array is a rotated 
 * version of the 1st array. Ex. Original Array A={1,2,3,5,6,7,8} 
 * Rotated Array B={5,6,7,8,1,2,3}
 */
public class Rotated {
	protected static int[] A = { 1, 2, 3, 5, 6, 7, 8 };
	protected static int[] B = { 5, 6, 7, 8, 1, 2, 3 };

	public Rotated(int[] A, int[] B) {
		this.A = A;
		this.B = B;

	}

	public static boolean rotated() {
		if (A == null || B == null || A.length != B.length)
			return false;

		int rotateOffset = -1;
		
		for (int i = 0; i < B.length; ++i)
			if (A[0] == B[i])
				rotateOffset = i;

		if (rotateOffset == -1)
			return false;
		
		for (int i = 0; i < B.length; ++i)
			if (A[i] != B[(i + rotateOffset) % B.length])
				return false;

		return true;
	}

	public static void main(String[] args) {
		System.out.println(rotated());
	}
}
