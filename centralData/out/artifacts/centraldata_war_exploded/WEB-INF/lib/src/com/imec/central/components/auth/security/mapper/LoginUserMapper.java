package com.imec.central.components.auth.security.mapper;


import com.imec.central.components.auth.security.pojo.LoginUser;
import com.imec.central.api.mapper.BaseMapper;




/**
 * spring security安全机制
 * 根据用户名从数据库加载相应用户（user表）
 * 由Mybatis机制－LoginMapperImpl.xml配置文件实现
 * 
 * 20150731
 * 
 * 
 * @author mulan
 *
 */
@BaseMapper
public interface LoginUserMapper{
	
	/**
	 * 根据用户名（登录账户）返回该用户，用户名需要全系统唯一
	 * @param username 用户名（登录账户）
	 * @return 登录用户
	 */
	public LoginUser loadUserByUsername(String username);

}
