public class CountNumberOfWordsLattersDigitsCharacters {
    public static  void main(String args[]){
        String input = "Md. Tareq Zaman, part-3, 2011";
        numberOfcharandLatter(input);
        numberOfdigits(input);
        numberOfWords(input);
    }

    private static void numberOfWords(String s) {
        String[] parts = s.split("[^a-zA-Z]+");
        /*for ( String ss : parts) {
            System.out.println(ss);
        }*/
        System.out.println("NUmber of words: " + parts.length);
    }

    private static void numberOfdigits(String s) {
        String[] number = {"0","1", "2","3","4","5","6","7","8","9"};
        int len = s.length();
        int count = 0;
        for(int i = 0 ; i <len ; i++){
            String temp = String.valueOf(s.charAt(i));
            for(int j = 0; j<number.length; j++){
                if(temp.equals(number[j]) || temp.equals(number[j].toLowerCase())){
                    count = count + 1;
                }
            }
        }
        System.out.println("Total number of digits : " + count);
        count = 0;

    }

    static void numberOfcharandLatter(String s){
        String[] latter = {"A","B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int len = s.length();
        int count = 0;
        for(int i = 0 ; i <len ; i++){
            String temp = String.valueOf(s.charAt(i));
            for(int j = 0; j<latter.length; j++){
                if(temp.equals(latter[j]) || temp.equals(latter[j].toLowerCase())){
                    count = count + 1;
                }
            }
        }
        System.out.println("Total characters and latters : " + count);
        count = 0;
    }
}
