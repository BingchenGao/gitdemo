package com.soft1841.oop.book;

import cn.hutool.db.Entity;

import java.sql.SQLException;
import java.util.List;

/**
 * 图书类的数据访问对象
 * Book Data access object
 * 用来定义增删改查

 */
public interface BookDAO {
    /**
     * 查询所有图书信息
     * @return
     */
    List<Entity> getAllBooks()throws SQLException;

    /**
     * 新增图书，如果成功返回1，否则返回0
     * @param book
     * @return
     * @throws SQLException
     */

    int insert(Book book) throws SQLException;

    int delete(int id) throws SQLException;

    /**
     * 修改榆树信息
     * @param book
     * @return
     * @throws SQLException
     */

    int update(Book book) throws SQLException;
}
