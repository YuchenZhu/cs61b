public class ClassNameHere {
	public static void max(int[] m){
		int idx = 0;
		int max = m[0];
		while (idx<m.length){
			if (m[idx]>max){
				max = m[idx];
			}
			idx = idx +1;
		}
		System.out.println(max);
	}

	public static void maxFor(int[] m) {
		int max = m[0];
		for (int i =0; i<m.length; i+=1) {
			if (m[i]>max) {
				max = m[i];
			}
		}
		System.out.println(max);
	}

	public static void windowPosSum(int[] a, int n) {

	}
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		ClassNameHere.maxFor(numbers);
	}

}