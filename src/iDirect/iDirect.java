package iDirect;

import java.util.List;

import giovynet.nativelink.SerialPort;
import Ventanas.*;
public class iDirect {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Inicia aplicación");
		SerialPort sp=new SerialPort();
		List <String> lista=sp.getFreeSerialPort();
		for(String puertos:lista){
			System.out.println(puertos);
			
		}
		
		PrincipalFrame ventana=new PrincipalFrame();
		ventana.setVisible(true);

	}

}
