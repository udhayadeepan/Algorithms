import java.util.Arrays;
class InsertionSort 
{
	public static void main(String[] args) {
		int[] array={4,3,6,1,2,56,34,78,4,5,23,34,112,8,24};
		System.out.println("Before Sorting:"+Arrays.toString(array));
		for(int i=1;i<array.length;i++){
			for(int j=i;j>0;j--){
				if(array[j]<array[j-1]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
				
			}
		}
		System.out.println("After sorting:"+Arrays.toString(array));
	}
}