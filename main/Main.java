public class Main {
   public static void main(String[] args) {
       
       AttendanceSystem attendanceSystem = new AttendanceSystem();
       GradingSystem gradingSystem = new GradingSystem();
       LibrarySystem librarySystem = new LibrarySystem();

      
       SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(attendanceSystem);
       SchoolManagementApp gradingAdapter = new GradingSystemAdapter(gradingSystem);
       SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(librarySystem);

       
       attendanceAdapter.integrateSystem("11123");
       gradingAdapter.integrateSystem("07151", "J");
       libraryAdapter.integrateSystem("Book_1", "ADD");
   }
}
