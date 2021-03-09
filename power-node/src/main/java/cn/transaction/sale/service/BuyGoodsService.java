package cn.transaction.sale.service;

/**
 * 购买商品的业务层实现
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/9 10:27
 */
public interface BuyGoodsService {
    /**
     * 购买商品
     * @param goodsId 商品id
     * @param amount 商品数量
     */
    void buy(Integer goodsId,Integer amount);
}
