package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArquivosContoller implements IArquivoController {
	
	public ArquivosContoller() {
		super();
	}

	@Override
	public void readFile(String path, String nome) throws IOException {
		File arq = new File(path, nome);
		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) { 
				if (linha.contains("Fruits")) {
					    String[] newLinha = linha.split(",");
					    String newLinha2 = newLinha[0]+" |\t"+newLinha[1]+" |\t"+newLinha[3]+" |\t";
						System.out.println(newLinha2);
				}
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		} else {
			throw new IOException("Arquivo Inválido");
		}
	}

}
