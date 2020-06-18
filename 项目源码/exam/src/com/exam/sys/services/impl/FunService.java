package com.exam.sys.services.impl;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.SysFunction;
import com.exam.sys.dao.impl.FunDao;
import com.exam.sys.dao.interfaces.IFunDao;
import com.exam.sys.services.interfaces.IFunService;

public class FunService implements IFunService {

	IFunDao dao = new FunDao();
	
	public Integer addfun(SysFunction fun) {
		return dao.addfun(fun);
	}

	public Pager<SysFunction> list(SysFunction fun, PageControl pc) {
		return dao.list(fun, pc);
	}

	public SysFunction detail(SysFunction fun) {
		return dao.detail(fun);
	}

	public Integer edit(SysFunction fun) {
		return dao.edit(fun);
	}

}
