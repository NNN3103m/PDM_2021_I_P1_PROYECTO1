package hn.edu.ujcv.pdm_2021_i_p1_proyecto1;

public class NextWordToFind {
    private String nextWordToFind() {
        return WORDS[RANDOM.nextInt(WORDS.length)];
    }
}
