/**
 * Purpose : Given a message, ability to analyse and respond HAPPY or SAD mood
 *
 * @parameter : message
 * @return : HAPPY or SAD
 *
 * @author: ANIKET RAIKWAR
 * @since: 02.07.2021
 */
package com.aniket.moodanalyzer;

public class MoodAnalyzer {

    public String analyseMood(String message){
        if (message.contains("sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
