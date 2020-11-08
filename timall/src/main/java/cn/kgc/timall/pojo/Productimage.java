package cn.kgc.timall.pojo;

public class Productimage {
    private Integer productimageId;

    private Byte productimageType;

    private String productimageSrc;

    private Integer productimageProductId;

    public Integer getProductimageId() {
        return productimageId;
    }

    public void setProductimageId(Integer productimageId) {
        this.productimageId = productimageId;
    }

    public Byte getProductimageType() {
        return productimageType;
    }

    public void setProductimageType(Byte productimageType) {
        this.productimageType = productimageType;
    }

    public String getProductimageSrc() {
        return productimageSrc;
    }

    public void setProductimageSrc(String productimageSrc) {
        this.productimageSrc = productimageSrc == null ? null : productimageSrc.trim();
    }

    public Integer getProductimageProductId() {
        return productimageProductId;
    }

    public void setProductimageProductId(Integer productimageProductId) {
        this.productimageProductId = productimageProductId;
    }
}