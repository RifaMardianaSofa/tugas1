public class testing {
	public static void main (String [] args)
	{
		char [] p ={'a','b','c','d','e'};
		char [] x = upperCaseVersion(p);//(p) berarti mengubah huruf pada char [] p
		for(int i =0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
	}
	public static char[] upperCaseVersion (char[] a)
	{
		int i;
		for (i=0; i<a.length; i++)
			a[i]=Character.toUpperCase(a[i]);//toUpperCase berfungsi untuk mengubah huruf kecil menjadi huruf besar
	 	return a;
	}
}