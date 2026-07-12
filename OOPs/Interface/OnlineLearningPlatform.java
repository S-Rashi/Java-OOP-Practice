/*
 * ============================================================
 * Project: Online Learning Platform
 * ============================================================
 *
 * Description:
 * This project simulates an online learning platform where
 * different courses such as Programming, Design, and AI
 * implement a common LearningPlatform interface. Each course
 * provides its own implementation for student enrollment,
 * course launch, and certificate generation while sharing
 * common course details through an abstract class.
 *
 * Key Concepts:
 * - Interfaces
 * - Interface Implementation
 * - Abstract Class
 * - Method Overriding
 * - Runtime Polymorphism
 *
 * ============================================================
 */

package OOPs.Interface;
interface LearningPlatform {

    void enrollStudent();

    void startCourse();

    void generateCertificate();
}

abstract class Course {

    protected int courseId;
    protected String courseName;
    protected String instructor;

    Course(int courseId,
           String courseName,
           String instructor) {

        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    void displayCourseInfo() {

        System.out.println("Course ID      : " + courseId);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Instructor     : " + instructor);
    }
}

class ProgrammingCourse extends Course
        implements LearningPlatform {

    ProgrammingCourse(int id,
                      String name,
                      String instructor) {

        super(id, name, instructor);
    }

    @Override
    public void enrollStudent() {

        System.out.println("Student enrolled in Programming Course.");
    }

    @Override
    public void startCourse() {

        System.out.println("Launching Online Coding IDE...");
    }

    @Override
    public void generateCertificate() {

        System.out.println("Programming Certificate Generated.");
    }
}

class DesignCourse extends Course
        implements LearningPlatform {

    DesignCourse(int id,
                 String name,
                 String instructor) {

        super(id, name, instructor);
    }

    @Override
    public void enrollStudent() {

        System.out.println("Student enrolled in Design Course.");
    }

    @Override
    public void startCourse() {

        System.out.println("Opening Design Studio...");
    }

    @Override
    public void generateCertificate() {

        System.out.println("Design Certificate Generated.");
    }
}

class AICourse extends Course
        implements LearningPlatform {

    AICourse(int id,
             String name,
             String instructor) {

        super(id, name, instructor);
    }

    @Override
    public void enrollStudent() {

        System.out.println("Student enrolled in AI Course.");
    }

    @Override
    public void startCourse() {

        System.out.println("Starting GPU Lab Environment...");
    }

    @Override
    public void generateCertificate() {

        System.out.println("AI Certificate Generated.");
    }
}

public class OnlineLearningPlatform {

    public static void main(String[] args) {

        Course[] courses = {

                new ProgrammingCourse(
                        101,
                        "Java Programming",
                        "Rashi"),

                new DesignCourse(
                        102,
                        "UI/UX Design",
                        "Priya"),

                new AICourse(
                        103,
                        "Machine Learning",
                        "Ankit")
        };

        LearningPlatform[] platform = {

                new ProgrammingCourse(
                        101,
                        "Java Programming",
                        "Rashi"),

                new DesignCourse(
                        102,
                        "UI/UX Design",
                        "Priya"),

                new AICourse(
                        103,
                        "Machine Learning",
                        "Ankit")
        };

        for (int i = 0; i < courses.length; i++) {

            courses[i].displayCourseInfo();

            platform[i].enrollStudent();

            platform[i].startCourse();

            platform[i].generateCertificate();

            System.out.println(
                    "--------------------------------------");
        }
    }
}