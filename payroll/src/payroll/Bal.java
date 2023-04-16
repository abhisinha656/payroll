/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package payroll;
import java.sql.*;
import db.database;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Bal {
    public void insertDataRegister(Bean beanObj){
        try{
        //query for inserting...........
//            String query = "INSERT INTO `employee` (`S.No`, `emp_id`, `emp_name`, `emp_dob`, `emp_addr`, `emp_aadhar`, `emp_pan`, `emp_Account`, `emp_ifsc`, `emp_salary`) VALUES ('1', '11121', 'aman sinha', '01072001', 'laxmisagar', '123456', '123456', '1234567', '123456er', '1234567');";
            String query = "INSERT INTO employee values (?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = database.con.prepareStatement(query);
            ps.setString(1, beanObj.getId());
            ps.setString(2, beanObj.getName());
            ps.setString(3, beanObj.getDob());
            ps.setString(4, beanObj.getAddr());
            ps.setString(5, beanObj.getAadhar());
            ps.setString(6, beanObj.getPan());
            ps.setString(7, beanObj.getAcc());
            ps.setString(8, beanObj.getIfsc());
            ps.setString(9, beanObj.getSalary());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data enterd successfully");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e);
        }
    }
}
