package cn.itcast.service.mapper;

import cn.itcast.service.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository
public interface UserMapper {
    @Select("select * from tb_user where id=#{id}")
    public User findById(Integer id);
}
