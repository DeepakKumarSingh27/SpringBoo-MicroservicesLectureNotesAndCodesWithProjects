package in.ashokit.dao;

import org.springframework.stereotype.Repository;

//@Repository("oracle") use for qualifier annotation
@Repository
public class OracleReportDaoImpl implements ReportDao {

	public OracleReportDaoImpl() {
		System.out.println("OracleReportDaoImpl :: const.");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data from Oracle db.");
		return "Report Data";
	}

}
