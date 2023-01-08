package lr6;

public class Example1 {
    public static void main(String[] args) {
        lr6 lr6 = new lr6();
        lr6.SetChar('A');
        System.out.println(lr6.ch);
        lr6.SetString("Привет");
        System.out.println(lr6.str);

        char [] oneArray = new char[1];
        oneArray[0] = 'Д';
        lr6.SetArrayValue(oneArray);
        System.out.println(lr6.ch);

        char [] moreThanOne = new char [3];
        moreThanOne[0] = 'Т';
        moreThanOne[1] = 'Р';
        moreThanOne[2] = 'И';
        lr6.SetArrayValue(moreThanOne);
        System.out.println(lr6.str);

    }
}

class lr6 {
    public char ch;
    public String str;

    public void SetChar(char ch) {
        this.ch = ch;
    }

    public void SetString(String str) {
        this.str = str;
    }

    public void SetArrayValue(char[] oneArray) {
        if (oneArray.length == 1) {
            this.ch = oneArray[0];
        } else {
            if (oneArray.length > 0) {
                this.str = String.valueOf(oneArray);
            }
        }
    }
}



