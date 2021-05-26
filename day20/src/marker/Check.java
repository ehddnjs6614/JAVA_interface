package marker;

public class Check {
	public static void main(String[] args) {
	
		Digmon d = new Digmon();
		PoketMon p = new  PoketMon();
		Zzogu z = new Zzogu();
		HarryPotter h = new HarryPotter(); 
		
		if(d instanceof Animation) {
			System.out.println("디지몬은 애니메이션이다.");
			
		}
		if(p instanceof Animation) {
			System.out.println("포켓몬 애니메이션이다.");
			
		}
		if(z instanceof Animation) {
			System.out.println("짱구는 애니메이션이다.");
			
		}
		if(h instanceof Animation) { //해리포터는 애니메이션에 속하지않는다. 그러므로 출력 x
			System.out.println("해리포터는  애니메이션이다.");
			
		}
		
}
}
