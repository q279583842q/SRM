package com.sxt.teach.dto;

import com.sxt.teach.pojo.ClassBean;

public class ClassesDto extends ClassBean {

	// ҳ����1��ʼ
	private int page;

	// ÿҳ��¼�� ��ҳ������
	private int rows;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}
}