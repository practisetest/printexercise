package printexercise.input;


@SuppressWarnings("serial")
public class ApplicationException extends RuntimeException {
	
	public ApplicationException(String msg){
		super(msg);
	}
	
	public ApplicationException(String msg, Throwable ex){
		super(msg, ex);
	}

}
