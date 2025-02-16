package com.example.demo.mapper;

import com.example.demo.entity.UserRole;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.vo.UserRoleInfo;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * <p>
 * 用户角色关系表 Mapper 接口
 * </p>
 *
 * @author Dumese
 * @since 2025-02-16
 */
public interface UserRoleMapper extends BaseMapper<UserRole> {
    @Select("select u.id, u.username, r.role_name from user_role ur left join user u on ur.user_id = u.id left join role r on ur.role_id = r.id where u.status = 1 and ur.status = 1 and r.status = 1 and u.username = #{username};")
    List<UserRoleInfo> getUserRoleInfo(String username);
}
