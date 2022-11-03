public class CountVowelAndConsonants {
    public static  void main(String args[]){
        String input = "Munmun is the student of Computer Science & Engineering";
        countVowelscountConsonants(input);

    }



    private static void countVowelscountConsonants(String s) {
        String[] vowelSet = {"A","E", "I","O","U"};
        int len = s.length();
        int count = 0;
        for(int i = 0 ; i <len ; i++){
            String temp = String.valueOf(s.charAt(i));
            for(int j = 0; j<vowelSet.length; j++){
                if(temp.equals(vowelSet[j]) || temp.equals(vowelSet[j].toLowerCase())){
                    count ++;
                }
            }
        }
        System.out.println("Total vowels  : " + count);
        int numberofLatter = numberOfcharandLatter(s);
        System.out.println("Total Consonant : " + (numberofLatter - count));
        count = 0;
    }
    static int numberOfcharandLatter(String s){
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
        return count;
    }
}
