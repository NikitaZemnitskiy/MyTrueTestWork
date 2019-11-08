public class Task2 {
    public static void main(String[] args) {
        System.out.println(RightTurn("a2", "b4"));
    }
    public static boolean RightTurn(String start, String finish){

        int currentString = start.charAt(1);
        int nextString = finish.charAt(1);
        int currentIntVertical = VericalInt(start.charAt(0));
        int nextIntVertical = VericalInt(finish.charAt(0));

        if (currentString<0 && currentString>8){
            System.out.println("Incorrect Input");
         return false;
        }
        if (nextString<0 && nextString>8){
            System.out.println("Incorrect Input");
            return false;
        }
        if (currentIntVertical<0 && currentIntVertical>8){
            System.out.println("Incorrect Input");
            return false;
        }
        if (nextIntVertical<0 && nextIntVertical>8){
            System.out.println("Incorrect Input");
            return false;
        }

        if (currentString == nextString+1 && currentIntVertical == nextIntVertical+2){
            return true;
        }
        if (currentString == nextString+2 && currentIntVertical == nextIntVertical+1){
            return true;
        }
        if (currentString == nextString+2 && currentIntVertical == nextIntVertical-1){
            return true;
        }
        if (currentString == nextString+1 && currentIntVertical == nextIntVertical-2){
            return true;
        }
        if (currentString == nextString-1 && currentIntVertical == nextIntVertical-2){
            return true;
        }
        if (currentString == nextString-2 && currentIntVertical == nextIntVertical-1){
            return true;
        }
        if (currentString == nextString-2 && currentIntVertical == nextIntVertical-1){
            return true;
        }
        if (currentString == nextString-2 && currentIntVertical == nextIntVertical+1){
            return true;
        }
        if (currentString == nextString-1 && currentIntVertical == nextIntVertical+2){
            return true;
        }
        return false;

    }
    public static int VericalInt (char a){
        int vertical = 0;
        switch (a){
            case 'a': vertical = 1; break;
            case 'b': vertical = 2;break;
            case 'c': vertical = 3;break;
            case 'd': vertical = 4;break;
            case 'e': vertical = 5;break;
            case 'f': vertical = 6;break;
            case 'g': vertical = 7;break;
            case 'h': vertical = 8;break;
            default:
                System.out.println("Incorrect Input");
                vertical = -1;
        }
        return vertical;
    }
}
