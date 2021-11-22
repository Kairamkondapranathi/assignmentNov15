  package sorting;

public class QuickSort {
	public static void main(String[] args) {
		 int a[]= {4,6,2,5,7,9,1,3,8};
		 sort(a,0,a.length-1);
		 
		 for(Integer val: a) {
			 System.out.print(val + " ");
		 }
	}
	
	static void sort(int a[], int low,int high) {
		if(low<high) {
			int pivot = quick(a,low,high);
			sort(a,low,pivot-1);
			sort(a,pivot+1,high);
		}
	}
	
	static int quick(int a[], int low, int high) {
		int pivot = a[low];
		int i =low;
		int j = high;
		
		while(i<j) {
			while(a[i]<pivot) {
				i++;
			}
			while(a[j]>pivot) {
				j--;
			}
			if(i<j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		int temp = pivot;
		pivot = a[j];
		a[j] = temp;
		
		return j;
	}
}

	
