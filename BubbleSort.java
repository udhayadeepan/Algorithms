import java.util.Arrays;
class BubbleSort{
	public static void main(String[] args) {
		int[] array={4,3,6,1,2,56,34,78,4,5,23,34,112,8,24};
		System.out.println("Before sorting:"+Arrays.toString(array));
		for(int i=0;i<array.length;i++){
			for(int j=i;j<array.length;j++){
				if(array[i]>array[j]){
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		System.out.println("After Sorting:"+Arrays.toString(array))
	}
}