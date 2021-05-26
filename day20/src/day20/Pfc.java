package day20;

public class Pfc implements Soldier{

	@Override
	public void eat() {
		System.out.println("조금 빨리 식사하고 이등별 챙기기");
	}

	@Override
	public void work() {
		System.out.println("아직까지는 나다싶으면 바로 튀쳐나가가기");
		
	}

	@Override
	public void play() {
		System.out.println("개인 정비 시간을 잘 활용하여 사지방과 노래방 가능.");
		
	}

	@Override
	public void sleep() {
		play();
		System.out.println("근무나가기싫은생각에 잠이 스르르륵 든다.");
	}

	@Override
	public void salute() {
		System.out.println("필!!!승 i can do !!!");
		
	}

}
