public class lingkaran extends bangundatar{
	int jari;
	
	public lingkaran (int jari){
		this.jari = jari;
	}
	
	@Override
	public float luas(){
		return (float) (Math.PI * jari * jari);
	}
	
}
