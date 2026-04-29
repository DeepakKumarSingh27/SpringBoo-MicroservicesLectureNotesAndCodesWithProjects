package in.ashokit;

public class Car {
	private DieselEngine dieselEngine;

	public void setDieselEngine(DieselEngine dieselEngine) {
		System.out.println("SetDieselEngine method()..");
		this.dieselEngine = dieselEngine;
	}

	public Car() {
		System.out.println("Car:: 0 Const..");
	}
	

	public Car(DieselEngine dieselEngine) {
		System.out.println("Car:: const param..");
		this.dieselEngine = dieselEngine;
	}

	public void drive() {
		int start = dieselEngine.start();
		if (start >= 1)
			System.out.println("Journer start..");
		else
			System.out.println("Engine failed to start..");
	}
}
