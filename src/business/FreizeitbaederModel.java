package business;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FreizeitbaederModel {
	
	private Freizeitbad freizeitbad;
	
	public Freizeitbad getFreizeitbad() {
		return freizeitbad;
	}

	public void setFreizeitbad(Freizeitbad freizeitbad) {
		this.freizeitbad = freizeitbad;
	}

	public FreizeitbaederModel(Freizeitbad freizeitbad) {
		super();
		this.freizeitbad = freizeitbad;
	}

	public void schreibeFreizeitbaederInCsvDatei() throws Exception
	// Werfen einer IOException
	{
	 BufferedWriter aus = new BufferedWriter(
	new FileWriter("Freizeitbaeder.csv", true));
	 aus.write(this.getFreizeitbad().gibFreizeitbadZurueck(';'));
	aus.close();
	}


}
