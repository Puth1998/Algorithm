import java.util.ArrayList;
import java.util.Scanner;
public class findGCD {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		int element1,element2;
		System.out.println("Enter first element");
		element1 = in.nextInt();
		System.out.println("Enter secound element");
		element2 = in.nextInt();
		
		System.out.print(" Prime number of element 1 it Divisible is:");
		ArrayList factor1=new ArrayList();
		factor1 = findF(element1);
		output(factor1);
		
		System.out.println();
		
		System.out.print(" Prime number of element 2 it Divisible is:");
		ArrayList factor2=new ArrayList();
		factor2 = findF(element2);
		output(factor2);
		
		System.out.println();
				
		ArrayList primeFactor1=new ArrayList();
		primeFactor1=findPrimeFactor(factor1,element1);
		System.out.println();
		System.out.print(" New Factor element 1 is :");
		output(primeFactor1);
		
		ArrayList primeFactor2=new ArrayList();
		primeFactor2=findPrimeFactor(factor2,element2);
		System.out.println();
		System.out.print(" New Factor element 2 is :");
		output(primeFactor2);
		

//		compareFactor(primeFactor1,primeFactor2);
		ArrayList compare = new ArrayList();
		
/*
		System.out.println();
		System.out.println(" [ Factor of element 1 is ] ");
		compare1 = compareFactor(factor1,primeFactor1);
		System.out.println();
		System.out.println(" [ Factor of element 1 is ] ");
*/
		
		
		//compare = 
		compareFactor(primeFactor1,primeFactor2,factor1,factor2);
		
		
//		FindCompare(compare1, compare1);
		
		
		
		 
		
	}
	// หาจำนวนเฉพาะที่หารลงตัว
	public static ArrayList findF(int a) {
		int p;
		ArrayList prime= new ArrayList();
		for(int i=1;i<a;i++) {
			int num=0;
			for(int round=i;round>=1;round--) {
				if(i%round==0) {
					num++;
				}
			}
			if(num==2) {
				if(a%i==0){  prime.add(i);  } //เช็คว่าจำนวนเฉพาะหารลงตัว
			}
		}
		return prime;	
	}
	//แสดงค่าจำนวนเฉพาะ
	public static void output(ArrayList a) {
		for(int i=0;i<a.size();i++) {
			System.out.print(" "+a.get(i));
		}
	}
	//
	public static ArrayList<Integer> findPrimeFactor(ArrayList a,int element) {
		ArrayList<Integer> primeFactor=new ArrayList();
		int check=(int) a.get(0);
		int i=0,divide;
		
		do {
			check=(int) a.get(i);
			divide=(int) a.get(i);
			if(element%divide==0) {
				primeFactor.add((Integer) a.get(i));
				element/=divide;
			}else i++;
			check=element/check;
		}while(check!=0);	
		
		return primeFactor;	
	}
	
	public static  void compareFactor(ArrayList e1,ArrayList e2,ArrayList f1,ArrayList f2) {
		ArrayList commonF=new ArrayList();
		int j=0,sum=1,i=0;
		while(i<e1.size()) {
			
			while(e1.get(i)==e2.get(j)){
				sum*=(int)e1.get(i);
				j+=1;
				if(j>e2.size()-1)
					j=0;					
			};
			commonF.add(sum);
			
			i+=1;
		}
		System.out.println();
		System.out.println("GCD is "+sum/2 );
	}
/*
	public static  ArrayList compareFactor(ArrayList div,ArrayList b) {
		ArrayList commonFactor=new ArrayList();
		int j=0,sum=0,i=0;
		while(i<div.size()) {
			
			while(div.get(i)==b.get(j)){
				sum+=1;
				j+=1;
				if(j>b.size()-1)
					j=0;					
			};
			commonFactor.add(sum);
			sum=0;
			i+=1;
		}	
		output(commonFactor);
		return(commonFactor);
			
	}
*/
	
/*
	public static void FindCompare(ArrayList a, ArrayList b) {
		ArrayList sameFactor=new ArrayList();
		int max,check1,check2,sum=1,temp;
		if(a.size()>b.size())
			max = a.size();
		else max = b.size();
		
		for(int i=0; i<max; i++) {
			if((a.get(i)==b.get(i))&&((int) a.get(i)!=0||(int)b.get(i)!=0)) {
				if((int)a.get(i)>(int)b.get(i)) {
					sum*=(int) Math.pow(2,(int)b.get(i));
				}
				
			}
				
		}
		System.out.println();
		System.out.println("GCD is : "+sum);
		
	}
*/	

	
}