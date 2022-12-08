import java.util.Arrays;
class SelectionSort {
	public static void main(String[] args) {
		int[] array={4,3,6,1,2,56,34,78,4,5,23,34,112,8,24};
		System.out.println("Before Sorting:"+Arrays.toString(array));
		for(int i=0;i<array.length;i++){
			int min=array[i];
			int index=i;
			for(int j=i;j<array.length;j++){
				if(array[j]<min){
					min=array[j];
					index=j;
				}
			}
			int temp=array[i];
			array[i]=min;
			array[index]=temp;
		}
		System.out.println("After Sorting:"+Arrays.toString(array));
	}
}