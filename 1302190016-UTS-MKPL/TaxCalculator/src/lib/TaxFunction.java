package lib;

public class TaxFunction {

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
	public static int calculateTax(int numberOfMonthWorking, int deductible, Income dataIncome, PersonalData dataPersonal) {
		dataIncome.setMonthlySalary(2000000);
		dataIncome.setOtherMonthlyIncome(1000000);
		dataPersonal.setIsMarried(false);
		dataPersonal.setNumberOfChildren(0);

		int tax = 0;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (dataPersonal.getNumberOfChildren() > 3) {
			dataPersonal.setNumberOfChildren(3);
		}
		
		if (dataPersonal.getIsMarried()) {
			tax = (int) Math.round(0.05 * (((dataIncome.getMonthlySalary() + dataIncome.getMonthlySalary()) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (dataPersonal.getNumberOfChildren() * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((dataIncome.getMonthlySalary() + dataIncome.getMonthlySalary()) * numberOfMonthWorking) - deductible - 54000000));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
	
}

/*
Referensi
https://www.youtube.com/watch?v=_dJKsGLZ658&t=118s (Video Pak Jati mengenai Long Parameter List)

Dibantu oleh:

>Aditya Fauzian R. P. - 1302190085
>Luqman Hadi - 1302190016
>Raja Simontua - 1302194094
>Yudistira Rashaad - 1302190028
*/