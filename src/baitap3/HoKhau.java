package baitap3;

import java.util.Scanner;

public class HoKhau extends NhanKhau {
	String diaChi;
	String noiCongTac;

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getNoiCongTac() {
		return noiCongTac;
	}

	public void setNoiCongTac(String noiCongTac) {
		this.noiCongTac = noiCongTac;
	}

	public HoKhau(String diaChi, String noiCongTac) {
		super();
		this.diaChi = diaChi;
		this.noiCongTac = noiCongTac;
	}

	public HoKhau() {
		super();
	}
	public void inputData() {
		super.inputData();
		Scanner sc = new Scanner(System.in);
		System.out.println("Dia chi: ");
		this.diaChi = sc.nextLine();
		System.out.print("Noi cong tac: ");
		this.noiCongTac = sc.nextLine();
	}
	public void display() {
		super.display();
		System.out.println("Dia chi: "+this.diaChi);
		System.out.println("Noi cong tac: "+this.noiCongTac);
	}
}
