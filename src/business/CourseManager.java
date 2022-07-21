package business;

import java.util.ArrayList;
import java.util.List;

import oop.Course;

public class CourseManager {
		List<Course> courses = new ArrayList<>();

		public void addCourse(Course course) {
			courses.add(course);
		}

		public List<Course> getCourse() {
			return courses;
		}

	}