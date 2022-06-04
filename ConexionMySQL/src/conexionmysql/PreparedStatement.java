///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package conexionmysql;
//
///**
// *
// * @author Danny
// */
//public class PreparedStatement {
//
//String dbURL = "jdbc:mysql://localhost:3306/sampledb";
//		String username = "dani";
//		String password = "1234";
//                String sql = "INSERT INTO Users (username, password, fullname, email) VALUES (?, ?, ?, ?)";
// 
//PreparedStatement statement = conn.prepareStatement(sql);
//statement.setString("bill","secretpass", "Bill Gates","bill.gates@microsoft.com" );
//int rowsInserted = statement.executeUpdate();
//if (rowsInserted > 0) static {
//    System.out.println("A new user was inserted successfully!");
//
//
//    private int executeUpdate() {
//        throw new UnsupportedOperationException("Not supported yet."); 
//    }
//
//    private static class conn {
//
//        private static PreparedStatement prepareStatement(String sql) {
//            throw new UnsupportedOperationException("Not supported yet."); 
//        }
//
//        public conn() {
//        }
//    }
//
//    private static class rowsInserted {
//
//        public rowsInserted() {
//        }
//    }
//}
