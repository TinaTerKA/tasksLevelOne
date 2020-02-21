package javaClasses;

// Создать массив объектов. Вывести:
//a) список студентов заданного факультета;
//b) списки студентов для каждого факультета и курса;
//c) список студентов, родившихся после заданного года;
//d) список учебной группы.

import java.util.ArrayList;

public class Solutions {

    public static void main(String[] args){
        accordingToTheDepartment(studentData(), Department.ENGINEERING_AND_ECONOMICS);
        accordingToTheCourse(studentData(), Department.COMMUNICATION_AND_LAV, Course.FIRST);
        accordingYearOfBirth(studentData(), 1980);
        studyGroupList(studentData(), Group.B222);
    }
    private static ArrayList<Student> studentData(){
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student()
                .setLastName("Иванов")
                .setFirstName("Иван")
                .setPatronymic("Иванович")
                .setYearOfBirth(1995)
                .setPhoneNumber(3332233)
                .setCourse(Course.FOURTH)
                .setDepartment(Department.COMMUNICATION_AND_LAV)
                .setGroup(Group.B444)
                .setAddress("Грибоедова 15"));
        students.add(new Student()
                .setLastName("Петров")
                .setFirstName("Пётр")
                .setPatronymic("Петрович")
                .setYearOfBirth(1983)
                .setAddress("Ленинский проспект 18")
                .setPhoneNumber(5550055)
                .setDepartment(Department.ENGINEERING_AND_ECONOMICS)
                .setCourse(Course.FOURTH)
                .setGroup(Group.A444));
        students.add(new Student()
                .setLastName("Сидоров")
                .setFirstName("Антон")
                .setPatronymic("Николаевич")
                .setYearOfBirth(1990)
                .setAddress("Гагарина 2")
                .setPhoneNumber(6598845)
                .setDepartment(Department.ENGINEERING_AND_ECONOMICS)
                .setCourse(Course.FIRST)
                .setGroup(Group.A111));
        students.add(new Student()
                .setLastName("Гаврилов")
                .setFirstName("Инокентий")
                .setPatronymic("Михайлович")
                .setYearOfBirth(1988)
                .setAddress("Матусевича 98")
                .setPhoneNumber(8521456)
                .setDepartment(Department.ENGINEERING_AND_ECONOMICS)
                .setCourse(Course.THIRD)
                .setGroup(Group.A333));
        students.add(new Student()
                .setLastName("Алексеева")
                .setFirstName("Маргарита")
                .setPatronymic("Константиновна")
                .setYearOfBirth(1992)
                .setAddress("Казинца 4")
                .setPhoneNumber(9876523)
                .setDepartment(Department.COMMUNICATION_AND_LAV)
                .setCourse(Course.THIRD)
                .setGroup(Group.B333));
        students.add(new Student()
                .setLastName("Черешкова")
                .setFirstName("Анастасия")
                .setPatronymic("Олеговна")
                .setYearOfBirth(1994)
                .setAddress("Независимости проспект 56")
                .setPhoneNumber(9874556)
                .setDepartment(Department.COMMUNICATION_AND_LAV)
                .setCourse(Course.SECOND)
                .setGroup(Group.B222));
        students.add(new Student()
                .setLastName("Кулешова")
                .setFirstName("Ольга")
                .setPatronymic("Романовна")
                .setYearOfBirth(1989)
                .setAddress("Лесная 8")
                .setPhoneNumber(9998998)
                .setDepartment(Department.ENGINEERING_AND_ECONOMICS)
                .setCourse(Course.SECOND)
                .setGroup(Group.A222));
        students.add(new Student()
                .setLastName("Плугатская")
                .setFirstName("Татьяна")
                .setPatronymic("Марковна")
                .setYearOfBirth(1985)
                .setAddress("Петропавловский сквер 4")
                .setPhoneNumber(3231122)
                .setDepartment(Department.COMMUNICATION_AND_LAV)
                .setCourse(Course.FOURTH)
                .setGroup(Group.B444));
        students.add(new Student()
                .setLastName("Нечётен")
                .setFirstName("Василий")
                .setPatronymic("Васильевич")
                .setYearOfBirth(1991)
                .setAddress("Сухаревская 125")
                .setPhoneNumber(4255442)
                .setDepartment(Department.ENGINEERING_AND_ECONOMICS)
                .setCourse(Course.THIRD)
                .setGroup(Group.A333));
        students.add(new Student()
                .setLastName("Черкасова")
                .setFirstName("Ирина")
                .setPatronymic("Адольфовна")
                .setYearOfBirth(1999)
                .setAddress("Газеты Правды проспект 22")
                .setPhoneNumber(6598777)
                .setDepartment(Department.ENGINEERING_AND_ECONOMICS)
                .setCourse(Course.FIRST)
                .setGroup(Group.A111));
        students.add(new Student()
                .setLastName("Курочкин")
                .setFirstName("Фёдор")
                .setPatronymic("Ростиславович")
                .setYearOfBirth(2000)
                .setAddress("Набережная 4")
                .setPhoneNumber(2225666)
                .setDepartment(Department.COMMUNICATION_AND_LAV)
                .setCourse(Course.FIRST)
                .setGroup(Group.B111));
        return students;
    }

    private static void accordingToTheDepartment(ArrayList<Student> students, Department department){
        ArrayList<Student> communication = new ArrayList<>();
        ArrayList<Student> engineering = new ArrayList<>();
        for (Student student : students) {

            if (student.getDepartment() == Department.COMMUNICATION_AND_LAV) {
                communication.add(student);
            } else if (student.getDepartment() == Department.ENGINEERING_AND_ECONOMICS) {
                engineering.add(student);
            }
        }
        switch (department){
            case ENGINEERING_AND_ECONOMICS:
                System.out.print("Студенты " + department + " факультета: \n");
                for (Student student: engineering) {
                    System.out.println(student);
                } break;
            case COMMUNICATION_AND_LAV:
                System.out.print("Студенты " + department + " факультета: \n");
                for (Student student: communication) {
                    System.out.println(student);
                } break;
                default:
                 System.out.println("Department not found");
        }
    }

    private static void accordingToTheCourse(ArrayList<Student> students, Department department, Course course){
        System.out.print("Студент " + department + " " + course + " курса :\n");
        for (Student student: students) {
            if(student.getDepartment() == department){
                if(student.getCourse() == course){
                    System.out.println(student);
                }
            }
        }
    }

    private static void accordingYearOfBirth(ArrayList<Student> students, int yearOfBirth){
        System.out.print("Born after " + yearOfBirth + " :\n");
        for (Student student: students) {
          if(student.getYearOfBirth() > yearOfBirth){
             System.out.println(student);
          }
        }
    }

    private static void studyGroupList(ArrayList<Student> students, Group group){
        ArrayList<Student> a111 = new ArrayList<>();
        ArrayList<Student> a222 = new ArrayList<>();
        ArrayList<Student> a333 = new ArrayList<>();
        ArrayList<Student> a444 = new ArrayList<>();
        ArrayList<Student> b111 = new ArrayList<>();
        ArrayList<Student> b222 = new ArrayList<>();
        ArrayList<Student> b333 = new ArrayList<>();
        ArrayList<Student> b444 = new ArrayList<>();
        for (Student student: students) {
            switch (student.getGroup()){
                case A111: a111.add(student); break;
                case A222: a222.add(student); break;
                case A333: a333.add(student); break;
                case A444: a444.add(student); break;
                case B111: b111.add(student); break;
                case B222: b222.add(student); break;
                case B333: b333.add(student); break;
                case B444: b444.add(student); break;
                    default:
                        System.out.println("Group not found");
            }
        }
        switch (group){
            case A111: print("Группа инженеров первый курс:\n", a111); break;
            case A222: print("Группа инженеров второй курс:\n", a222); break;
            case A333: print("Группа инженеров третий курс:\n", a333); break;
            case A444: print("Группа инженеров четвертый курс:\n", a444); break;
            case B111: print("Группа правников первый курс:\n", b111); break;
            case B222: print("Группа правников второй курс:\n", b222); break;
            case B333: print("Группа правников третий курс:\n", b333); break;
            case B444: print("Группа правников четвертый курс:\n", b444); break;
        }
    }

    private static void print(String s, ArrayList<Student> students){
            System.out.print(s);
            for (Student student: students) {
                System.out.println(student);
            }
    }
}
