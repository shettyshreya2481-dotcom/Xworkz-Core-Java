class CricbuzzRunner {
    public static void main(String[] args) {

        Cricbuzz cricbuzz = new Cricbuzz();

        cricbuzz.addMatch("India vs Australia");
        cricbuzz.addMatch("England vs Pakistan");
        cricbuzz.addMatch("South Africa vs New Zealand");
        cricbuzz.addMatch("Sri Lanka vs Bangladesh");
        cricbuzz.addMatch("West Indies vs Afghanistan");
        cricbuzz.addMatch("India vs England");
        cricbuzz.addMatch("Australia vs South Africa");
        cricbuzz.addMatch("Pakistan vs New Zealand");
        cricbuzz.addMatch("Bangladesh vs Afghanistan");
        cricbuzz.addMatch("Sri Lanka vs West Indies");
        cricbuzz.addMatch("India vs Pakistan");
        cricbuzz.addMatch("Australia vs England");
        cricbuzz.addMatch("South Africa vs Sri Lanka");
        cricbuzz.addMatch("New Zealand vs Bangladesh");
        cricbuzz.addMatch("Afghanistan vs West Indies");
        cricbuzz.addMatch("India vs New Zealand");
        cricbuzz.addMatch("England vs South Africa");
        cricbuzz.addMatch("Pakistan vs Sri Lanka");
        cricbuzz.addMatch("Australia vs Bangladesh");
        cricbuzz.addMatch("India vs West Indies");

        cricbuzz.displayMatches();
    }
}