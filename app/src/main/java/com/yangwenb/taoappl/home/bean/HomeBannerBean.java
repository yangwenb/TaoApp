package com.yangwenb.taoappl.home.bean;

import java.util.List;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class HomeBannerBean {

    /**
     * code : 200
     * topic : [{"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=443cb0b4b4c83916dc27d7e632c8a6c0&imgtype=0&src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg","attention_count":85,"read_count":30,"id":3},{"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg\r\nhttps://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg\r\n","attention_count":52,"read_count":60,"id":4},{"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg","attention_count":74,"read_count":20,"id":2},{"image":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=ee01a11c8b2a3ab1aa31b7c05a64e4fd&imgtype=0&src=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg","attention_count":90,"read_count":50,"id":1},{"image":"http://img2.cheshi-img.com/product/1_1024/p/36200/36297/53549cd420efa.jpg","attention_count":50,"read_count":85,"id":6}]
     */

    private int code;
    private List<TopicBean> topic;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<TopicBean> getTopic() {
        return topic;
    }

    public void setTopic(List<TopicBean> topic) {
        this.topic = topic;
    }

    public static class TopicBean {
        /**
         * image : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1558012412966&di=443cb0b4b4c83916dc27d7e632c8a6c0&imgtype=0&src=http%3A%2F%2Fpic32.nipic.com%2F20130823%2F13339320_183302468194_2.jpg
         * attention_count : 85
         * read_count : 30
         * id : 3
         */

        private String image;
        private int attention_count;
        private int read_count;
        private int id;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getAttention_count() {
            return attention_count;
        }

        public void setAttention_count(int attention_count) {
            this.attention_count = attention_count;
        }

        public int getRead_count() {
            return read_count;
        }

        public void setRead_count(int read_count) {
            this.read_count = read_count;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
