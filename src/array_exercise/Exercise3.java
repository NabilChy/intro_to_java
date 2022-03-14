package array_exercise;
// Switch the position of vowels only in a char array.
public class Exercise3 {
    public static void main(String[] args) {
        char[] chr = new char[] {'a','b','i','f','d','e','c','k','u','y'};
        System.out.println("Before swap:");
        for(int i = 0; i < chr.length; i++){
            System.out.print(chr[i] + " ");
        }
        System.out.println();

        chr = SwapVowelPos(chr);
        System.out.println("After swap:");
        for(int i = 0; i < chr.length; i++){
            System.out.print(chr[i] + " ");
        }
    }

    public static char[] SwapVowelPos(char[] chr){
        int i = 0;
        int j = chr.length - 1;
        char temp;

        while(i < j){
            // Do if both side has vowels.
            if ((chr[i] == 'a' || chr[i] == 'e' ||
                    chr[i] == 'i' || chr[i] == 'o' ||
                    chr[i] == 'u') &&
                    (chr[j] == 'a' ||
                    chr[j] == 'e' || chr[j] == 'i' ||
                    chr[j] == 'o' || chr[j] == 'u') &&
                    (chr[i] != chr[j])){
                temp = chr[i];
                chr[i] = chr[j];
                chr[j] = temp;
                i++;
                j--;
            } else if((chr[i] != 'a' || chr[i] != 'e' ||
                    chr[i] != 'i' || chr[i] != 'o' ||
                    chr[i] != 'u') && (chr[j] == 'a' ||
                    chr[j] == 'e' || chr[j] == 'i' || chr[j] == 'o'
                    || chr[j] == 'u')){
                //If chr[j] has vowels but char[i] does not.
                i++;
            }else if ((chr[j] != 'a' || chr[j] != 'e' ||
                    chr[j] != 'i' || chr[j] != 'o' ||
                    chr[j] != 'u') && (chr[i] == 'a' ||
                    chr[i] == 'e' || chr[i] == 'i' || chr[i] == 'o'
                    || chr[i] == 'u')){
                //If chr[i] has vowels but char[j] does not.
                j--;
            } else {
                i++;
                j--;
            }
        }
        return chr;
    }
}
