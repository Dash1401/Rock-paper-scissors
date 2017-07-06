public class Client
{
	private static String Auswahl;
	public static void main(String[] args)
	{
		Auswahl = args[0];
		
		OutputStream out = recv.getOutputStream();
		PrintWriter writer = new PrintWriter(out);
		
		writer.write(Auswahl);
	}
}
