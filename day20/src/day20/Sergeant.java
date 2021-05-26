package day20;

//특정 클래스에서 골라서 쓸때 
public class Sergeant extends Army { 

	
	@Override
	public void sleep() {
		System.out.println("하루 종일 잔다");
	}
	
	@Override
	public void play() {
		System.out.println("하루 종일 논다.");
	}
	
	@Override
	public void salute() {
		System.out.println("ㅊ!!");
	}
}
