package JavaK86.core.Bai5.StudentManagement;

public class StudentManagement {
    public static void main(String[] args) {
        Student cuong = new Student();
        cuong.setDiemToan(9.0f);
        cuong.setDiemLy(8.0f);
        cuong.setDiemHoa(8);

        cuong.tinhGPA();

        System.out.println("GPA cuong: "+cuong.getDiemGPA());
        System.out.println("Xep loai: "+cuong.getXepLoai());
    }
}
