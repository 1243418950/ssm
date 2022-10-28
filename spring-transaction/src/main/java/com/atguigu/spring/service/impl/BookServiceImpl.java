package com.atguigu.spring.service.impl;

import com.atguigu.spring.dao.BookDao;
import com.atguigu.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(
//            readOnly = false,
//            timeout = 3
            noRollbackFor = {java.lang.ArithmeticException.class},
            propagation = Propagation.REQUIRES_NEW

    )
    //事务管理注解，使其保持原子性
    public void buyBook(Integer userId, Integer bookId) {
//        try {
//            TimeUnit.SECONDS.sleep(5);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //查询图书价格
        Integer price = bookDao.getPriceByBookId(bookId);

        //更新图书库存
        bookDao.updateStock(bookId);
//        更新用户余额
        bookDao.updateBalance(userId, price);
//        System.out.println(1/0);
    }
}
