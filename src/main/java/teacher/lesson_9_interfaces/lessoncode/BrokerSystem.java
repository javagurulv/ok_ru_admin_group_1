package teacher.lesson_9_interfaces.lessoncode;

public class BrokerSystem {

	public static void main(String[] args) {
		InsurancePolicyCalculator calculator =
				new InsurancePolicyCalculatorV2Impl();

		Broker broker = new Broker(calculator);
		broker.run();
	}

}
