package day20;

public class Private implements Soldier {

	
	
	@Override
	public void eat() {
		System.out.println("천천히 각을 재서 90도로 앉아서 먹는다.");
		
	}

	@Override
	public void work() {
		System.out.println("누구보다 빠르게 눈치껏 한다");
		
	}

	@Override
	public void play() {
		System.out.println("나다 싶으면 하자");
		
	}

	@Override
	public void sleep() {
		play();
		System.out.println("잘땐 입대전의 생각이 새록새록");
		
	}

	@Override
	public void salute() {
		
		System.out.println("필!!!승 i can do !!!");
		
	}

}
