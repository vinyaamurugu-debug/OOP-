interface CourseVinyaa {
    void startCourse();
    void completeCourse();
}

// Programming Course
class Programming51 implements CourseVinyaa {
    public void startCourse() {
        System.out.println("Programming Course Started: Access to coding videos and IDE");
    }

    public void completeCourse() {
        System.out.println("Programming Course Completed: Certificate generated with project");
    }
}

// Design Course
class Design51 implements CourseVinyaa {
    public void startCourse() {
        System.out.println("Design Course Started: Access to UI/UX tools");
    }

    public void completeCourse() {
        System.out.println("Design Course Completed: Portfolio submission required");
    }
}

// Marketing Course
class Marketing51 implements CourseVinyaa {
    public void startCourse() {
        System.out.println("Marketing Course Started: Case studies and strategy lessons");
    }

    public void completeCourse() {
        System.out.println("Marketing Course Completed: Campaign analysis submitted");
    }
}

public class Mainfullabstract {
    public static void main(String[] args) {
        CourseVinyaa course;

        course = new Programming51();
        course.startCourse();
        course.completeCourse();

        System.out.println();

        course = new Design51();
        course.startCourse();
        course.completeCourse();

        System.out.println();

        course = new Marketing51();
        course.startCourse();
        course.completeCourse();
    }
}