//import java.sql.DriverManager;
//
//public class Connection {
//    public static void main(String[] args) throws IOExeception, SQLException{
//        String jdbcURL = "";
//        String username = "";
//        String password = "";
//        String excelFilePath = "";
//
//        FileInputStream inputStream = new FileInputStream(excelFilePath);
//        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
//
//        XSSFSheet sheet = workbook.getSheetAt(index 0);
//        Iterator<Row> iterator = sheet.iterator();
//
//        Connection connection = DriverManager.getConnection(jdbcURL,username,password);
//         String sql = "INSERT INTO ";
//
//         Statement statement=connection.createStatement();
//
//         int rows = statement.executeUpdate(sql);
//    }
//}
