package controlador;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private final static String DIRECCIONIP = "127.0.0.1";
	private final static int PUERTO = 35698;
	
	private static boolean running = true;

	public static void main(String[] args) {
		System.out.println("BACK-END SERVER");
		System.out.println("---------------");
		try {
			ServerSocket servidor = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(DIRECCIONIP,PUERTO);
			servidor.bind(direccion);
			
			System.out.println("Servidor escuchando peticiones en la dirección: "+direccion.getAddress());
			
			while (running) {
				Socket conexionCliente = servidor.accept();
				System.out.println("Comunicación entrante");
			}
			
			servidor.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}
}