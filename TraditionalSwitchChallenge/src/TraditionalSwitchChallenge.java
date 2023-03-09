public class TraditionalSwitchChallenge {
    public static void main(String[] args) {
        char letter = 'x';

        System.out.println(letterToNATO(letter));
    }
    public static String letterToNATO(char letter) {
        switch (letter) {
            case 'A':
            case 'a':
                return "ALPHA";
            case 'B':
            case 'b':
                return "BRAVO";
            case 'C':
            case 'c':
                return "CHARLIE";
            case 'D':
            case 'd':
                return "DELTA";
            case 'E':
            case 'e':
                return "ECHO";
            case 'F':
            case 'f':
                return "FOXTROT";
            default:
                return "error: not allowed";
        }
    }
}
