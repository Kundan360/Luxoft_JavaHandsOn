package com.kundan.LearnToday.DAO;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kundan.LearnToday.model.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Integer> {
	 @Modifying
	 @Transactional
     @Query("delete from Student where enrollmentId=?1")
	 void deleteByEnrollmentId(Integer enrollmentId);

	 boolean existsByEnrollmentId(Integer enrollmentId);

	void deleteAllByEnrollmentId(Integer enrollmentId);

	
     
	
/*	@Modifying
	@Transactional
	@Query("update student st SET st.course_id=:courseId where st.student_id=:studentId")
	void updaterow(@Param("courseId") Integer courseId,@Param("studentId") Integer studentId);    
	@Transactional
	@Modifying
	@Query("update student st set st.course_id=?2 where st.student_id=?2")
	void updaterow(Integer courseId,Integer studentId); */

}
