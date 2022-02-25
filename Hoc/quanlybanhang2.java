package Hoc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class KhachHang {
    private int mkh;
    private String tenkh;
    private String gioitinh;
    private String ngaysinh;
    private String diachi;
    public KhachHang(int mkh ,String tenkh, String gioitinh, String ngaysinh,String diachi) {
        this.mkh = mkh;
        this.tenkh=tenkh;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public int getMkh() {
        return mkh;
    }
    public String getTenkh() {
        return tenkh;
    }
    public String getGioitinh() {
        return gioitinh;
    }
    public String getDiachi() {
        return diachi;
    }
    public String getNgaysinh() {
        return ngaysinh;
    }
} 
class HangHoa{
    private int mahh;
    private String tenhh;
    private String donvi;
    private int giamua,giaban;
    public HangHoa(int mahh ,String tenhh, String donvi,int giamua,int giaban) {
        this.mahh = mahh;
        this.tenhh = tenhh;
        this.donvi = donvi;
        this.giaban = giaban;
        this.giamua = giamua;
    }
    public String getTenhh() {
        return tenhh;
    }
    public int getMahh() {
        return mahh;
    }
    public String getDonvi() {
        return donvi;
    }
    public int getGiamua() {
        return giamua;
    }
    public int getGiaban() {
        return giaban;
    }
}
class HoaDon{
    private int mahd;
    private String tenkh,diachi,tenhh,donvi;
    private int giamua, giaban, soluong;
    public HoaDon(int mahd, String tenkh, String diachi,String tenhh, String donvi, int giamua,int giaban,int soluong) {
        this.mahd = mahd;
        this.tenhh = tenhh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.soluong = soluong;
    }
    public int getMahd() {
        return mahd;
    }
    public void setMahd(int mahd) {
        this.mahd = mahd;
    }
    public String getTenkh() {
        return tenkh;
    }
    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }
    public String getTenhh() {
        return tenhh;
    }
    public void setTenhh(String tenhh) {
        this.tenhh = tenhh;
    }
    public String getDiachi() {
        return diachi;
    }
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public String getDonvi() {
        return donvi;
    }
    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }
    public int getGiaban() {
        return giaban;
    }
    public void setGiaban(int giaban) {
        this.giaban = giaban;
    }
    public int getGiamua() {
        return giamua;
    }
    public void setGiamua(int giamua) {
        this.giamua = giamua;
    }

    public void setEvery(int mahd, String tenkh,String diachi,String tenhh,String donvi,int giamua,int giaban,int soluong) {
        this.mahd = mahd;
        this.tenhh = tenhh;
        this.tenkh = tenkh;
        this.diachi = diachi;
        this.donvi = donvi;
        this.giamua = giamua;
        this.giaban = giaban;
        this.soluong = soluong;
    }



    public int getSoluong() {
        return soluong;
    }
    public int getThanhTien() {
        return soluong * giaban;
    }
    public int getLoinhuan() {
        return soluong * (giaban - giamua);
    }
    
    public void display() {
        System.out.print("HD");
        if(mahd < 10) System.out.print("00");
        else if(mahd < 100) System.out.print("0");
        // System.out.println(mahd+" "+tenkh+" "+diachi+" " + tenhh+" "+ donvi+ " " + giamua+" "+giaban+" "+soluong+" "+getThanhTien());
        System.out.println(mahd+" "+tenkh+" "+diachi+" " + tenhh+" "+ soluong+" "+getThanhTien()+" "+getLoinhuan());
    }
}
public class quanlybanhang2 {
    public static Scanner sc = new Scanner(System.in);
    public static int soNguyen(String s) {
        int d = 0;
        d = s.charAt(s.length()-1)-'0' + 10*(s.charAt(s.length()-2)-'0')+ 100*(s.charAt(s.length()-3)-'0');
        return d-1;
    }
    public static void main(String[] args) {
        List<KhachHang> lKhachHangs = new ArrayList<>();
        int soLuongKH = Integer.parseInt(sc.nextLine());
        // nhap khach hang
        for(int i = 0;i<soLuongKH;i++) {
            String name = sc.nextLine();
            String gender = sc.nextLine();
            String ns = sc.nextLine();
            String address = sc.nextLine();
            KhachHang kh = new KhachHang(i+1,name, gender, ns, address);
            lKhachHangs.add(kh);
        }
        int soLuongHH = Integer.parseInt(sc.nextLine());
        List<HangHoa> lHangHoas = new ArrayList<>();
        // Nhap hang hoa
        for(int i = 1;i<=soLuongHH;i++) {
            String name = sc.nextLine();
            String donvi = sc.nextLine();
            int giamua = Integer.parseInt(sc.nextLine());
            int giaban = Integer.parseInt(sc.nextLine());
            HangHoa hangHoa = new HangHoa(i, name, donvi, giamua, giaban);
            lHangHoas.add(hangHoa);
        }
        int soluongHD = Integer.parseInt(sc.nextLine());
        List <HoaDon> lHoaDons = new ArrayList<>();
        // Nhap hoa don
        for(int i = 0;i< soluongHD;i++) {
            // String nhap = sc.nextLine();
            
            String makh = sc.next();
            int kh = soNguyen(makh);
            String mahh = sc.next();
            int hh = soNguyen(mahh);         
            int soluong =Integer.parseInt(sc.next());
            HoaDon hoaDon =new HoaDon(i+1, lKhachHangs.get(kh).getTenkh(),
                lKhachHangs.get(kh).getDiachi(), lHangHoas.get(hh).getTenhh(), lHangHoas.get(hh).getDonvi(),
                lHangHoas.get(hh).getGiamua(), lHangHoas.get(hh).getGiaban(), soluong);
            lHoaDons.add(hoaDon);
            // lHoaDons.get(i).display();
        }
        for(int i = 0;i<soluongHD;i++) {
            for(int j = i+1;j<soluongHD;j++) {
                if(lHoaDons.get(i).getLoinhuan() < lHoaDons.get(j).getLoinhuan()) 
                {
                   
                    HoaDon hdm = new HoaDon(lHoaDons.get(i).getMahd(), lHoaDons.get(i).getTenkh() 
                        , lHoaDons.get(i).getDiachi(), lHoaDons.get(i).getTenhh(),lHoaDons.get(i).getDonvi(),
                        lHoaDons.get(i).getGiamua(), lHoaDons.get(i).getGiaban(), lHoaDons.get(i).getSoluong());
                    lHoaDons.get(i).setEvery(lHoaDons.get(j).getMahd(), lHoaDons.get(j).getTenkh(),lHoaDons.get(j).getDiachi(),
                    lHoaDons.get(j).getTenhh(), lHoaDons.get(j).getDonvi(), lHoaDons.get(j).getGiamua(),lHoaDons.get(j).getGiaban(),lHoaDons.get(j).getSoluong());
                    lHoaDons.get(j).setEvery(hdm.getMahd(), hdm.getTenkh(), hdm.getDiachi(), hdm.getTenhh(),hdm.getDonvi(), 
                    hdm.getGiamua(), hdm.getGiaban(), hdm.getSoluong());
                } else if(lHoaDons.get(i).getLoinhuan() == lHoaDons.get(j).getLoinhuan() && lHoaDons.get(i).getMahd() > lHoaDons.get(j).getMahd()) {
                    HoaDon hdm = new HoaDon(lHoaDons.get(i).getMahd(), lHoaDons.get(i).getTenkh() 
                        , lHoaDons.get(i).getDiachi(), lHoaDons.get(i).getTenhh(),lHoaDons.get(i).getDonvi(),
                        lHoaDons.get(i).getGiamua(), lHoaDons.get(i).getGiaban(), lHoaDons.get(i).getSoluong());
                    lHoaDons.get(i).setEvery(lHoaDons.get(j).getMahd(), lHoaDons.get(j).getTenkh(),lHoaDons.get(j).getDiachi(),
                    lHoaDons.get(j).getTenhh(), lHoaDons.get(j).getDonvi(), lHoaDons.get(j).getGiamua(),lHoaDons.get(j).getGiaban(),lHoaDons.get(j).getSoluong());
                    lHoaDons.get(j).setEvery(hdm.getMahd(), hdm.getTenkh(), hdm.getDiachi(), hdm.getTenhh(),hdm.getDonvi(), 
                    hdm.getGiamua(), hdm.getGiaban(), hdm.getSoluong());
                }
            }     

            lHoaDons.get(i).display();
        }
        
    }
}
