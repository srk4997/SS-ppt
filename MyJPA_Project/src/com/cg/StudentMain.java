package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class StudentMain {
	EntityManagerFactory emf= Persistence.createEntityManagerFactory("MyJPA_Project");
	EntityManager em= emf.createEntityManager();
	
	public static void main(String[] args) {
		
		StudentMain sm =new StudentMain();
		sm.beginTransaction();
		
		
		Student1 student = new Student1();
		student.setName("Shraddha");
		
		sm.addStudent(student);
		student.setName("Teju");
		sm.updateStudent(student);
		//sm.removeStudent(student);
		
		Student1 student2=new Student1();
		student2.setName("Mrunal");
		sm.addStudent(student2);
		
		//student2=sm.getStudentById(2);
		//System.out.println(student2);
		sm.commitTransaction();
		sm.Close();
		
	}
	public Student1 getStudentById(int id) {
		Student1 student=em.find(Student1.class, id);
		return student;
	}
	
	public void addStudent(Student1 student) {
		em.persist(student);
		System.out.println("Student Added to database");
	}
	public void removeStudent(Student1 student) {
		em.remove(student);
	}
	public void updateStudent(Student1 student) {
		em.merge(student);
	}
	public void beginTransaction() {
		em.getTransaction().begin();
	}
	public void commitTransaction() {
		em.getTransaction().commit();
	}
	public void Close() {
		em.close();	
		emf.close();
	}
		
}
