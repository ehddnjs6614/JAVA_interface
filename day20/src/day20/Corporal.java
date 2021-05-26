package day20;

public class Corporal implements Soldier{

	@Override
	public void eat() {
		System.out.println("여유롭게 천천히 먹는다");
	}

	@Override
	public void work() {
		System.out.println("틀만 잡아주고 애들시킨다");
		
	}

	@Override
	public void play() {
		System.out.println("달려간다");
	}

	@Override
	public void sleep() {
		System.out.println("세상 모르게 잔다");
		
	}

	@Override
	public void salute() {
		System.out.println("필승 i can do");
	}
	

}
