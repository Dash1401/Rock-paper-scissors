public static void main(String[] args)
{
	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(3000);
			System.out.println("Server gestartet");
			Socket recv = server.accept();
			System.out.println("Test");

			//Streams
			
			OutputStream out = recv.getOutputStream();
			PrintWriter writer = new PrintWriter(out);
			
			InputStream in = recv.getInputStream();
			BufferedReader buf = new BufferedReader(new InputStreamReader(in));
			
			String s = null;
			int count = 0;
			while((s = buf.readLine()) != null)
			{
				writer.write("Daten die empfangen wurden: " + s + "\n" + "Anzahl der Daten: " + count);
				writer.flush();
				System.out.println(s);
				
			}
			
			
			
			writer.close();
			buf.close();
			server.close();
			
		} catch (IOException e) {
			System.out.print("Fehler: ");
			e.printStackTrace();
		}
}
}
