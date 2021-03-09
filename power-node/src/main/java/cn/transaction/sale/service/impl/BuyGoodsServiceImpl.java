package cn.transaction.sale.service.impl;

import cn.transaction.sale.bean.Goods;
import cn.transaction.sale.bean.Sale;
import cn.transaction.sale.dao.GoodsDao;
import cn.transaction.sale.dao.SaleDao;
import cn.transaction.sale.exception.NotEnoughException;
import cn.transaction.sale.service.BuyGoodsService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * 购买商品业务的实现
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/9 10:29
 */
@Component("buyService")
public class BuyGoodsServiceImpl implements BuyGoodsService {
    @Resource
    private GoodsDao goodsDao;
    @Resource
    private SaleDao saleDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    /**
     * 购买商品
     *
     * @param goodsId 商品id
     * @param amount  商品数量
     */
    @Transactional(propagation = Propagation.REQUIRED,
    rollbackFor = {NotEnoughException.class,NullPointerException.class})
    @Override
    public void buy(Integer goodsId, Integer amount) {
        /*商品销售*/
        Sale sale = new Sale(goodsId, amount);
        saleDao.insertSale(sale);
        /*商品减量*/
        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null) {
            throw new NotEnoughException("无此商品");
        }
        if (goods.getAmount() < amount) {
            throw new NotEnoughException("库存不足");
        }
        goods = new Goods();
        goods.setId(goodsId);
        goods.setAmount(amount);
        goodsDao.updateGoods(goods);
    }
}
