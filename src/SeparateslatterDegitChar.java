public class SeparateslatterDegitChar {
    public static  void main(String args[]){
        String input = "Md. Tareq Zaman, part-3, 2011";
        numberOfcharandLatter(input);
        System.out.println();
        numberOfdigits(input);
        System.out.println();
        numberOfWords(input);
    }
    private static void numberOfWords(String s) {
        System.out.print("words :");
        String[] parts = s.split("[^a-zA-Z]+");
        for ( String ss : parts) {
            System.out.print(ss + " ");
        }
    }

    private static void numberOfdigits(String s) {
        System.out.print("Digits : ");
        String[] number = {"0","1", "2","3","4","5","6","7","8","9"};
        int len = s.length();
        for(int i = 0 ; i <len ; i++){
            String temp = String.valueOf(s.charAt(i));
            for(int j = 0; j<number.length; j++){
                if(temp.equals(number[j]) || temp.equals(number[j].toLowerCase())){
                    System.out.print(number[j]);
                }
            }
        }
    }

    static void numberOfcharandLatter(String s){
        System.out.print("Latter: ");
        String[] latter = {"A","B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int len = s.length();
        for(int i = 0 ; i <len ; i++){
            String temp = String.valueOf(s.charAt(i));
            for(int j = 0; j<latter.length; j++){
                if(temp.equals(latter[j]) || temp.equals(latter[j].toLowerCase())){
                    System.out.print( latter[j] + " ");
                }
            }
        }
    }
}
