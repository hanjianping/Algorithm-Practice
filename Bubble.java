public class Bubble{
	public static void main(String [] args){
		int array[]={1,5,12,2,9,19,4,34,6};
		int j=0;
		for (int i =0;i<array.length;i++){
			j=i;
			int tmp=0;
			while(j<array.length){
				if (array[i]>array[j]){
					tmp=array[i];
					array[i]=array[j];
					array[j]=tmp;
				}
				j++;
			}
		}
		for (int k =0;k<array.length;k++){
			System.out.print(array[k]+" ");
		}
	}
}