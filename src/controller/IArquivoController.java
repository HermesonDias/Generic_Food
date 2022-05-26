package controller;

import java.io.IOException;

public interface IArquivoController {

	public void readFile(String path, String nome) throws IOException;
	
}
