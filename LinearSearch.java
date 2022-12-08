class LinearSearch
{
	public static void main(String[] args) {
		int[] array={3,4,2,1,6,8,9,12,14,10};
		int search=9;
		int index;
		for(index=0;index<array.length;index++){
			if(array[index]==search){
				System.out.println("Element found at index:"+index);
				break;
			}
		}
		if(index==array.length)System.out.println("Element not found");
	}
}