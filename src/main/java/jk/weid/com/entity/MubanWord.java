package jk.weid.com.entity;

//模板的关键词
public class MubanWord
{
    private String number;//编号
    private String keyWord; //关键词
    private String reply; //回复内容

    public MubanWord(){}

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }


    public String getReply() {
        return reply;
    }

    public void setReply(String reply) {
        this.reply = reply;
    }
}
