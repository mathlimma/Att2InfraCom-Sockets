package att2InfraCom;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

	public static void main(String[] args) {

		try {
			ServerSocket tmpsocket = new ServerSocket(3001);
			System.out.println("Aguardando cliente");

			Socket socket = tmpsocket.accept();

			DataInputStream entrada = new DataInputStream(socket.getInputStream());

			System.out.println(entrada.read());
			System.out.println(entrada.read());
			System.out.println(entrada.read());
			
			socket.close();

		}catch(BindException e){
			System.out.println("Endereço em uso");
		}catch(Exception e){

		}

	}

}
