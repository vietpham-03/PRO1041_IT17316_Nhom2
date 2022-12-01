/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DomainModels.HoaDonModel;
import Utilities.DBContext;
import ViewModels.Ban;
import ViewModels.HoaDon;
import ViewModels.HoaDonChiTiet;
import ViewModels.NhanVienViewModel;
import ViewModels.SanPham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vietv
 */
public class HoaDonRepository {

    public List<HoaDon> getAll() {
        String query = "SELECT        dbo.HoaDon.MaHD, dbo.HoaDon.NgayLapHD, dbo.HoaDon.PhuongThucThanhToan, dbo.NhanVien.TenNV, dbo.Ban.TenBan, dbo.SanPham.TenSP, dbo.HoaDon.TinhTrang, dbo.SanPham.Giaban, \n"
                + "                         dbo.HoaDonChiTiet.Soluong\n"
                + "FROM            dbo.HoaDon INNER JOIN\n"
                + "                         dbo.HoaDonChiTiet ON dbo.HoaDon.ID = dbo.HoaDonChiTiet.IDHD INNER JOIN\n"
                + "                         dbo.Ban ON dbo.HoaDon.IDBan = dbo.Ban.ID INNER JOIN\n"
                + "                         dbo.NhanVien ON dbo.HoaDon.IDNV = dbo.NhanVien.ID INNER JOIN\n"
                + "                         dbo.SanPham ON dbo.HoaDonChiTiet.IDSP = dbo.SanPham.ID";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<>();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel(rs.getString(4));
                Ban Ban = new Ban(rs.getString(5));
                SanPham tensp = new SanPham(rs.getString(6), rs.getDouble(8));
                HoaDonChiTiet soluong = new HoaDonChiTiet(rs.getInt(9));
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), nv, Ban, tensp, rs.getString(7), soluong);
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public HoaDon getOne(String ma) {
        String query = "Select HoaDon.ID, MaHD,NgayLapHD,TenNV, TinhTrang\n"
                + "from HoaDon \n"
                + "inner join NhanVien on NhanVien.ID = HoaDon.IDNV where MaHD like ?";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ma);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel(rs.getString(4));
                return new HoaDon(rs.getString(1), rs.getString(2), rs.getString(3), nv, rs.getString(5));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> getAllTT() {
        String query = "Select MaHD,NgayLapHD,TenNV,TinhTrang\n"
                + "from HoaDon \n"
                + "inner join NhanVien on NhanVien.ID = HoaDon.IDNV\n"
                + "Where TinhTrang like N'Chờ'";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<>();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel(rs.getString(3));
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), nv, rs.getString(4));

                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
      public List<HoaDon> getListHD() {
        String query = "Select MaHD,NgayLapHD,ThanhTien\n"
                + "from HoaDon  \n";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<>();
            while (rs.next()) {
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), rs.getDouble(3));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public List<HoaDon> getAllTTViewHD(String id) {
        String query = "Select MaHD,NgayLapHD,TenNV, hoadon.TinhTrang\n"
                + "from HoaDon\n"
                + "inner join NhanVien on NhanVien.ID = HoaDon.IDNV\n"
                + "inner join Ban on HoaDon.IDBan = Ban.ID\n"
                + "Where IDBan like ? and hoadon.TinhTrang like N'Chờ'";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, id);
            ResultSet rs = ps.executeQuery();
            List<HoaDon> list = new ArrayList<>();
            while (rs.next()) {
                NhanVienViewModel nv = new NhanVienViewModel(rs.getString(3));
                HoaDon hd = new HoaDon(rs.getString(1), rs.getString(2), nv, rs.getString(4));
                list.add(hd);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean add(HoaDonModel hd, String ma) {
        String query = "INSERT INTO [dbo].[HoaDon]([MaHD],[NgayLapHD],[IDNV],[IDBan],[TinhTrang])\n"
                + "VALUES('HD'+?,GETDATE(),'5dc424c8-d86a-4aa9-9b6a-399678fd5ae5',?,N'Chờ')";
        int check = 0;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, hd.getNgayLapHD());
            ps.setObject(3, hd.getThanhTien());
            ps.setObject(4, hd.getPhuongThucThanhToan());
            ps.setObject(5, hd.getIDKM());
            ps.setObject(6, hd.getIDNV());
            ps.setObject(7, hd.getIDBan());

            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean update(HoaDonModel hd, String ma, String tinhTrang) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [MaHD] = ?\n"
                + "      ,[TinhTrang] = ?\n"
                + " WHERE MaHD = ?";
        int check = 0;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, tinhTrang);
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean updateSL(HoaDonModel hd, String ma, String tinhTrang) {
        String query = "UPDATE [dbo].[HoaDon]\n"
                + "   SET [MaHD] = ?\n"
                + "      ,[TinhTrang] = ?\n"
                + " WHERE MaHD = ?";
        int check = 0;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getMaHD());
            ps.setObject(2, tinhTrang);
            ps.setObject(3, ma);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean delete(String ID) {
        String query = "DELETE FROM [dbo].[HoaDon]\n"
                + "      WHERE  MaHD=?";
        int check = 0;
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ID);
            check = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public static void main(String[] args) {

        List<HoaDon> rps = new HoaDonRepository().getAll();
        for (HoaDon hoaDon : rps) {
            System.out.println(new HoaDonRepository().getAll());    
        
        }
//        HoaDonModel hd = new HoaDonModel("HD1", "1");
//        boolean add = new HoaDonRepository().update(hd, "HD1", "Huỷ");
//        System.out.println(add);
//        HoaDon hd = new HoaDonRepository().getOne("HD2");
//        System.out.println(hd);
    }

    public List<HoaDonModel> getListChuaThanhToan() {
        String query = "SELECT [ID]\n"
                + "      ,[MaHD]\n"
                + "      ,[NgayLapHD]\n"
                + "      ,[ThanhTien]\n"
                + "      ,[PhuongThucThanhToan]\n"
                + "      ,[IDNV]\n"
                + "      ,[IDKM]\n"
                + "      ,[IDBan]\n"
                + "      ,[TinhTrang]\n"
                + "  FROM [dbo].[HoaDon]\n"
                + "  where TinhTrang='Chưa thanh toán'";
        try ( Connection con = DBContext.getConnection();  PreparedStatement ps = con.prepareStatement(query)) {
            List<HoaDonModel> glistHD = new ArrayList<>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                HoaDonModel hdm = new HoaDonModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getDouble(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9));
            }
            return glistHD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

}
