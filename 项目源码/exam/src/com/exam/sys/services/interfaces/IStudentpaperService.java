package com.exam.sys.services.interfaces;

import java.util.List;

import com.exam.common.PageControl;
import com.exam.common.Pager;
import com.exam.model.Studentpaper;
import com.exam.model.Subject;


public interface IStudentpaperService {
	/**
	 * 查询全部错误试题列表
	 * @param studentpaper
	 * @return
	 */
	public Pager<Subject> list(Studentpaper studentpaper, PageControl pc);
	
	/**
	 * 查询全部正确试题数量(为计算总分)
	 * @param studentpaper
	 * @return
	 */
	public List<Studentpaper>  listByRightcount(Studentpaper studentpaper);
	
	/**
	 * 学生提交答案
	 * @param studentpaper
	 * @return
	 */
	public Integer addPaper(Studentpaper studentpaper);
	
	/**
	 * 学生查看已经做过试卷列表
	 * @param studentpaper
	 * @return
	 */
	public List<Studentpaper> StudentPaperList(Studentpaper studentpaper);
}
