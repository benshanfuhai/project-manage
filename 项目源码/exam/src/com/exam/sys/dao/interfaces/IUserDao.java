package com.exam.sys.dao.interfaces;

import java.util.List;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.SysFunction;
import com.exam.model.Sysuser;

public interface IUserDao {

	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	public Sysuser login(Sysuser user);
	/**
	 * 初始化用户功能列表
	 * @param user
	 * @return
	 */
	public List<SysFunction> initpage(Sysuser user);
	/**
	 * 获取系统用户列表
	 * @param role
	 * @return
	 */
	public Pager<Sysuser> list(Sysuser user, PageControl pc);
	/**
	 * 新增用户
	 * @param role
	 * @return
	 */
	public Integer add(Sysuser user);
	/**
	 * 获取用户详细信息
	 * @param role
	 * @return
	 */
	public Sysuser detail(Sysuser user);
	/**
	 * 修改用户功能
	 * @param fun
	 * @return
	 */
	public Integer edit(Sysuser user);
	/**
	 * 修改用户密码功能
	 * @param user
	 * @return
	 */
	public Integer editpwd(Sysuser user);
	
	/**
	 * 学生登陆
	 * @param user
	 * @return
	 */
	public Sysuser stulogin(Sysuser user);
}
