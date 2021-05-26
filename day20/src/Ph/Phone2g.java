package Ph;

public class Phone2g extends PhoneAdap{
	
	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		super.turnOn();
	}
	
	@Override
	void turnOff() {
		// TODO Auto-generated method stub
		super.turnOff();
	}

	@Override
	public void msg(String str , String tel) {
		System.out.println(tel+ "에게 전송중" +"\n내용 : "+str);
		
	}

	@Override
	public void call(String tel) {
		System.out.println(tel+"에게 전화거는중 ");
	}

	
	

}
