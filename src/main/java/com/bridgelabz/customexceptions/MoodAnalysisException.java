package com.bridgelabz.customexceptions;

public class MoodAnalysisException extends Exception {
    enum ExceptionType {ENTERED_NULL, ENTERED_EMPTY}
    ExceptionType type;

    public MoodAnalysisException(String message) {
        super(message);
    }

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
