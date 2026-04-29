package in.ashokit.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

//@Repository("oracle") use for qualifier annotation
@Repository
@Primary
public class MysqlReportDaoImpl implements ReportDao {

	public MysqlReportDaoImpl() {
		System.out.println("MysqlReportDaoImpl :: const.");
	}

	@Override
	public String findData() {
		System.out.println("fetching report data from mysql db.");
		return "Report Data";
	}

}
