package day07;

public class Office_1_Ternary {

	public static void main(String[] args) {
		
		char c='z';
		
		System.out.println("c: "+c);//c: z
		
		char d=c--;//c='y';
		System.out.println("d: "+d);//d: z

		System.out.println("new c: "+c);//new c: y
		
		char e=--c;
		System.out.println("e: "+e);//e: x
		
		System.out.println("c last: "+c);//c last: x
		
		char f=c-=2;
		System.out.println("f: "+f);
		System.out.println("the latest c: "+c);//the latest c: v
		
		System.out.println(c+d+e+f);//478
		System.out.println(""+c+d+e+f);//vzxv

		System.out.printf("Output via printf %n c: %c  %n d: %c  %n e: %c  %n f: %c",c,d,e,f);
	
	char result = (d>e) ? (e>f) ? f :(d>f) ? e:d:f;
	
	System.out.println("Ternary result: "+result);
		
		
		
		
		
	}

}
