package polymorphismDemo;

public class ConsoleLogger extends BaseLogger{
	public void Log(String message) {
		System.out.println("Console to file : " + message);
	}

}
