package cn.transaction.sale.dao;

import cn.transaction.sale.bean.Sale;

/**
 * TODO
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/9 9:57
 */
public interface SaleDao {
    /**
     * 插入销售信息
     * @param sale 销售信息
     * @return 返回插入状态
     */
    int insertSale(Sale sale);
}
