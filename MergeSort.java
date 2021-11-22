package sorting;

public class MergeSort {
	public static void main(String[] args) {
		 int a[]= {4,6,2,5,7,9,1,3};
		 Sort(a,0,a.length-1);
		 
		 for(Integer val: a) {
			 System.out.print(val + " ");
		 }
	}
	
	 public static void Sort(int a[], int low, int high) {
	    	if(low<high) {
	    		int mid=low+(high-low)/2;
	    		
	    		Sort(a,low,mid);
	    		Sort(a,mid+1,high);
	    		
	    		merge(a,low,mid,high);
	    		
	    	}
	   }
	
	public static void merge(int a[], int low, int mid, int high) {
		int n1=mid-low+1;
		int n2=high-mid;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		for(int i=0;i<n1;i++) {
			L[i]=a[low+i];
		}
		for(int j=0;j<n2;j++) {
			R[j]=a[mid+1+j];
		}
		
		int i=0,j=0;
		int k=low;
		
		while(i<n1 && j<n2) {
			if(L[i]<=R[j]) {
				a[k]=L[i];
				i++;
			}
			
			else {
				a[k]=R[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2) {
			a[k]=R[j];
			j++;
			k++;
		}
	}
}
