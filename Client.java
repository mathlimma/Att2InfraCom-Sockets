package att2InfraCom;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		String address="localhost";
		try {
			Socket socket = new Socket(address, 3001);

			DataOutputStream saida = new DatAaOutputStream(socket.getOutputStream());

			int num=10;
			int num2=20;
			int num3=20;

			saida.write(num);
			saida.write(num+num2);
			saida.write(num+num2+num3);

			socket.close();

		}catch(BindException e){

		}catch(Exception e){

		}

	}

}
