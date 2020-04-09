package com.sample.model;

import java.util.Date;

public class Paper {
    private String name;        // 申請者名
    private Integer paperId;    // 申請書ID
    private String paperType;   // 申請書タイプ
	private Date submitDate;    // 申請日
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPaperId() {
		return paperId;
	}
	public void setPaperId(Integer paperId) {
		this.paperId = paperId;
	}
	public String getPaperType() {
		return paperType;
	}
	public void setPaperType(String paperType) {
		this.paperType = paperType;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	@Override
	public String toString() {
		return "Paper [name=" + name + ", paperId=" + paperId + ", paperType=" + paperType + ", submitDate="
				+ submitDate + "]";
	}	
}