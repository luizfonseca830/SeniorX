package br.com.senior;

public class ServiceDependenceException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ServiceDependenceException(String message, Throwable cause) {
        super(message, cause);
    }

	public ServiceDependenceException(String message) {
        super(message);
    }

}

