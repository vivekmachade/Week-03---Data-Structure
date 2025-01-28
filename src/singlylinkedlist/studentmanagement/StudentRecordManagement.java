package singlylinkedlist.studentmanagement;

class StudentLinkedList {
    private StudentNode head;

    // Add Student at the Beginning
    public void addAtBeginning(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add Student at the End
    public void addAtEnd(int rollNumber, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add Student at a Specific Position
    public void addAtPosition(int position, int rollNumber, String name, int age, char grade) {
        if (position <= 0) {
            System.out.println("Invalid position. Must be greater than 0.");
            return;
        }
        if (position == 1) {
            addAtBeginning(rollNumber, name, age, grade);
            return;
        }
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        StudentNode temp = head;
        for (int i = 1; i < position - 1; i++) {
            if (temp == null) {
                System.out.println("Position out of bounds.");
                return;
            }
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete a Student by Roll Number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search for a Student by Roll Number
    public StudentNode searchByRollNumber(int rollNumber) {
        StudentNode temp = head;
        while (temp != null) {
            if (temp.rollNumber == rollNumber) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Update Grade by Roll Number
    public void updateGradeByRollNumber(int rollNumber, char newGrade) {
        StudentNode student = searchByRollNumber(rollNumber);
        if (student != null) {
            student.grade = newGrade;
            System.out.println("Grade updated successfully.");
        } else {
            System.out.println("Student with Roll Number " + rollNumber + " not found.");
        }
    }

    // Display All Student Records
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }
        StudentNode temp = head;
        while (temp != null) {
            System.out.println("Roll Number: " + temp.rollNumber + ", Name: " + temp.name +
                    ", Age: " + temp.age + ", Grade: " + temp.grade);
            temp = temp.next;
        }
    }
}

// Main Class to Test the Linked List
public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList studentList = new StudentLinkedList();

        // Adding students
        studentList.addAtBeginning(1, "Alice", 20, 'A');
        studentList.addAtEnd(2, "Bob", 21, 'B');
        studentList.addAtPosition(2, 3, "Charlie", 19, 'C');

        // Displaying all students
        System.out.println("Student Records:");
        studentList.displayAll();

        // Searching for a student
        StudentNode student = studentList.searchByRollNumber(2);
        if (student != null) {
            System.out.println("Found: Roll Number: " + student.rollNumber + ", Name: " + student.name);
        } else {
            System.out.println("Student not found.");
        }

        // Updating grade
        studentList.updateGradeByRollNumber(1, 'A');

        // Deleting a student
        studentList.deleteByRollNumber(2);

        // Displaying all students after deletion
        System.out.println("\nStudent Records After Deletion:");
        studentList.displayAll();
    }
}
