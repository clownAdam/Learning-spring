package cn.transaction.sale.dao;

import cn.transaction.sale.bean.Goods;

/**
 * TODO
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/9 9:58
 */
public interface GoodsDao {
    /**
     * 更新商品信息
     * @param goods 商品信息
     * @return 返回更新状态
     */
    int updateGoods(Goods goods);

    /**
     * 根据商品编号查找商品信息
     * @param goodsId 商品编号
     * @return 商品信息
     */
    Goods selectGoods(Integer goodsId);
}
