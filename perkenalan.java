public class perkenalan
{
	public static void main (String [] args)
	{
		perkenalan pt=new perkenalan();
		pt.setNama (" Teknik Informatika", "indra", 13);
	}
	public void setNama(String nama, String jurusan, int umur){
		System.out.println ("Hallo,, perkenalan nama saya"+jurusan);
		System.out.println ("saya kuliah di jurusan "+nama);
		System.out.println ("saya berumur "+umur);
	}
}