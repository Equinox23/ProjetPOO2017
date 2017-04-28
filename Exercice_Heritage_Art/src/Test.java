class Art {
	protected int prix ;
	
	public Art(int p){
		prix = p ;
		System.out.println("Construit Art");
	}
	
	public int getPrix() {
		return prix ;
	}
	
	public void setPrix(int p) {
		prix = p ;
	}
}
	
class Drawing extends Art {
	public Drawing(int p){
		super (p);
		System.out.println("Construit Drawing");
	}
}

class Cartoon extends Drawing {
	public Cartoon(int p) {
		super(p);
		System.out.println("Construit Cartoon");
	}
	
	public void setPrix(int p) {
		prix = p * 110 / 100 ;
	}
	
	public void doubler() {
		setPrix(prix *2) ;
	}
}

public class Test {
	public static void main(String[] args) {
			
		Object v = new Cartoon(200);
		
		if(v instanceof Drawing)
			System.out.println("C'est un Drawing");
		
		if(v instanceof Cartoon){
			((Cartoon) v).doubler();
			
			System.out.println(((Cartoon) v).getPrix());
		}
				
		System.out.println(v);
		System.out.println(((Cartoon) v).getPrix());

	}
}
