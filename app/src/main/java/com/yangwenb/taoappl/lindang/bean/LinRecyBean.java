package com.yangwenb.taoappl.lindang.bean;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class LinRecyBean {
    private int LinpicId;
    private String lin_title;
    private String lin_text;

    public int getLinpicId() {
        return LinpicId;
    }

    public String getLin_title() {
        return lin_title;
    }

    public String getLin_text() {
        return lin_text;
    }

    public LinRecyBean(int linpicId, String lin_title, String lin_text) {
        LinpicId = linpicId;
        this.lin_title = lin_title;
        this.lin_text = lin_text;
    }

    public LinRecyBean() {
    }

    public void setLinpicId(int linpicId) {
        LinpicId = linpicId;
    }

    public void setLin_title(String lin_title) {
        this.lin_title = lin_title;
    }

    public void setLin_text(String lin_text) {
        this.lin_text = lin_text;
    }
}
