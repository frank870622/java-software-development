package hw5_1;

public class File extends Document{
	private String pathname;
	
	public String toString() {
		String string = "Path: " + pathname + "\r\n" + super.toString(); 
		return string;
	}
	
	public void setPathname(String string) {
		pathname = string;
	}
	public String getPathname() {
		return pathname;
	}
}
