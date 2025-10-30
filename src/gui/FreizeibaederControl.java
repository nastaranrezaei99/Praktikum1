package gui;

import java.io.IOException;

import business.FreizeitbaederModel;
import javafx.stage.Stage;

public class FreizeibaederControl {
	private FreiteitbaederView fw;
	private FreizeitbaederModel fm;
	
	
	public FreizeibaederControl(Stage primaryStage) {
		
		this.fm = new FreizeitbaederModel(null);
	    this.fw = new FreiteitbaederView(primaryStage, this, fm);

	}
	
	
	void schreibeFreizeitbaederInDatei(String typ){
		 try{
		 if("csv".equals(typ)){
		 // Aufruf des Models zum Schreiben des
		// Freizeitbads in die Datei des vorgegebenen
		// Typs und Ausgabe der Meldung
			 
			 fm.schreibeFreizeitbaederInCsvDatei();
			 fw.zeigeInformationsfensterAn("Das Freizeitbad wurde aufgenommen!");
			 
			 
		 }
		 else{
		 fw.zeigeInformationsfensterAn(
		 "Noch nicht implementiert!");
		 }
		 }
		catch(IOException exc){
		fw.zeigeFehlermeldungsfensterAn(
		"IOException beim Speichern!", typ);
		}
		catch(Exception exc){
		fw.zeigeFehlermeldungsfensterAn(
		"Unbekannter Fehler beim Speichern!", typ);
		}
		}

	

}
