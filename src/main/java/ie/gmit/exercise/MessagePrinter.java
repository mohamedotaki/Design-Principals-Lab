package ie.gmit.exercise;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MessagePrinter {

	//Writes message to a file
	public void writeMessage(Message msg, Formatter formatter, PrintWriter printWriter) throws IOException
	{

		printWriter.println(formatter.format(msg)); //formats and writes message
		printWriter.flush();
		printWriter.close();

	}
}
