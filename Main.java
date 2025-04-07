import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Иванов Иван Иванович", 2022, "ул. Пушкина 10", "+79261234567", 3, "Информатика");
        students[1] = new Student("Петров Петр Петрович", 2021, "ул. Лермонтова 5", "+79269876543", 2, "Математика");
        students[2] = new Student("Сидорова Мария Сергеевна", 2019, "пр. Гагарина 15", "+79267778899", 4, "Информатика");

        System.out.println("Список всех студентов:");
        for (Student student : students) {
            System.out.println(student.getFio());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nВведите факультет для поиска:");
        String faculty = scanner.nextLine();
        System.out.println("Студенты факультета " + faculty + ":");
        for (Student student : students) {
            if (student.getFaculty().equalsIgnoreCase(faculty)) {
                System.out.println(student.getFio());
            }
        }

        System.out.println("\nВведите год для поиска студентов, поступивших после него:");
        int year = scanner.nextInt();
        System.out.println("Студенты, поступившие после " + year + " года:");
        for (Student student : students) {
            if (student.getAdmissionDate() > year) {
                System.out.println(student.getFio());
            }
        }

        scanner.close();
    }
}

class Student {
    private String fio;
    private final int admissionDate;
    private final String address;
    private String phone;
    private int course;
    private final String faculty;

    public Student(String fio, int admissionDate, String address, String phone, int course, String faculty) {
        this.fio = fio;
        this.admissionDate = admissionDate;
        this.address = address;
        this.phone = phone;
        this.course = course;
        this.faculty = faculty;
    }

    // Геттеры и сеттеры согласно условиям задачи
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAdmissionDate() {
        return admissionDate;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFaculty() {
        return faculty;
    }
}