package lr5;

public class Example1 {

    private char letter;

    public void setter (char letter){
        this.letter = letter;
    }

    public int getter(){
        return letter;
    }

    public void show(){
        System.out.println("Value is " + letter);
        System.out.println("Code is " + (int)letter);
        System.out.println("Get code is " + getter());
    }
}
