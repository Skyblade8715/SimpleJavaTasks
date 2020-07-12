public class ReverseWordsInSentence {

    //Task - reverse words inside of the sentence without changing order of words. Don't use reverse() or split().
    public static String reverse(String sentence){
        StringBuilder result = new StringBuilder(),
                word = new StringBuilder();
        for(int i = 0; i < sentence.length(); i++){
            if ( (" ").equals(Character.toString(sentence.charAt(i)))) {
                result.append(reverseWord(word.toString())).append(" ");
                word = new StringBuilder();
            } else {
                word.append(sentence.charAt(i));
            }
        }
        result.append(reverseWord(word.toString()));
        return result.toString();
    }

    private static String reverseWord(String word){
        StringBuilder result = new StringBuilder();
        for(int j = word.length() - 1; j >= 0; j--){
            result.append(word.charAt(j));
        }
        return result.toString();
    }
}