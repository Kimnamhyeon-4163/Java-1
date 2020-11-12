package sub1;

public class RemoteLg implements RemoteControl {

	@Override
	public void powerOn() {
		System.out.println("LG powerOn...");
	}

	@Override
	public void powerOff() {
		System.out.println("LG powerOff...");
	}

	@Override
	public void chUp() {
		System.out.println("LG chUp...");
	}

	@Override
	public void chDown() {
		System.out.println("LG chDown...");
	}

}
