package www.panda.com.mall.entity;

public class MyProduct {

    private String name;

    private int pic_url;

    public MyProduct(String name, int pic_url) {
        this.name = name;
        this.pic_url = pic_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPic_url() {
        return pic_url;
    }

    public void setPic_url(int pic_url) {
        this.pic_url = pic_url;
    }
}
