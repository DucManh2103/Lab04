package Manh;
public class GiaodichDat extends Giaodich {
    private String loaiDat;
 
    public GiaodichDat() {
        super();
    }
 
    public GiaodichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }
 
    public String getLoaiDat() {
        return loaiDat;
    }
 
    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
     
    public void nhap() {
        super.nhap();
        System.out.print("Nhap loai dat (A/B/C): ");
        loaiDat = scanner.nextLine();
    }
 
    @Override
    public String toString() {
        return super.toString() + ", loai dat: " + this.loaiDat;
    }
}

