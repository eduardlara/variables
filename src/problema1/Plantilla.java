package problema1;

import java.util.ArrayList;

public class Plantilla {

	public static void main(String args[]) {
		//p1();
		//p2();
		//p3();
		//p4();
		//p5();
		//p6();
		//p7();
		//p8();
		//p9();
		//p10a();
		p10k();
		//p10c();
		//p10d();
		//p11();
		//p12();
		//p13();
		//p14();
	}

	static void p1() {
		
		boolean x = true;
		boolean y = false;
		System.out.println(x || y);
		//true or true = true
		//true or false = true
		//false or true = true
		//false or false = false
		System.out.print(x && y);
		//true and true = true
		//true and false = false
		//false and true = false
		//false and false = false
				
		
	}
	public static void p2() {
		int x=7;
		boolean pepe = (x==25); 
		System.out.println(pepe);

	}

	public static void p3() {
		int x=25;
		int y=77;
		System.out.println(x!=y);
	}
	public static void p4() {
		int a=4, b=6;
		int c=7;
		int d=8;
		int e=9;
		int f=8;
		int p = (a+b-c*(d/e))*f;
		
		System.out.println("Resultado final:"+p);
		
	}
	public static void p5() {
		float x = 23.4565f;
		int y = (int)x;
	}
	
	public static void p6() {
		float x = 23.4565f;
		int y =(int) x;//explicito

	}
	public static void p7() {
		int x = 23;
		float y = x;//implicito

	}
	public static void p8() {
		int x = 23;
		float y =(float) x;

	}
	public static void p9() {}
	public static void p10a() {
		int a;
		int b;
		a=10;      //a=10
		b=15;      //b=15
		a=b+3+5*b; //a=18+75 = 93
		b=a-b*2;   //b=93 - 15*2 = 63
		a=a+b;     //a=93+63 = 156
		System.out.println(a);
		System.out.println(b);	
	}
	public static void p10b() {
		int a;
		int b;
		a=10;      //a=10
		b=11;      //b=11
		a=b/4%3;   //a=11/4%3 = 2 (si tienen misma preferencia)
		           //a=11/1=11 (si % tiene preferencia mayor)
		b=2+a*3/2+1; //b=2+  3  +1 = 6
		System.out.println(a);
		System.out.println(b);	
	}
	
	public static void p10f() {
		int e = -1 + 2*3/4%5; //e = -1 + 1 =0
		int f = -(1 + 2*(3/(4%5)));//f=-1
		
		System.out.println("Resultado:"+e);
		System.out.println("Resultado:"+f);
		
	}
	public static void p10g() {
		boolean m,n;
		m = true && false || true && !false; //m=false || true =true
        n = m && true && (false || true) && !(true||false);
          //n=true && true && true  &&  false =false
        m = !n || !m && !(m && !n); //m=true ||  ____ = true
        
        n = true || m && !(false && n); //n = true
        System.out.println(m);
        System.out.println(n);
	}
	
	public static void p10i() {
        boolean m, n; int a, b;
        a = 12 + 7/3;  //a=14
        b = 13 -7 % 3; //b=13 - 1  =12
        m = a-b < b-a; //m = 2< -2 = false
        n = a+2 > b-2; //n=16>10=true
        m = a+b != 25+4%3; //m=26 != 26 = false
        n = (a<4 || b<19) && !m; //n= (false || true) && true = true  
        System.out.println(m);
        System.out.println(n);
	}
	
	public static void p10j() {
        char c = 'a';
        int a = 12;
        boolean res;
        res = c != 'c' && 'b' >= c; //res= 'a'!='c'  &&  'b'>='a' =false
                                    //       false  
        res = res == !true || a%5 >= a%4; 
        //res=false==false ||     2>0     = true 
        System.out.println(res);
    }
    public static void p10k() {
        char car1, car2, car3;
        boolean bu;
        car1 = 'b';
        car2 = '3';
        car3 = 'F';
        bu = (car1 > car2) && (car3 != car1);
        //bu = 'b'>'3' && 'F' !='b' = true
        bu = bu && !(car3 <= car2);//bu= true && true
        System.out.println(bu);
    }
	
	public static void p11() {}
	public static void p12() {}
	public static void p13() {}
	public static void p14() {}
}
