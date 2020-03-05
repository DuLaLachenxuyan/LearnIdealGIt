package com.test.mapper;

import com.test.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Hao Chen
 * @version v1.0.0
 * @Package : com.test.mappers
 * @Description : TODO
 * @Create on : 2020/3/5 0005 16:37
 **/
@Mapper
public interface UserMapper {

    User getUserById(Integer id);
}
