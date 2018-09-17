package ca.pandcbank.beans;

public class questionList {
    private int questionNo;
    private String question;

    public questionList() {
    }

    public questionList(int questionNo, String question) {
        this.questionNo = questionNo;
        this.question = question;
    }

    public int getQuestionNo() {
        return questionNo;
    }

    public void setQuestionNo(int questionNo) {
        this.questionNo = questionNo;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
    
}
