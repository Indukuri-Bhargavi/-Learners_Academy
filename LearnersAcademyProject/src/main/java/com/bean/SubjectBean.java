package com.bean;

public class SubjectBean {

		String subjectCode;
		String subjectName;
		public String getSubjectCode() {
			return subjectCode;
		}
		public void setSubjectCode(String subjectCode) {
			this.subjectCode = subjectCode;
		}
		public String getSubjectName() {
			return subjectName;
		}
		public void setSubjectName(String subjectName) {
			this.subjectName = subjectName;
		}
		public SubjectBean(String subjectCode, String subjectName) {
			super();
			this.subjectCode = subjectCode;
			this.subjectName = subjectName;
		}
		@Override
		public String toString() {
			return "[subjectCode=" + subjectCode + ", subjectName=" + subjectName + "]";
		}
		
}
