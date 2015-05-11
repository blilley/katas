import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GameTest {

    @Test
    public void score_whenSingleEmptyFrame_returns0() {
        Game game = new Game();
        List<Frame> frameList = Arrays.asList(new Frame());
        int expectedGameScore = 0;

        int actual = game.score(frameList);
        assertThat(actual, is(expectedGameScore));
    }

    @Test
    public void score_whenSingleFrameHasSinglePinRoll_returns1() {
        Game game = new Game();
        Frame frameOne = new Frame();
        frameOne.addRoll(1);
        List<Frame> frameList = Arrays.asList(frameOne);
        int expectedGameScore = 1;

        int actual = game.score(frameList);
        assertThat(actual, is(expectedGameScore));
    }

    @Test
    public void score_whenSingleFrameHasTwoSinglePinRolls_returns2() {
        Game game = new Game();
        Frame frameOne = new Frame();
        frameOne.addRoll(1);
        frameOne.addRoll(1);
        List<Frame> frameList = Arrays.asList(frameOne);
        int expectedGameScore = 2;

        int actual = game.score(frameList);
        assertThat(actual, is(expectedGameScore));
    }

    @Test
    public void score_whenTwoFrameHasTwoPinRolls_returnsSumOfRoles() {
        Game game = new Game();
        Frame frameOne = new Frame();
        frameOne.addRoll(1);
        frameOne.addRoll(1);
        Frame frameTwo = new Frame();
        frameTwo.addRoll(5);
        frameTwo.addRoll(4);
        List<Frame> frameList = Arrays.asList(frameOne,frameTwo);
        int expectedGameScore = 11;

        int actual = game.score(frameList);

        assertThat(actual, is(expectedGameScore));
    }

    @Test
    public void score_WhenSpare_returnsSpareBonusWithNextRoll() {
        Game game = new Game();
        Frame frameOne = new Frame();
        frameOne.addRoll(3);
        frameOne.addRoll(7);
        Frame frameTwo = new Frame();
        frameTwo.addRoll(2);
        frameTwo.addRoll(0);
        int expectedGameScore = 14;
        List<Frame> frameList = new ArrayList<Frame>();
        frameList.add(frameOne);
        frameList.add(frameTwo);

        assertThat(game.score(frameList), is(expectedGameScore));
    }



}