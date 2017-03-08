package geoquiz.android.bignerdranch.com.geoquiz;

/**
 * Created by Paul.Thompson on 3/7/2017.
 */

public class Question {

    private int mTestResId;
    private boolean mAnswerTrue;

    public Question(int testResId, boolean answerTrue) {
        mTestResId = testResId;
        mAnswerTrue = answerTrue;

    }

    public void setTestResId(int testResId) {
        mTestResId = testResId;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTestResId() {
        return mTestResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
}
