
public class Candles {

	public static void main(String[] args) {
		int n=6,k=4;
		int[] arr= {100,20,40,20,50,50};
		int[] c= {0,0,0,0,0,0};
		int count=0;
		for(int i=0;i<n;i++) {
			int z=1;
			for(int j=0;j<n;j++) {
				if(arr[i]<arr[j]) {
					z++;
				}
			}
			c[i]=z;
		}
		for(int i=0;i<n;i++) {
			if(c[i]==k) {
				count=arr[i];
			}
		}
		System.out.println(count);
	}

}
