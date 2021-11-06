public class main {
	public static void main(String[] args){
		
		bangundatar bdt = new bangundatar();
		Persegi persegi = new Persegi (5);
		lingkaran lingkaran = new lingkaran (8);
		
		bdt.luas();
		
		System.out.println("Luas Persegi: " + persegi.luas());
		System.out.println("Luas Lingkaran: " + lingkaran.luas());
	}
}