package printexercisetest.input;


public class ApplicationException extends RuntimeException {
	
	public ApplicationException(String msg){
		super(msg);
	}
	
	public ApplicationException(String msg, Throwable ex){
		super(msg, ex);
	}

}
