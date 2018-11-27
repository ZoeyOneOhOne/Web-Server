import java.io.*;
import java.net.*;
import java.util.*;

public class WebServer {

	public static void main(String argv[]) throws Exception
	{
		// Set the port number.
		int port = 8080;
		
		// Establish the listen socket.
		 //???? One line of code goes here
		// Process HTTP service requests in an infinite loop.
		while (true) {
		// Listen for a TCP connection request.
		//???? One line of code goes here
			
			// Construct an object to process the HTTP request message.
			HttpRequest request = new HttpRequest(?????);
			// Create a new thread to process the request.
			Thread thread = new Thread(request);
			// Start the thread.
			thread.start();
	}
	
	final class HttpRequest implements Runnable
	{
	
		final static String CRLF = "\r\n";
		Socket socket;
		// Constructor
		public HttpRequest(Socket socket) throws Exception
		{
		this.socket = socket;
		}
		// Implement the run() method of the Runnable interface.
		public void run()
		{
		
		}
		private void processRequest() throws Exception
		{
		
		}
	}
}
