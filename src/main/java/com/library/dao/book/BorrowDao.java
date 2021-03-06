package com.library.dao.book;

import com.library.domain.book.Borrow;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: lixin
 * @Date:   Created in 2018/4/16 19:02
 * @Description:
 * @Email: JustinDellAdam@live.com
 */
public interface BorrowDao {
    /**
     * 增加
     */
    boolean addQuery(String sql, Object[] params) throws SQLException;

    /**
     * 删除
     */
    boolean deleteQuery(String sql, Object[] params) throws SQLException;

    /**
     * 修改
     */
    boolean updateQuery(String sql, Object[] params) throws SQLException;

    /**
     * 查询
     */
    List<Borrow> selectQuery(String sql, Object[] params) throws SQLException;

    /**
     * 根据用户id查询已借书籍借阅信息
     */
    List selectQueryInfo(String sql, Object[] params) throws SQLException;
}
