import java.util.ArrayList;

public class PrintAllVowelAndConsotants {
    public static  void main(String args[]){
        String input = "Munmun is the student of Computer Science & Engineering";
        findVowels(input);
        System.out.println();
        findConsonant(input);
    }

    private static void findVowels(String s) {
        System.out.print("vowels  : ");
        ArrayList<String> con = new ArrayList<>();
        String[] vowelSet = {"A","E", "I","O","U"};
        int len = s.length();
        int count = 0;
        for(int i = 0 ; i <len ; i++){
            String temp = String.valueOf(s.charAt(i));
            for(int j = 0; j<vowelSet.length; j++){
                if(temp.equalsIgnoreCase(vowelSet[j])){
                    System.out.print(vowelSet[j]);
                }

            }
        }

    }
   static void findConsonant(String s){
       System.out.print("consonants :");
        int count = 0;
        for (int i=0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ){
                System.out.print("");
            }else if(ch != ' '){
                System.out.print(ch);
            }
        }

    }
}
