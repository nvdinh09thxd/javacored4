package example;

public class TenNguoiViet {
	private String ho;
	private String ten;

	public TenNguoiViet() {
		super();
	}

	public TenNguoiViet(String ho, String ten) {
		super();
		this.ho = ho;
		this.ten = ten;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String toString() {
		return "Ho va ten " + this.ho + " " + this.ten;
	}

}
