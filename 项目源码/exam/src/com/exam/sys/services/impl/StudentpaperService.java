package com.exam.sys.services.impl;

import java.util.List;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.Studentpaper;
import com.exam.model.Subject;
import com.exam.sys.dao.impl.StudentpaperDao;
import com.exam.sys.dao.interfaces.IStudentpaperDao;
import com.exam.sys.services.interfaces.IStudentpaperService;

public class StudentpaperService implements IStudentpaperService {
	IStudentpaperDao dao = new StudentpaperDao();

	@Override
	public Integer addPaper(Studentpaper studentpaper) {
		// TODO Auto-generated method stub
		return dao.addPaper(studentpaper);
	}

	@Override
	public Pager<Subject> list(Studentpaper studentpaper, PageControl pc){
		// TODO Auto-generated method stub
		return dao.list(studentpaper, pc);
	}

	@Override
	public List<Studentpaper> listByRightcount(Studentpaper studentpaper) {
		// TODO Auto-generated method stub
		return dao.listByRightcount(studentpaper);
	}

	@Override
	public List<Studentpaper> StudentPaperList(Studentpaper studentpaper) {
		// TODO Auto-generated method stub
		return dao.StudentPaperList(studentpaper);
	}



}
