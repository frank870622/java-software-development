package hw5_1;

public class Email extends Document{
	private String sender;
	private String recipient;
	private String title;
	
	public String toString() {
		String string = "From: " + sender + "\r\nTo: " + recipient + "\r\nTitle: " + title + "\r\n" + super.toString();
		return string;
	}
	
	public void setSender(String string) {
		sender = string;
	}
	public String getSender() {
		return sender;
	}
	
	public void setRecipient(String string) {
		recipient = string;
	}
	public String getRecipient() {
		return recipient;
	}
	
	public void setTitle(String string) {
		title = string;
	}
	public String getTitle() {
		return title;
	}
	
}
