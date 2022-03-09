package aldidi;

public class chiperUbahHuruf {
    private static StringBuilder chiper(String s){
        int offset = 0;

        StringBuilder result = new StringBuilder();
        for (char character : s.toCharArray()){
            if(character != ' '){
                int originalPosition = character - 'a';
                int newPosition = (originalPosition + offset)%26;
                char newCharacter = (char) ('a' + newPosition);
                result.append(character);
            } else  {
                result.append(character);
            }
        }
        return result;
    }

}
