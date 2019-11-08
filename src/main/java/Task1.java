import java.util.HashMap;
import java.util.HashSet;

public class Task1 {
    //1.Дан массив чисел. Вернуть число уникальных символов
    //Пример: для 1 4 5 1 1 3 ответ 4.
    public static void main(String[] args) {


        System.out.println(uniqueCharacters(new int[]{-1, 24, 25, 1, 1, 3}));
    }

    public static int uniqueCharacters(int[] arr) {
        char [] uniqueChar = new char[12];
        for (int i = 0; i<uniqueChar.length; i++){
            uniqueChar[i] = '#';
        }
        for (int i : arr) {
            String s = Integer.toString(i);
            char[] charArray = s.toCharArray();

            for (int j = 0; j < charArray.length; j++) {
                boolean isInArray = false;
                for (int k = 0; k < uniqueChar.length; k++) {
                    if (charArray[j] == uniqueChar[k]){
                        isInArray = true;
                    }
                }
                if (isInArray == false){

                    for (int c = 0; c< uniqueChar.length; c++ ){
                        if (uniqueChar[c] == '#'){
                            uniqueChar[c] = charArray[j];
                            break;
                        }
                    }
                }
                isInArray = false;
            }

        }
        int uniqueLength = 0;
        for (int i = 0; i<uniqueChar.length; i++){
            if (uniqueChar[i] != '#'){
                uniqueLength++;
            }
        }
        return uniqueLength;
    }
}
