package com.project.Backend.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;

@Document(collection = "results")
public class Result {
	@Id
	String id;
	List<String> ans;
	String batch;
	String branch;
	String semester;
	String coursecode;
	String examType;
	String section;
	
	String username;
	double marks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getCoursecode() {
		return coursecode;
	}
	public void setCoursecode(String coursecode) {
		this.coursecode = coursecode;
	}
	public String getExamType() {
		return examType;
	}
	public void setExamType(String exam_type) {
		this.examType = exam_type;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", batch=" + batch + ", branch=" + branch + ", semester=" + semester
				+ ", coursecode=" + coursecode + ", exam_type=" + examType + ", section=" + section + ", username="
				+ username + "]";
	}
	
	public List<String> getAns() {
		return ans;
	}
	public void setAns(List<String> ans) {
		this.ans = ans;
	}
	
}
