package Ph;

public abstract class PhoneAdap implements Phone{
	
	void turnOn() {
		System.out.println("전원 켜키");
	}
	
	void turnOff() {
		System.out.println("전원 끄기");
	}

	@Override
	public void msg(String str, String tel) {
		
	}

	@Override
	public void call(String tel) {
		
	}

	@Override
	public void useInterent() {
		
	}
	

}
