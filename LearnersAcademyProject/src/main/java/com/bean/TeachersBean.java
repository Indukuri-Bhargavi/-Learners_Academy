package com.bean;

public class TeachersBean {

		String teacherId;
		String teacherName;
		String teacherSubject;
		int teacherClass;
		public TeachersBean(String teacherId, String teacherName, String teacherSubject, int teacherClass) {
			super();
			this.teacherId = teacherId;
			this.teacherName = teacherName;
			this.teacherSubject = teacherSubject;
			this.teacherClass = teacherClass;
		}
		public String getTeacherId() {
			return teacherId;
		}
		public void setTeacherId(String teacherId) {
			this.teacherId = teacherId;
		}
		public String getTeacherName() {
			return teacherName;
		}
		public void setTeacherName(String teacherName) {
			this.teacherName = teacherName;
		}
		public String getTeacherSubject() {
			return teacherSubject;
		}
		public void setTeacherSubject(String teacherSubject) {
			this.teacherSubject = teacherSubject;
		}
		public int getTeacherClass() {
			return teacherClass;
		}
		public void setTeacherClass(int teacherClass) {
			this.teacherClass = teacherClass;
		}
		@Override
		public String toString() {
			return "[teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherSubject="
					+ teacherSubject + ", teacherClass=" + teacherClass + "]";
		}
		
		
}
