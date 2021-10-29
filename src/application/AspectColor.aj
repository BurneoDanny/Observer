package application;

public aspect AspectColor {
	
	pointcut success(): execution(*String BackgroundColor*(..));
	
	after() returning(String color): success() {
    	System.out.println("Se ha cambiado el color a: "+color);
    }

}