package com.example.javafx.Database;

import java.sql.*;
import java.util.ArrayList;

public class Database {
    private Connection connection;

    public Database() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/flight", "root", "123456");
    }

    public Database(Connection connection) {
        this.connection = connection;
    }

    public void insert(Flight flight) throws SQLException {
        String sql = "INSERT into flight_info(flightname) VALUES (\"" + flight.getFlightname() + "\");";
        Statement stmt = connection.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);

        stmt.close();
        connection.close();
    }

    public void findAll() throws SQLException {//SELECT * FROM flight_info
        String sql = "SELECT * FROM flight_info";
        PreparedStatement pstmt = connection.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        Flight flight = null;
        ArrayList<Flight> flightsList = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String flightName = rs.getString("flightname");
            flight = new Flight(id, flightName);
            flightsList.add(flight);
        }

        System.out.println(flightsList);
        rs.close();
        pstmt.close();
        connection.close();
    }

    public void findFromCity(String fromCity) throws SQLException {//SELECT * FROM `flight`.`flight_info` WHERE `from` = 'shanghai'
        String sql = "SELECT * FROM `flight`.`flight_info` WHERE `from` = '" + fromCity + "'";
        PreparedStatement pstmt = connection.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        Flight flight = null;
        ArrayList<Flight> flightsList = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("id");
            String flightName = rs.getString("flightname");
            String from = rs.getString("from");
            String to = rs.getString("to");
            int price = rs.getInt("price");
            flight = new Flight(id, flightName, from, to, price);
            flightsList.add(flight);
        }

        System.out.println(flightsList);
        rs.close();
        pstmt.close();
        connection.close();
    }

    public void findFromToCity(String fromCity, String toCity) throws SQLException {//SELECT * FROM `flight`.`flight_info` WHERE `from` = 'shanghai'
        String sql = "SELECT * FROM `flight`.`flight_info` WHERE `from` = '" + fromCity + "'";
        PreparedStatement pstmt = connection.prepareStatement(sql);

        ResultSet rs = pstmt.executeQuery();
        Flight flight = null;
        ArrayList<Flight> flightsList = new ArrayList<>();
        while (rs.next()) {
            String to = rs.getString("to");
            if (!to.equals(toCity)) continue;
            int id = rs.getInt("id");
            String flightName = rs.getString("flightname");
            String from = rs.getString("from");
            int price = rs.getInt("price");
            flight = new Flight(id, flightName, from, to, price);
            flightsList.add(flight);
        }

        System.out.println(flightsList);
        rs.close();
        pstmt.close();
        connection.close();
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Flight flight = new Flight();
        flight.setFlightname("testname");
        Database database = new Database();
        //database.insert(flight);
        database.findAll();
    }
}
