class BinarySearch {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7,8,9,10};
		int search=10;
		int start=0;
		int end=array.length-1;
		while (start<=end){
			int mid=start+(end-start)/2;
			if(array[mid]==search){
				System.out.println("Element found at index:"+mid);
				break;
			}
			if(search>array[mid]){
				start=mid+1;
			}
			else{
				end=mid-1;
			}
		}
	}
}