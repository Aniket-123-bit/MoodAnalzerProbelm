package com.aniket.moodanalyzer;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class MoodAnalyzerTest {

    /**
     * Purpose : Analyse mood by passing the message in the constructor
     * Input message: This is a sad message
     * @return : SAD
     */

    @Test
    public void testMoodAnalysis_whenMoodIsSad() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a sad message");
        String mood = moodAnalyzer.analyseMood();
        Assertion.assertThat(mood, CoreMatchers.is("SAD"));
    }

    /**
     * Purpose : Analyse mood by passing the message in the constructor
     * Input message: This is a happy message
     * @return : HAPPY
     */

    @Test
    public void testMoodAnalysis_whenMoodIsHappy() {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is a happy message");
        String mood = moodAnalyzer.analyseMood();
        Assertion.assertThat(mood, CoreMatchers.is("HAPPY"));
    }

}
