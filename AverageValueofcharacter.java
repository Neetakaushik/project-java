package StringPrograM;

public class AverageValueofcharacter {

	public static void main(String[] args) {
	//main method
		int[]num=new int[]{45,76,43,98,90};
		//Sum of elements
		int s=0;
		for (int i=0; i<num.length; i++)
			s=s+ num[i];
		//find the average value
		int average =s/num.length;
		System.out.println("Average value is :" +average);

	}

}
