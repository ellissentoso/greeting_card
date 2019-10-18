/* Name: Ellis Sentoso
*  Professor: Ladawn Meade
*  Class: CS1 - Java
*  Assignment: Greeting Card Project
*  Email: ellissentoso@gmail.com
*  Date: 10/18/2019
*/
package greeting_official;
import java.util.Scanner;
import java.text.*;
import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		cardOrganizer thing =new cardOrganizer();
		// (String sender, String recipient, String message,String occasion)
		if (thing.addCard("Ellis","Charles","Merry Christmas","Christmas")) {
		System.out.println("Added successfully");
		}
		System.out.println(thing);
		System.out.println(thing.findRecipient("Charles"));

	}




}

class greetingCards {

	private String _sender;
	private String _recipient;
	private String _message;
	private String _occasion;

	// good
	public greetingCards(String sender,String recipient,String message, String occasion) {
		_sender = sender;
		_recipient = recipient;
		_message = message;
		_occasion = occasion;
	}

	public String toString() {
		return "Occasion: " + _occasion +" "+ "Message: " + _message+" " + "Sender: "+" "+ _sender+" " + "Recipient: "+ _recipient;
	}

	public String getSender() {
		return _sender;
	}
	public String getRecipient() {
		return _recipient;
	}
	public String getMessage() {
		return _message;
	}
	public String getOccasion() {
		return _occasion;
	}





}
// focus on these
class cardOrganizer {
	int MAX = 20;
	int NULL = 0;
	int amounts;
	private greetingCards arr[];
	
	public cardOrganizer()
	{
		amounts = 0;
		arr = new greetingCards[MAX];

	}

	public String findRecipient(String recipient)
	{
		for(int i=0;i< MAX;i++)
		{
			//If both the strings are equal then this method returns 0
			if(arr[i].getRecipient().compareTo(recipient) == NULL)
				return arr[i].toString();
		}
		
		return "does not exist";
	}

	public boolean addCard(String sender, String recipient, String message,String occasion) {
		int i = 0;
		if (i <= MAX) {
			arr[i]=new greetingCards(sender,recipient,message,occasion); // cards to the array
			i++;
			return true;
		}
		else 
			return false;
	}

	public void displayCards(String occasion) {
		for(int i=0;i<MAX;i++)
		{
			if(arr[i].getOccasion().compareTo(occasion)==NULL) {
				System.out.println(arr[i]);
			}
		}
	}
	
	public String toString()
	{
	String s="";
	for(int i=0;i< amounts;i++)
	{
		s= s + "Recipient : "+ arr[i].getRecipient()+"Occasion : "+ arr[i].getOccasion();
	}
	return s;
	}


}

/*
 * Added successfully

Occasion: Christmas Message: Merry Christmas Sender:  Ellis Recipient: Charles
 * 
 */
 

