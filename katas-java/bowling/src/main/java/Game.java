import java.util.List;

public class Game {
    public int score(List<Frame> frameList){
        int score = 0;
        for (Frame frame : frameList) {
            score += frame.getScore();
            boolean isSpare = frame.fetchSpare();
        }

        return score;
    }
}
