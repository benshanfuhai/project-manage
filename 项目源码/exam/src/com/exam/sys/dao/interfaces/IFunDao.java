package com.exam.sys.dao.interfaces;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.SysFunction;

public interface IFunDao {

	/**
	 * 增加系统功能
	 * @param fun
	 * @return
	 */
	public Integer addfun(SysFunction fun);
	/**
	 * 查询系统功能列表
	 * @param fun
	 * @return
	 */
	public Pager<SysFunction> list(SysFunction fun, PageControl pc);
	/**
	 * 获取系统功能详细信息
	 * @param fun
	 * @return
	 */
	public SysFunction detail(SysFunction fun);
	/**
	 * 修改系统功能
	 * @param fun
	 * @return
	 */
	public Integer edit(SysFunction fun);
	
}
