import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class stuDao {
	public static Connection getConnection() {
		
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "");
		} catch (SQLException e) {
			System.out.println("connection not established " + e);
		} catch (ClassNotFoundException e) {
			System.out.println("driver not loaded successfully "+e);
		}
		return conn;
	}

	public static int save(stu e1) {
		int status = 0;
		try {
			Connection con1 = stuDao.getConnection();
			PreparedStatement ps1 = con1
					.prepareStatement("insert into stu(id,name,age,course,city) values (?,?,?,?,?)");
			ps1.setInt(1, Integer.parseInt(e1.getId1()));
			ps1.setString(2, e1.getName1());
			ps1.setInt(3, Integer.parseInt(e1.getAge1()));
			ps1.setString(4, e1.getCourse1());
			ps1.setString(5, e1.getCity1());

			status = ps1.executeUpdate();

			con1.close();
		} catch (Exception ex1) {
			System.out.println("insert sql statemnt may not be correct " + ex1);
		}

		return status;
	}

	public static int update1(stu e1) {
		int status = 0;
		try {
			Connection con1 = stuDao.getConnection();
			PreparedStatement ps1 = con1
					.prepareStatement("update stu set id=?, name=?,age=?,course=?,city=? where id=?");
			ps1.setInt(1, Integer.parseInt(e1.getId1()));
			ps1.setString(2, e1.getName1());
			ps1.setInt(3, Integer.parseInt(e1.getAge1()));
			ps1.setString(4, e1.getCourse1());
			ps1.setString(5, e1.getCity1());
			ps1.setInt(6, Integer.parseInt(e1.getId1()));
			

			status = ps1.executeUpdate();

			con1.close();
		} catch (Exception ex1) {
			System.out.println("update sql statemnt may not be correct " + ex1);
		}

		return status;
	}

	public static int delete1(int id1) {
		int status = 0;
		try {
			Connection con1 = stuDao.getConnection();
			PreparedStatement ps1 = con1.prepareStatement("delete from stu where id=?");
			ps1.setInt(1, id1);
			status = ps1.executeUpdate();
			con1.close();
		} catch (Exception ex1) {
			System.out.println("delete sql statemnt may not be correct " + ex1);
		}

		return status;
	}

	public static stu getStudentById(int id1) {
		stu e1 = new stu();

		try {
			Connection con1 = stuDao.getConnection();
			PreparedStatement ps1 = con1.prepareStatement("select * from stu where id=?");
			ps1.setInt(1, id1);
			ResultSet rs1 = ps1.executeQuery();
			if (rs1.next()) {
				e1.setId1(rs1.getString(1));
				e1.setName1(rs1.getString(2));
				e1.setAge1(rs1.getString(3));
				e1.setCourse1(rs1.getString(4));
				e1.setCity1(rs1.getString(5));
			}
			con1.close();
		} catch (Exception ex1) {
			ex1.printStackTrace();
		}

		return e1;
	}

	public static List<stu> getAllStudent() {
		List<stu> list = new ArrayList<stu>();

		try {
			Connection con1 = stuDao.getConnection();
			PreparedStatement ps1 = con1.prepareStatement("select * from stu");
			ResultSet rs1 = ps1.executeQuery();
			while (rs1.next()) {
				stu e1 = new stu();
				e1.setId1(rs1.getString(1));
				e1.setName1(rs1.getString(2));
				e1.setAge1(rs1.getString(3));
				e1.setCourse1(rs1.getString(4));
				e1.setCity1(rs1.getString(5));
				list.add(e1);
			}
			con1.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		return list;
	}

}
