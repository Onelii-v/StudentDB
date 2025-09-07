import java.sql.*;

public class UpdateDelete {
    public void updateStudent(Student student) {
            String sql = "UPDATE students SET name=?, age=?, course=? WHERE id=?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setString(1, student.getName());
                ps.setInt(2, student.getAge());
                ps.setString(3, student.getCourse());
                ps.setInt(4, student.getId());
                ps.executeUpdate();
                System.out.println("✅ Student updated successfully!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void deleteStudent(int id) {
            String sql = "DELETE FROM students WHERE id=?";
            try (Connection con = DBConnection.getConnection();
                 PreparedStatement ps = con.prepareStatement(sql)) {

                ps.setInt(1, id);
                ps.executeUpdate();
                System.out.println("✅ Student deleted successfully!");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

