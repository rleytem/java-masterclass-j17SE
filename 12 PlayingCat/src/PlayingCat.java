public class PlayingCat {
    public static void main(String[] args) {
        //test cases
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }
//    The cats spend most of the day playing. In particular, they play if the temperature is
//    between 25 and 35 (inclusive). Unless it is summer, then the upper limit is 45 (inclusive) instead of 35.

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else if (summer == true && (temperature >= 25 && temperature <= 45)) {
            return true;
        } else {
            return false;
        }
    }
}
