class DoWhile{
	public static void main (String [] angka){
		int b = Integer.parseInt(angka[0]);
		System.out.println("sebelum do");
		do{
			System.out.println("Nilai b :"+b);
			b--;
		}
		while(b>=10);
		System.out.println("setelah do");
	}
}