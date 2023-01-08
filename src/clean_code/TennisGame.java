package clean_code;


    public class TennisGame {

        public static String getScore(int mScore1, int mScore2) {
            String score = "";
            final int zero = 0;
            int tempScore = zero;
            final int one = 1;

            final int two = 2;
            final int three = 3;
            if (mScore1 == mScore2) {
                switch (mScore1) {
                    case zero:
                        score = "Love-All";
                        break;
                    case one:
                        score = "Fifteen-All";
                        break;
                    case two:
                        score = "Thirty-All";
                        break;
                    case three:
                        score = "Forty-All";
                        break;
                    default:
                        score = "Deuce";
                        break;

                }
            } else {
                int four = 4;
                if (mScore1 >= four || mScore2 >= four) {
                    score = getString(mScore1, mScore2);
                } else {
                    for (int i = one; i < three; i++) {
                        if (i == one) tempScore = mScore1;
                        else {
                            score += "-";
                            tempScore = mScore2;
                        }
                        switch (tempScore) {
                            case zero:
                                score += "Love";
                                break;
                            case one:
                                score += "Fifteen";
                                break;
                            case two:

                                score += "Thirty";
                                break;
                            case three:
                                score += "Forty";
                                break;
                        }
                    }
                }
            }
            return score;
        }

        private static String getString(int mScore1, int mScore2) {
            String score;
            int minusResult = mScore1 - mScore2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
            return score;
        }
    }

