public class DoWhile2{
	public static void main (String [] angka){
		int b = Integer.parseInt(angka[0]);
		System.out.println("sebelum while");
		while(b>=10)
		{
			System.out.println("Nilai b :"+b);
			b--;
		}
		System.out.println("setelah while");
	}
}