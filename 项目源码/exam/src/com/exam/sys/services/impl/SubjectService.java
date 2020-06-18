package com.exam.sys.services.impl;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.Subject;

import com.exam.sys.dao.impl.SubjectDao;

import com.exam.sys.dao.interfaces.ISubjectDao;

import com.exam.sys.services.interfaces.ISubjectService;

public class SubjectService implements ISubjectService {

	ISubjectDao dao = new SubjectDao();
	
	public Integer addsubject(Subject subject) {
		try{
			return dao.addsubject(subject);
		}catch(Exception e){
			throw new RuntimeException();
		}
		
	}

	public Pager<Subject> list(Subject subject, PageControl pc) {
		return dao.list(subject, pc);
	}

	public Integer edit(Subject subject) {
		return dao.edit(subject);
	}

	public Subject detail(Subject subject) {
		// TODO Auto-generated method stub
		return dao.detail(subject);
	}

}

