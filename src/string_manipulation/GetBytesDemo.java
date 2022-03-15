package string_manipulation;

public class GetBytesDemo {
    public static void main(String[] args) {
        String s = "abcd";
        byte[] b = s.getBytes();

        for(int i = 0; i < b.length; i++){
            System.out.println(b[i]);
        }


    }
}
