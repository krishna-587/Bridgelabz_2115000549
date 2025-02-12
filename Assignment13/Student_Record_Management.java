class Node {
    int rollNo;
    char Grade;
    String name;
    int age;
    Node next;

    public Node(int rollNo, char Grade, String name, int age) {
        this.rollNo = rollNo;
        this.Grade = Grade;
        this.name = name;
        this.age = age;
        this.next = null;
    }
}

class Student_Record_Management {
    Node head = null;

    public void addDataAtBegin(int rollNo, char Grade, String name, int age) {
        Node n = new Node(rollNo, Grade, name, age);
        n.next = head;
        head = n;
    }

    public void addDataAtLast(int rollNo, char Grade, String name, int age) {
        Node n = new Node(rollNo, Grade, name, age);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }

    public void addDataAtPosition(int rollNo, char Grade, String name, int age, int pos) {
        Node n = new Node(rollNo, Grade, name, age);
        if (pos == 1 || head == null) {
            n.next = head;
            head = n;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }
        n.next = temp.next;
        temp.next = n;
    }

    public void deleteData(int rollNo) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.rollNo == rollNo) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found");
    }

    public void searchData(int rollNo) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                System.out.println("Name: " + temp.name);
                System.out.println("Age: " + temp.age);
                System.out.println("Grade: " + temp.Grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }

    public void updateGrade(int rollNo, char newGrade) {
        if (head == null) {
            System.out.println("No data");
            return;
        }
        Node temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) {
                temp.Grade = newGrade;
                System.out.println("Updated Grade: " + temp.Grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Record not found.");
    }

    public void displayDetails() {
        if (head == null) {
            System.out.println("No student records to display.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("Name: " + temp.name);
            System.out.println("Roll Number: " + temp.rollNo);
            System.out.println("Age: " + temp.age);
            System.out.println("Grade: " + temp.Grade);
            System.out.println("-------------------------");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Student_Record_Management record = new Student_Record_Management();
        
        record.addDataAtBegin(25, 'A', "Krishna", 23);
        record.addDataAtLast(26, 'B', "Nitin", 22);
        record.addDataAtPosition(27, 'C', "Abhay", 21, 2);
        record.displayDetails();

        record.searchData(26);
        record.updateGrade(27, 'A');
        record.displayDetails();

        record.deleteData(25);
        record.displayDetails();
    }
}
