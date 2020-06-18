package com.exam.sys.services.interfaces;

import java.util.List;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.Paper;
import com.exam.model.Subject;

public interface IPaperService {
	/**
	 * 生成试卷功能
	 * @param paper
	 * @return
	 */
	public Integer addpaper(Paper paper);
	/**
	 * 查询全部试题
	 * @param paper
	 * @return
	 */
	public Pager<Paper> list(Paper paper, PageControl pc);
	
	/**
	 * 查询试题内容
	 * @param paper
	 * @return
	 */
	public List<Subject> subjectlist(Paper paper);
	
	/**
	 * 查询全部试题(首页)
	 * @param paper
	 * @return
	 */
	public List<Paper> list(Paper paper);
}
