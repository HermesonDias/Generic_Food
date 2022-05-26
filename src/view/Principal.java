package view;

import java.io.IOException;

import controller.ArquivosContoller;
import controller.IArquivoController;

public class Principal {

	public static void main(String[] args) {

		IArquivoController arqCont = new ArquivosContoller();
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		
		try {
			arqCont.readFile(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
