package example;

public class TenNguoiNuocNgoai extends TenNguoiViet {

	public TenNguoiNuocNgoai() {
		super();
	}

	public TenNguoiNuocNgoai(String ho, String ten) {
		super(ho, ten);
	}

	public String toString() {
		return "Fullname: " + this.getTen() + " " + this.getHo();
	}

}
