package Lecture17;

public class HeapClient {
    public static void main(String[] args) {
//        Heap<Integer> heap = new Heap<>();
//        heap.add(35);
//        heap.add(30);
//        heap.add(25);
//        heap.add(20);
//        heap.add(15);
//        heap.add(10);
//        heap.add(5);
//        heap.add(8);
//        heap.add(12);
//        heap.display();
//        System.out.println("****************************************");
//        heap.add(45);
//        heap.display();

//        Heap<Student> heap = new Heap<>();
//        heap.add(new Student("A", 2, 100));
//        heap.add(new Student("B", , 100));
//        heap.add(new Student("C", 2, 100));
//        heap.add(new Student("D", 2, 100));
//        heap.add(new Student("E", 2, 100));
//        heap.add(new Student("F", 2, 100));
//        heap.add(new Student("G", 2, 100));
//        heap.add(new Student("H", 2, 100));
//        heap.add(new Student("I", 2, 100));
//        heap.display();


        Integer[] arr = {2, 3, 5, 7, 6, 1};
        Heap<Integer> heap = new Heap<>(arr, false);
        heap.display();

    }


//    static class Student implements Comparable<Student> {
//        String name;
//        int rollno;
//        int marks;
//
//        public Student(String name, int rollno, int marks) {
//            this.name = name;
//            this.rollno = rollno;
//            this.marks = marks;
//        }
//
//        public int CompareTo(Student o) {
//            return this.marks - o.marks;
//        }
//
//        public String toString() {
//            return "{name=" + this.name + ", marks=" + this.marks + ", rollno=" + this.rollno;
//        }
//    }
}
