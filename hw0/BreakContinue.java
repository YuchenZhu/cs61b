public class BreakContinue {
	public static void windowPosSum(int[] a, int n) {
		for (int i =0; i < a.length; i += 1) {
			if (a[i]<0) {
				continue;
			}
			int temp = 0;
			for (int j=0; j < n+1; j += 1) {
				if (i+j>a.length - 1) {
					break;
				}
				temp += a[i+j];
			a[i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {1,-1,-1,10,5,-1};
		int n = 2;
		windowPosSum(a, n);
		System.out.println(java.util.Arrays.toString(a));
	}
}