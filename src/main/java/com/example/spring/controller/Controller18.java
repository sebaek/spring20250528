package com.example.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main18")
public class Controller18 {

    @GetMapping("sub1")
    public String sub1(Model model) throws Exception {
        String sql = """
                SELECT *
                FROM table53
                """;

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Map<String, Object>> list = new ArrayList<>();
        while (resultSet.next()) {
            Map<String, Object> map = new HashMap<>();
            map.put("user", resultSet.getString("user"));
            map.put("money", resultSet.getInt("money"));
            list.add(map);
        }

        model.addAttribute("list", list);

        return "main18/sub1";
    }

    @PostMapping("sub2")
    public String success1(Model model) throws Exception {
        String sql1 = """
                UPDATE table53
                SET money = money - 500
                WHERE user = 'a'
                """;
        String sql2 = """
                UPDATE table53
                SET money = money + 500
                WHERE user = 'b'
                """;
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(sql1);
        statement.executeUpdate();
        PreparedStatement statement1 = connection.prepareStatement(sql2);
        statement1.executeUpdate();

        return "redirect:/main18/sub1";

    }

    @PostMapping("sub3")
    public String fail1(Model model) throws Exception {
        String sql1 = """
                UPDATE table53
                SET money = money - 500
                WHERE user = 'a'
                """;
        String sql2 = """
                UPDATE table53
                SET money = money + 500
                WHERE user = 'b'
                """;
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        PreparedStatement statement = connection.prepareStatement(sql1);
        statement.executeUpdate();

        if (true) {
            throw new Exception("네트워크 연결 끊어짐");
        }

        PreparedStatement statement1 = connection.prepareStatement(sql2);
        statement1.executeUpdate();

        return "redirect:/main18/sub1";

    }

    @PostMapping("sub4")
    public String success2(Model model) throws Exception {
        String sql1 = """
                UPDATE table53
                SET money = money - 500
                WHERE user = 'a'
                """;
        String sql2 = """
                UPDATE table53
                SET money = money + 500
                WHERE user = 'b'
                """;
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "1234";
        Connection connection = DriverManager.getConnection(url, username, password);
        connection.setAutoCommit(false);
        PreparedStatement statement = connection.prepareStatement(sql1);
        statement.executeUpdate();

        PreparedStatement statement1 = connection.prepareStatement(sql2);
        statement1.executeUpdate();

        connection.commit();

        return "redirect:/main18/sub1";

    }

    @PostMapping("sub5")
    public String fail2(Model model) {
        String sql1 = """
                UPDATE table53
                SET money = money - 500
                WHERE user = 'a'
                """;
        String sql2 = """
                UPDATE table53
                SET money = money + 500
                WHERE user = 'b'
                """;
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "1234";
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            try (connection) {
                connection.setAutoCommit(false);
                try {
                    PreparedStatement statement = connection.prepareStatement(sql1);
                    PreparedStatement statement1 = connection.prepareStatement(sql2);

                    try (statement1; statement) {
                        statement.executeUpdate();

                        if (true) {
                            throw new Exception("네트워크 오류!!");
                        }

                        statement1.executeUpdate();
                    }
                    connection.commit();
                } catch (Exception e) {
                    connection.rollback();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


        return "redirect:/main18/sub1";

    }

    @GetMapping("sub6")
    public String sub6(Model model) throws Exception {

        return "main18/sub6";
    }

    @PostMapping("sub7")
    public String sub7(Model model) throws Exception {
        // b -> a (500원)
        // 50% 확률로 성공/실패

        // b의 돈 500원 차감
        double random = Math.random();
        if (random < 0.5) {
            throw new Exception("네트워크 오류");
        }

        // a의 돈 500원 더함


        return "redirect:/main18/sub6";
    }
}
