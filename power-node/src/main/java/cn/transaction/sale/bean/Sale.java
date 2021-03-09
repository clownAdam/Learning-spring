package cn.transaction.sale.bean;

import org.springframework.stereotype.Component;

/**
 * 销售实体类
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/9 9:52
 */
@Component("sale")
public class Sale {
    private Integer id;
    private Integer gid;
    private Integer nums;

    public Sale() {
        super();
    }

    public Sale(Integer gid, Integer nums) {
        this.gid = gid;
        this.nums = nums;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }
}
