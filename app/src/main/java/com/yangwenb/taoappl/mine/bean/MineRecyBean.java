package com.yangwenb.taoappl.mine.bean;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class MineRecyBean {
    private int pic;
    private String title;
    private String shu;

    public MineRecyBean(int pic, String title, String shu) {
        this.pic = pic;
        this.title = title;
        this.shu = shu;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShu() {
        return shu;
    }

    public void setShu(String shu) {
        this.shu = shu;
    }
}
