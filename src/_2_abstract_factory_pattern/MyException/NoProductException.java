package _2_abstract_factory_pattern.MyException;

public class NoProductException extends RuntimeException {
	public NoProductException() {
		super();
	}

	public NoProductException(String message) {
		super(message);
	}
}
