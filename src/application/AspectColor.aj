package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Date;

public aspect AspectColor {
	
	pointcut success(): execution(*String BackgroundColor*(..));
	
	after() returning(String color): success() {
    	System.out.println("Se ha cambiado el color a: "+color);
    
    }
	

	    Date fecha = new Date();
	    BufferedWriter bw;
	    File file = new File("registroColor.txt");
	    Calendar cal = Calendar.getInstance();
	    
	    pointcut success2(): execution(*String BackgroundColor*(..));
	    
	    after() returning(String color): success2() {
	    	try {
	    		if (!file.exists()) {
	    		file.createNewFile();
	    		}
	    		FileWriter fw = new FileWriter(file,true);
	    		BufferedWriter bw = new BufferedWriter(fw);
	    		bw.write(color+"-"+fecha+"\n");
	    		bw.close();
	    		} catch (Exception e) {
	    		e.printStackTrace();
	    		}
	    	System.out.println("**** ColorGuardado ****");
	    }

}