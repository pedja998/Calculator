package TS;

public class Calculator {

    private static int result;      // Static variable where the result is stored

    public void add(int n) {
        result = result + n;
    }

    public void substract(int n) {
        result = result - n;        //Bug : should be result = result - n
    }
    
    public int substract2(int x, int y) {
    	this.result = x - y;
    	return this.getResult();
    }

    public void multiply(int n) {
    }         // not ready yet


    public void divide(int n) {
        result = result / n;
    }
    
    public String divide2(int a, int b) {
    	if(b==0)
    		return "Delite sa nulom!";
    	else {
    		return String.valueOf(a/b);
    	}
    }

    public void square(int n) {
        result = n * n;
    }

    public void squareRoot(int n) {
        for (; ;) ;                 //Bug : loops indefinitely
    }

    public void clear() {           // Cleans the result
        result = 0;
    }

    public void switchOn() {
        // Swith on the screen, display "hello", beep
        // and do other things that calculator do nowadays
        result = 0;
    }

    public void switchOff() {
        // Display "bye bye", beep, switch off the screen
    }

    public int getResult() {
        return result;
    }
    
    public boolean veceOdNula() {
    	if(this.getResult() > 0)
    		return true;
    	else
    		return false;
    }
    
}
