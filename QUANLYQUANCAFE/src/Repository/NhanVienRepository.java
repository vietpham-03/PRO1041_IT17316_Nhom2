/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;



import DomainModels.NhanVienModel;
import Utilities.DBContext;
import ViewModels.NhanVienViewModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hdo48
 */
public class NhanVienRepository {

    public List<NhanVienViewModel> getAll() {
        String query = "SELECT dbo.NhanVien.ID, dbo.NhanVien.MaNV, dbo.NhanVien.TenNV, dbo.NhanVien.NgaySinh, dbo.NhanVien.SDT, dbo.ChucVu.TenCV\n"
                + "FROM   dbo.NhanVien INNER JOIN\n"
                + "             dbo.ChucVu ON dbo.NhanVien.IDCV = dbo.ChucVu.ID";
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<NhanVienViewModel> list = new ArrayList<>();
            while (rs.next()) {
                NhanVienViewModel nhanVienViewModel = new NhanVienViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));

                list.add(nhanVienViewModel);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(NhanVienModel nhanVien) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           (\n"
                + "           [MaNV]\n"
                + "           ,[TenNV]\n"
                + "           ,[NgaySinh]\n"
                + "           ,[SDT]\n"
                + "           ,[IDCV])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, nhanVien.getMaNV());
            ps.setObject(2, nhanVien.getTenNV());
            ps.setObject(3, nhanVien.getNgaySinh());
            ps.setObject(4, nhanVien.getSDT());
            ps.setObject(5, nhanVien.getIdCV());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String id) {
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE ID=?";
        int check = 0;
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(NhanVienModel nhanVien, String id) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET \n"
                + "      [MaNV] =? \n"
                + "      ,[TenNV] =? \n"
                + "      ,[NgaySinh] =? \n"
                + "      ,[SDT] = ?\n"
                + "      ,[IDCV] = ?\n"
                + " WHERE ID=?";
        int check = 0;
        try (Connection con = DBContext.getConnection(); PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, nhanVien.getMaNV());
            ps.setObject(2, nhanVien.getTenNV());
            ps.setObject(3, nhanVien.getNgaySinh());
            ps.setObject(4, nhanVien.getSDT());
            ps.setObject(5, nhanVien.getIdCV());
            ps.setObject(6, id);

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

 
     public List<NhanVienViewModel> timkiem(String ma) {
        String sql = "SELECT dbo.NhanVien.ID, dbo.NhanVien.MaNV, dbo.NhanVien.TenNV, dbo.NhanVien.NgaySinh, dbo.NhanVien.SDT, dbo.ChucVu.TenCV\n"
                + "FROM   dbo.NhanVien INNER JOIN\n"
                + "             dbo.ChucVu ON dbo.NhanVien.IDCV = dbo.ChucVu.ID\n"
                + "			 where MaNV=?";
        try (Connection con = DBContext.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();

            List<NhanVienViewModel> LIST = new ArrayList<>();
            while (rs.next()) {
                NhanVienViewModel nvm= new NhanVienViewModel(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
                LIST.add(nvm);

            }
            return LIST;

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;

    }
     public static void main(String[] args) {
         System.out.println(new NhanVienRepository().timkiem("manv2"));
    }

   
     
   
}