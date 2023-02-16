class Scrabble {

    // Letter                           Value
    // A, E, I, O, U, L, N, R, S, T       1
    // D, G                               2
    // B, C, M, P                         3
    // F, H, V, W, Y                      4
    // K                                  5
    // J, X                               8
    // Q, Z                               10
    String score1 = "AEIOULNRST";
    String score2 = "DG";
    String score3 = "BCMP";
    String score4 = "FHVWY";
    String score5 = "K";
    String score8 = "JX";
    String score10 = "QZ";
    int score = 0;

    Scrabble(String word) {

        for (int i = 0; i < word.length(); i++) {
            CharSequence s = Character.toString(Character.toUpperCase(word.charAt(i)));
            if ( score1.contains(s)){
                score += 1;
            }
            else if ( score2.contains(s)){
                score += 2;
            }
            else if ( score3.contains(s)){
                score += 3;
            }
            else if ( score4.contains(s)){
                score += 4;
            }
            else if ( score5.contains(s)){
                score += 5;
            }
            else if ( score8.contains(s)){
                score += 8;
            }
            else if ( score10.contains(s)){
                score += 10;
            }
        
       }
    }

    int getScore() {
        return score;
    }

}
