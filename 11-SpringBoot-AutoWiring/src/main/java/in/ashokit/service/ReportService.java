package in.ashokit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.ReportDao;

@Service
public class ReportService {
	@Autowired
	private ReportDao reportDao;

	public void generateReport() {
		reportDao.findData();
		System.out.println("Generating report..");
	}

	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * private OracleReportDaoImpl reportDao1; private MysqlReportDaoImpl
	 * reportDao2;
	 * 
	 * 
	 * public ReportService() {
	 * System.out.println("ReportService :: 0 param Constructor");
	 * 
	 * }
	 */

	/*
	 * public void setReportDao1(OracleReportDaoImpl reportDao1) { this.reportDao1 =
	 * reportDao1; }
	 * 
	 * public ReportService(OracleReportDaoImpl reportDao1, MysqlReportDaoImpl
	 * reportDao2) { super(); this.reportDao1 = reportDao1; this.reportDao2 =
	 * reportDao2; }
	 * 
	 * @Autowired public void setReportDao2(MysqlReportDaoImpl reportDao2) {
	 * this.reportDao2 = reportDao2; }
	 * 
	 * @Autowired public ReportService(ReportDao reportDao) {
	 * System.out.println("ReportService :: param Constructor"); this.reportDao =
	 * reportDao; }
	 * 
	 * 
	 * @Autowired //@Qualifier("oracle") public void setReportDao(ReportDao
	 * reportDao) { System.out.println("Set ReportDao method() called..");
	 * this.reportDao = reportDao; }
	 */

}
