package extend.phone;

public interface Phone {
	final int MAX_NUMBER_DIGITS = 11;

	void call(String number);

	default void poweroff() {
		System.out.println("電源を切ります。");
	}
}
