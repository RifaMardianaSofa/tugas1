class kalkulator{
	public static void main (String [] args){
		int c;
		float d;
		c=tambah (3,2);
		System.out.println(c);
		c=kurang (2,3);
		System.out.println(c);
		c=kali (3,3);
		System.out.println(c);
		d=bagi (6,2);
		System.out.println(d);
	}
	public static int tambah (int a, int b){
		return(a+b);
	}
	public static int kurang (int a, int b){
		return(a-b);
	}
	public static int kali (int a, int b){
		return(a*b);
	}
	public static int bagi (int a, int b){
		return(a/b);
	}
}