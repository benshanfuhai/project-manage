package com.exam.sys.services.impl;

import java.util.List;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.Paper;
import com.exam.model.Subject;
import com.exam.sys.services.interfaces.IPaperService;
import com.exam.sys.dao.interfaces.IPaperDao;
import com.exam.sys.dao.impl.PaperDao;

public class PaperService implements IPaperService {
	
	IPaperDao dao = new PaperDao();
	@Override
	public Integer addpaper(Paper paper) {
		// TODO Auto-generated method stub
		return dao.addpaper(paper);
	}
	@Override
	public Pager<Paper> list(Paper paper, PageControl pc) {
		// TODO Auto-generated method stub
		return dao.list(paper, pc);
	}
	@Override
	public List<Subject> subjectlist(Paper paper) {
		// TODO Auto-generated method stub
		return dao.subjectlist(paper);
	}
	@Override
	public List<Paper> list(Paper paper) {
		// TODO Auto-generated method stub
		return dao.list(paper);
	}
}
