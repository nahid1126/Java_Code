package com.LoginDatabse.company;

import com.LoginDatabse.company.Helper.DbHandler;

import java.sql.*;

public class Main {

    static private DbHandler dbHandler;
    static private Connection connection;
    static private PreparedStatement preparedStatement;

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // write your code here
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "n@hid1126");
//
//        System.out.println("Connected to the database");


        dbHandler = new DbHandler();
        connection = dbHandler.getDbconnection();

        //writeToDB();

        //readFromDB();
        updateDB("Sajon", "Mahbub", "Sajon", "Norial", 23, 3);

        deleteUser(5);
    }

    //write to the database
    public static void writeToDB() throws SQLException {
        String insert = "INSERT INTO users(firstName,lastName,username,address,age)" + "VALUES(?,?,?,?,?)";

        preparedStatement = connection.prepareStatement(insert);
        preparedStatement.setString(1, "Tareq");
        preparedStatement.setString(2, "Islam");
        preparedStatement.setString(3, "Tareq");
        preparedStatement.setString(4, "Dinajpur");
        preparedStatement.setInt(5, 23);
        preparedStatement.executeUpdate();

    }

    //read from database
    public static void readFromDB() throws SQLException {
        String quary = "Select * from users";
        PreparedStatement preparedStatement = connection.prepareStatement(quary);
        ResultSet resultSet = preparedStatement.executeQuery();

//another way to read data from database
//        Statement statement=connection.createStatement();
//        String sql = "Select * from users";
//        ResultSet resultSet=statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println("Name :" + resultSet.getString("firstName") + " Last Name :" + resultSet.getString("lastName") + " Age: " + resultSet.getString("age"));
        }
    }

    //update or change data
    public static void updateDB(String firstname, String lastname, String username, String address, int age, int ID) {
        String sql = "UPDATE users SET firstName = ?, lastName = ?, username = ?, address = ?,age = ? " + "where userID = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, address);
            preparedStatement.setInt(5, age);
            preparedStatement.setInt(6, ID);
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //delete from database
    public static void deleteUser(int ID) {
        String sql = "delete from users  where userID = ? ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, ID);
            preparedStatement.execute();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
